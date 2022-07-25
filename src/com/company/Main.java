package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> men = new ArrayList<>();
        men.add("Tom");
        men.add("Bob");
        men.add("Jack");
        men.add("Red");
        men.add("Nur");
        System.out.println(men);


        ArrayList<String> women = new ArrayList<>();
        women.add("Amanda");
        women.add("Alice");
        women.add("Jenny");
        women.add("Julia");
        women.add("Diana");
        System.out.println(women);

        Collections.reverse(women);

        men.addAll(women);

        ArrayList<String> people = new ArrayList<>();
        int Men = 0;
        int Women = 0;

        for (int i = 0; i < (men.size()); i++) {
            if ((i % 2) == 0) {
                people.add(men.get(Men));
                Men++;

            } else {
                people.add(women.get(Women));
                Women++;
            }
        }
        System.out.println("Список: " + people);

        people.sort(Comparator.comparing(String::length));
       
    }
}




