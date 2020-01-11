package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // + -
        // фикс. размер
        // однотипные данных
        ArrayList list = new ArrayList();
        list.add(1); // 0
        list.add(new Object()); // 1
        list.add("Hello"); // 2

        System.out.println(list.get(0));

        int a = (int)list.get(1);

        ArrayList<String> states = new ArrayList<>();
        states.add("Germany");
        states.add("Russia");
        
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("nnn","red"));
        cars.add(new Car("mmm","blue"));

        Account<Integer,Integer> account1 = new Account(8884443, 12122000,"Ivanov");
        Account<String,String> account2 = new Account("NM2322838","09092020","Petrov");


    }
}
