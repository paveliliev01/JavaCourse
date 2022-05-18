import Person.Person;
import Wallet.Wallet;
import bank.Bank;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        long number = 123456789;
        long newNumber = 0;
        long a;
        while (number!=0){
            a = number % 10;
            newNumber = (newNumber + a) * 10;
            number /=  10;

        }
        System.out.println(newNumber / 10);
    }
}
