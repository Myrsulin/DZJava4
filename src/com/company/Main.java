package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> TeckstA = new ArrayList<String>();
        ArrayList<String> TeckstB = new ArrayList<String>();
        ArrayList<String> TeckstC = new ArrayList<String>();
        System.out.println("Выведите 5 строк ");
        for (int i = 0; i < 5; i++) {
            TeckstA.add(scanner.nextLine());

        }

        Iterator<String> iterator1 = TeckstA.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());

        }
        System.out.println("Выведите 5 строк");
        for (int i = 0; i < 5; i++) {
            TeckstB.add(scanner.nextLine());

        }
        Iterator<String> iterator2 = TeckstB.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());

        }
        System.out.println("-----------------------------------------------------------------------------");


        TeckstC.add(TeckstA.get(1));
        TeckstC.add(TeckstB.get(4));
        TeckstC.add(TeckstA.get(2));
        TeckstC.add(TeckstB.get(4));
        TeckstC.add(TeckstA.get(3));
        TeckstC.add(TeckstB.get(3));
        TeckstC.add(TeckstA.get(4));
        TeckstC.add(TeckstB.get(2));
        TeckstC.add(TeckstA.get(4));
        TeckstC.add(TeckstB.get(1));

        Iterator<String> iterator3 = TeckstC.iterator();
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
    }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        TeckstC.sort(Comparator.comparing(String::length));
        Iterator<String> iterator4 = TeckstC.iterator();
        while (iterator4.hasNext()) {
            System.out.println(iterator4.next());



}
}
}
