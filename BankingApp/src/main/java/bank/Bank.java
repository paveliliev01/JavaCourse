package bank;

import Person.Person;

import java.util.ArrayList;
import java.util.HashMap;

public class Bank {
    private final ArrayList<Person> clients = new ArrayList<Person>();
    private final HashMap<String, String> clientsDetails = new HashMap<>();
    private final HashMap<Person,Integer> clientsWithCredit = new HashMap<>();
    private int moneyInBank;


    public Bank() {
        this.moneyInBank = 1000;
    }
    public Person getClient(String number){
        for (Person client : clients) {
            if (client.getSocialSecurityNumber().equals(number)){
                return client;
            }
        }
        return null;
    }
    public void addClients(Person person) {
        this.clients.add(person);
        this.clientsDetails.put(person.getSocialSecurityNumber(),person.getPassword());

    }

    public void depositMoney(Person person, int money){
        person.depositMoney(money);
        this.moneyInBank += money;
    }

    public void payCredit(Person person, int money){
        if (money > clientsWithCredit.get(person) || !clientsWithCredit.containsKey(person)){
            System.out.println("You are giving too much money or you have paid your credit");
        }else {
            int a = clientsWithCredit.get(person);
            clientsWithCredit.replace(person, a -= money);

            if (clientsWithCredit.get(person) == 0){
                clientsWithCredit.remove(person);
            }
        }

    }

    public int seeBalanceInBank(){
        return moneyInBank;
    }

    public void takeCredit(int money, Person person){
        if (moneyInBank > money && money < 15000) {
            person.depositMoney(money);
            moneyInBank -= money;
            clientsWithCredit.put(person,money);

        }else {
            System.out.println("Sorry you cannot take credit from us");
        }
    }

    public boolean checkIfUserExists(String securityNumber, String password){
        return clientsDetails.containsKey(securityNumber) && clientsDetails.get(securityNumber).equals(password);
    }
}
