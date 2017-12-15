package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Checking[] checkArray = new Checking[3];
        Saving[] saveArray = new Saving[3];
	System.out.println("Hello, and welcome to Capital 147!");
        System.out.println("What is your first name?");
        String fName = scan.next();
        System.out.println("What is your last name?");
        String lName = scan.next();
        System.out.println("What is your social security number?");
        int ss = scan.nextInt();

    int choice2 = 100;
    while (choice2 != 0) {
        System.out.println("How would you like to proceed?");
        System.out.println("1. Saving\n2. Checking\n3. Set up a new account\n(0 to Exit)");
        choice2 = scan.nextInt();

        switch (choice2){
            case 0:
                break;
            case 1:
                if(saveArray[0] == null) {
                    System.out.println("You dont have a savings account yet");
                    break;
                }
                System.out.println("1. Check balance\n2. Check interest\n3. Deposit\n4. Withdrawal\n (0 to Exit)");
                int choice3 = scan.nextInt();
                switch(choice3){
                    case 1:
                        System.out.println("Your current balance is: " + saveArray[0].getValue());
                        break;
                    case 2:
                        System.out.println("Your current interest is " + saveArray[0].getInterest() + "%");
                        break;
                    case 3:
                        System.out.println("How much would you like to deposit?");
                        int dep = scan.nextInt();
                        while(dep < 0) {
                            System.out.println("Deposit must be greater than 0. Enter a different value");
                            dep = scan.nextInt();
                        }
                        saveArray[0].setValue(saveArray[0].getValue() + dep);
                        System.out.println("Your current account value is now: " + saveArray[0].getValue());
                        break;
                    case 4:
                        System.out.println("How much would you like to withdrawal?");
                        int with = scan.nextInt();
                        while(with > saveArray[0].getValue()) {
                            System.out.println("Withdrawal must be less than account value. Enter a different value");
                            with = scan.nextInt();
                        }
                        saveArray[0].setValue(saveArray[0].getValue() - with);
                        System.out.println("Your current account value is now: " + saveArray[0].getValue());
                        break;
                    default:
                        break;
                } break;
            case 2:
                if (checkArray[0] == null) {
                    System.out.println("You dont have a checking account yet");
                    break;
                }
                System.out.println("1. Check balance\n2. Check debit card number\n3. Deposit\n4. Withdrawal\n (0 to Exit)");
                int choice4 = scan.nextInt();
                switch(choice4){
                    case 1:
                        System.out.println("Your current balance is: " + checkArray[0].getValue());
                        break;
                    case 2:
                        System.out.println("Your debit card number is: " +checkArray[0].getCardnum());
                        break;
                    case 3:
                        System.out.println("How much would you like to deposit?");
                        int dep = scan.nextInt();
                        while(dep < 0) {
                            System.out.println("Deposit must be greater than 0. Enter a different value");
                            dep = scan.nextInt();
                        }
                        checkArray[0].setValue(checkArray[0].getValue() + dep);
                        System.out.println("Your current account value is now: " + checkArray[0].getValue());
                        break;
                    case 4:
                        System.out.println("How much would you like to withdrawal?");
                        int with = scan.nextInt();
                        while(with > checkArray[0].getValue()) {
                            System.out.println("Withdrawal must be less than account value. Enter a different value");
                            with = scan.nextInt();
                        }
                        checkArray[0].setValue(checkArray[0].getValue() - with);
                        System.out.println("Your current account value is now: " + checkArray[0].getValue());
                        break;
                    default:
                        break;
                }break;
            case 3:
                System.out.println("What kind of account would you like to set up today?");
                System.out.println("1. Set up a Checking Account\n2. Set up a Savings account");
                int choice = scan.nextInt();

                switch (choice){
                    case 1:
                        System.out.println("Thank you for choosing to set up a checking account with us today!");
                        System.out.println("What is the initial deposit you would like make? (must be at least $100)");
                        int initDeposit = scan.nextInt();
                        while(initDeposit < 100){
                            System.out.println("Your first deposit must be at least $100. Please enter a higher value.");
                            initDeposit = scan.nextInt();
                        }
                        Random cardNum = new Random();
                        int card = 1000 + cardNum.nextInt(1000);
                        Checking checkOne = new Checking(initDeposit, card, fName, lName, ss);
                        checkArray[0]= checkOne;
                        System.out.println("Your checking account is now set up and ready to be used!");
                        break;
                    case 2:
                        System.out.println("Thank you for choosing to set up a savings account with us today!");
                        System.out.println("What is the initial deposit you would like make? (must be at least $100)");
                        initDeposit = scan.nextInt();
                        while(initDeposit < 100){
                            System.out.println("Your first deposit must be at least $100. Please enter a higher value.");
                            initDeposit = scan.nextInt();
                        }

                        Saving saveOne = new Saving(initDeposit, fName, lName, ss);
                        saveArray[0] = saveOne;
                        System.out.println("Your savings account is now set up and ready to be used!");
                        break;

                }
        }
        if(choice2 != 0)
            choice2 = 100;
    }
    System.out.println("Thank you for choosing Capital 147 bank. We hope to see you again soon!");
    }
}
