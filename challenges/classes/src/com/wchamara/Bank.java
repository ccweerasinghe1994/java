package com.wchamara;

import org.w3c.dom.ls.LSOutput;

public class Bank {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {

        this.balance += amount;
        System.out.println("deposit of " + amount + " new balance " + this.balance);
    }

    public void withdraw(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("sorry insufficient funds");
        } else {
            this.balance -= amount;
            System.out.println("withdrawal of " + amount + " made by the customer new balance "+this.balance);

        }

    }
}
