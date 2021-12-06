package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        List<String> lista = new Szkopek_List<String>();

        System.out.println(lista.isEmpty());

        lista.add("Ala");
        System.out.println(lista.get(0));

        System.out.println("Zawieranie");
        System.out.println(lista.contains("Ala"));
        System.out.println(lista.contains("Test"));

        System.out.println("Czy pusta po dodaniu elementu");
        System.out.println(lista.isEmpty());

        lista.clear();
        System.out.println("Po czyszczeniu");
        System.out.println(lista.isEmpty());
        System.out.println(lista.get(0));

        lista.add("Ala");
        System.out.println(lista.get(0));
        System.out.println("Po usunieciu jednego elementu po obiekcie");
        lista.remove("Ala");
        System.out.println(lista.get(0));

        System.out.println("Dodanie elementu po usunieciu innego");
        lista.add("Bartek");
        System.out.println(lista.get(0));
        lista.add("Tomek");
        lista.add("Ola");
        lista.add("Rafał");
        System.out.println(Arrays.toString(lista.toArray()));

        System.out.println("Po usunieciu jednego elementu po obiekcie");
        lista.remove("Tomek");
        System.out.println(Arrays.toString(lista.toArray()));

        System.out.println("Po usunieciu jednego elementu po indeksie");
        lista.remove(0);
        System.out.println(Arrays.toString(lista.toArray()));

        //System.out.println("Po usunieciu jednego elementu po indeksie");
        //System.out.println(lista.remove(2));
        //System.out.println(Arrays.toString(lista.toArray()));
    }
}
