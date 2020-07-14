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
        int buf;
        for (int i = listEnd.size() - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (listEnd.get(j) > listEnd.get(j + 1)) {
                    buf = listEnd.get(j + 1);
                    listEnd.set(j + 1, listEnd.get(j));
                    listEnd.set(j, buf);
                }
            }
        }
        System.out.println(listEnd);
        System.out.println("\n----- Теперь со стримами -----");
        StreamMain.main();
    }
}
