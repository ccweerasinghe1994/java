package com.wchamara;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(double creditLimit, String email) {
        this("ksgdfk", creditLimit, email);

    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer() {
        this("chamasra", 2323, "sdrfghfgop");
    }


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
