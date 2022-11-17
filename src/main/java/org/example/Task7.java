package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Task7 {

    public static void main(String[] args) {
        //7
        System.out.println("Задача 7");

        ArrayList<Integer> lottery = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            lottery.add(i);
        }
        Collections.shuffle(lottery);
        System.out.println("Первые 10 значений лотереи");
        for (int i = 0; i < 10; i++) {
            System.out.println(lottery.get(i));
        }


    }
}
