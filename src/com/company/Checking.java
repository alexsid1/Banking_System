package com.company;

public class Checking extends Account{
    private int value;
    private int cardNum;


    public Checking(){
        value = 100;
        cardNum = 1234;
        firstName = "John";
        lastName = "Doe";
        socialSecurity = 11111111;
    }
    public Checking(int initDeposit, int card, String fName, String lName, int ss){
        value = initDeposit;
        cardNum =  card;
        firstName = fName;
        lastName = lName;
        socialSecurity = ss;
    }

    public int getCardnum(){
        return this.cardNum;
    }
    public int getValue(){
        return this.value;
    }

    public void setCardNum(int cNum){
        this.cardNum = cNum;
    }
    public void setValue(int val){
        this.value = val;
    }
    public void deposit(int put){
        value = value + put;
        System.out.println("Thank you for your deposit of " + put + ". Your account value is now " + value + ".");
    }
    public void withdrawal(int take){
        value = value + take;
        System.out.println("Thank you for your withdrawal of " + take +". Your account value is now " + value + ".");
    }
}
