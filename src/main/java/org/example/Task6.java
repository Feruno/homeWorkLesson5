package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task6 {
    public static void main(String[] args) {
        //6
        System.out.println("Задача 6");
        String mercury = "Меркурий";
        String venus = "Венера";
        String earth = "Земля";
        String mars = "Марс";
        String jupiter = "Юпитер";
        String saturn = "Сатурн";
        String neptune = "Нептун";
        String uranus = "Уран";

        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars,
                jupiter, saturn, neptune, uranus));
        System.out.println(solarSystem);
        Collections.swap(solarSystem, 6,7);
        //solarSystem.set(6, uranus);
        //solarSystem.set(7, neptune);
        System.out.println(solarSystem);
    }
}
