package ru.job4j.primer;

public class Zero {
    public static void out(int price) {
        int rsl = 0;
        for (int index = 1; index <= 5; index++) {
            rsl = price * index;
        }
    }
}