package com.wchamara;

public class Main {

    public static void main(String[] args) {
        Bank chamara = new Bank();
        chamara.setAccountNumber(12332323);
        chamara.setCustomerName("chamara chathuranga aweerasighe");
        chamara.setEmail("ccweerasinghe@gmail.com");
        chamara.setBalance(234);

        chamara.deposit(234);

        chamara.withdraw(55);

    }
}

//output
//deposit of 234.0 new balance 468.0
//withdrawal of 55.0 made by the customer new balance 413.0
