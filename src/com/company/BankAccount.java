package com.company;

        public class Account {

            String name;
            int balance = 10000;

            //construct
            public Account(String myName, int myBalance) {
                this.name = myName;
                this.balance = myBalance;
            }

            public String getName() {
                return name;
            }

            public int getBalance() {
                return balance;
            }

            public String displayBalance(int pinNumber) {
                if (pinNumber == myPinCode()) {
                    return "Your balance is " + balance + " euro";
                } else {
                    return pinError();
                }
            }

            public String deposite(int pinNumber, int amount) {
                if (pinNumber == myPinCode()) {
                    balance += amount;
                    return "you deposite " + amount + " and your balance is now " + balance + " euro";
                } else {
                    return pinError();
                }

            }

            public String withdraw(int pinNumber, int amount) {
                if (pinNumber == myPinCode()) {
                    balance -= amount;
                    return "you withdraw " + amount + " and your balance is now " + balance + " euro";
                } else {
                    return pinError();
                }

            }

            private int myPinCode() {
                int myPin = 1234;
                return myPin;
            }

            private String pinError() {
                String errorMessage = "You have enter the rong pin number!";
                return errorMessage;
            }


            public static void main(String[] args) {
                com.company.Account person1 = new com.company.Account("Emerson", 10000);
                String myName = person1.getName();
                String myAccountBalance = person1.displayBalance(1234);
                String newAccountBalance = person1.deposite(1234, 500);
                String withdrawFromAccount = person1.withdraw(1234, 250);

                System.out.println(myName);
                System.out.println(newAccountBalance);
                System.out.println(withdrawFromAccount);
            }

        }











