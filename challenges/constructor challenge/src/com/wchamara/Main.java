package com.wchamara;

public class Main {

    public static void main(String[] args) {
        VipCustomer david = new VipCustomer();
        VipCustomer secondCustomer = new VipCustomer(234423, "sdsgsg");
        VipCustomer thirdCustomer = new VipCustomer("chamara", 2331, "sdfdfgsdg");
        System.out.println("email: " + secondCustomer.getEmail() + " \nname: " + secondCustomer.getName() + "\ncredit limit: " + secondCustomer.getCreditLimit());
        System.out.println("email: " + thirdCustomer.getEmail() + " \nname: " + thirdCustomer.getName() + "\ncredit limit: " + thirdCustomer.getCreditLimit());
        System.out.println("email: " + david.getEmail() + " \nname: " + david.getName() + "\ncredit limit: " + david.getCreditLimit());
    }
}
