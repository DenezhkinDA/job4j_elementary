package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = x2 - x1;
        double second = y2 - y1;
        double third = Math.pow(first, 2);
        double fouth = Math.pow(second, 2);
        double five = third + fouth;
        double rsl = Math.sqrt(five);
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result1);
        double result2 = Point.distance(1, 3, 5, 7);
        System.out.println("result (1, 3) to (5, 7) " + result2);
        double result3 = Point.distance(5, 8, 7, 9);
        System.out.println("result (5, 8) to (7, 9) " + result3);

    }
}
