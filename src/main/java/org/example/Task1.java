package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) {
        //1
        System.out.println("Задача 1");
        ArrayList<Integer> numericValues = new ArrayList<Integer>();
        numericValues.add(1);
        numericValues.add(7);
        numericValues.add(5);
        numericValues.add(20);
        numericValues.add(14);
        System.out.println(numericValues);

        Collections.sort(numericValues);
        System.out.println(numericValues);

        Collections.reverse(numericValues);
        System.out.println(numericValues);

        numericValues.clear();
        System.out.println(numericValues);
    }
}
