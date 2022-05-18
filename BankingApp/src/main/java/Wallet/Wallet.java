package Wallet;

public class Wallet {
    private int money;
    private int creditMoney;

    public void addMoney(int moneyToAdd){
        money += moneyToAdd;
    }
    public void takeMoney(int moneyToTake){
        money -= moneyToTake;
    }

    public int returnBalance(){
        return money;
    }

    }
