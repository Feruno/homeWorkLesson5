package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Task2 {
    public static void main(String[] args) {
        //2
        System.out.println("Задача 2");
        ArrayList<String> textValues = new ArrayList<String>();
        textValues.add("Поиграть в DMC?");
        textValues.add("Сыграть в ведьмака?");
        textValues.add("Надо поспать!");

        System.out.println(textValues);

        Collections.sort(textValues);
        System.out.println(textValues);

        Collections.reverse(textValues);
        System.out.println(textValues);

        textValues.clear();
        System.out.println(textValues);
    }
}
