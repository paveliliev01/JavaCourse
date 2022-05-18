package Person;

import Wallet.Wallet;

public class Person {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final String password;
    private final Wallet wallet = new Wallet();


    public Person(String firstName, String lastName, String socialSecurityNumber, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.wallet.addMoney(0);
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String getPassword() {
        return password;
    }

    public void depositMoney(int money) {
        wallet.addMoney(money);
    }

    public void spendMoney(int money) {
        wallet.takeMoney(money);
    }

    public int seeBalance() {
        return wallet.returnBalance();
    }

    public void depositMoneyToPerson(Person person) {

    }


}
