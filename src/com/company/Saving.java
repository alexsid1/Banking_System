package com.company;

public class Saving extends Account{
    private int value;
    private final double interest = .001;


    public Saving(){
        value = 100;
    }
    public Saving(int initDeposit, String fName, String lName, int ss){
        value = initDeposit;

        firstName = fName;
        lastName = lName;
        socialSecurity = ss;
    }

    public void setValue(int val){
        this.value = val;
    }

    public int getValue(){
        return this.value;
    }
    public double getInterest(){
        return this.interest;
    }


    public void Deposit(int put){
        value = value + put;
        System.out.println("Thank you for your deposit of " + put + ". Your account value is now " + value + ".");
    }
    public void withdrawal(int take){
        value = value + take;
        System.out.println("Thank you for your withdrawal of " + take +". Your account value is now " + value + ".");
    }
}
