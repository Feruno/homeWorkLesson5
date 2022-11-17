package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Task4 {
    public static void main(String[] args) {
        //4
        System.out.println("Задача 4");
        ArrayList<Integer> values = new ArrayList<Integer>();
        values.add(1);
        values.add(2);
        values.add(-35);
        values.add(5);
        values.add(64);
        System.out.println(Collections.max(values));
        System.out.println(Collections.min(values));
    }
}
