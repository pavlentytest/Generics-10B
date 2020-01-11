package com.company;

public class Account<T,D> {
    private T id;
    private D borndate;
    private String name;
    Account(T i, D b, String n) {
        this.id = i;
        this.name = n;
        this.borndate = b;
    }

}
