package br.com.manoellimadev.javastudying.oop.staticmodifier.domain;

public class Account {
    public static double transfLimit = 1500.00;
    private double balance;
    private String name;
    private String personId;
//    static{
//        System.out.println("Initializing Accounts...");
//    }
    public Account() {
        this.balance = 0;
        this.name = "";
        this.personId = "";
    }

    public Account(String name, String personId) {
        this.name = name;
        this.personId = personId;
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public void transfer(int value){
        if(value>Account.transfLimit) return;
        this.balance+=value;
    }

    public static void setTransfLimit(double transfLimit){
        Account.transfLimit = transfLimit;
    }

    public static double getTransfLimit(){
        return Account.transfLimit;
    }
    public void print(){
        System.out.println("Name: "+ this.name +". Ballance: $"+this.balance);
        System.out.println("Transfer Limit: $"+ transfLimit);
    }
}
