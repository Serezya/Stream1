package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> listEnd = new ArrayList<>();
        for (int i : intList) {
            if (i > 0) {
                if (i % 2 == 0)
                    listEnd.add(i);
            }
        }
        Collections.sort(listEnd);
        System.out.println(listEnd);
        System.out.println("\n----- Теперь со стримами -----");
        StreamMain.main();
    }
}
