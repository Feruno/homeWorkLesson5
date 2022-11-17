package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Task5 {
    public static void main(String[] args) {
        //5
        System.out.println("Задача 5");

        HashMap<String, Integer> cats = new HashMap<>();
        cats.put("Барсик", 7);
        cats.put("Рижик", 5);

        HashMap<String, Integer> dogs = new HashMap<>();
        dogs.put("Шарик", 4);
        dogs.put("Бобик", 8);

        HashMap<HashMap<String, Integer>, HashMap<String, Integer>> catsAndDogs = new HashMap<>();
        catsAndDogs.put(cats, dogs);

        System.out.println(catsAndDogs);


        //Эта часть кода задокументирована потому что я пытался сделать вариан где ключ был бы уникальным
        //
        /*
        HashMap<Integer, Cats> cats = new HashMap<>();
        Cats catn1 = new Cats("Барсик", 7);
        Cats catn2 = new Cats("Рижик", 5);
        cats.put(11, catn1);
        cats.put(15, catn2);
        System.out.println(cats);

        HashMap<Integer, Dogs> dogs = new HashMap<>();
        Dogs dogsn1 = new Dogs("Шарик", 4);
        Dogs dogsn2 = new Dogs("Бобик", 8);
        dogs.put(55, dogsn1);
        dogs.put(36, dogsn2);
        System.out.println(dogs);

        HashMap<HashMap<Integer, Dogs>, HashMap<Integer, Cats>> catsAndDogs = new HashMap<>();
        catsAndDogs.put(dogs, cats);
        System.out.println(catsAndDogs);
        */
    }

}

/*
    class Cats{
        String name;
        int age;

        public Cats(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    class Dogs{
        String name;
        int age;

        public Dogs(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
*/

