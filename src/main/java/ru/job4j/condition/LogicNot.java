package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        boolean num1 = LogicNot.isEven(4);
        System.out.println(num1);
        boolean num2 = LogicNot.isPositive(7);
        System.out.println(num2);
        boolean num3 = LogicNot.notEven(3);
        System.out.println(num3);
        boolean num4 = LogicNot.notPositive(-7);
        System.out.println(num4);
        boolean num5 = LogicNot.notEvenAndPositive(2);
        System.out.println(num5);
        boolean num6 = LogicNot.evenOrNotPositive(-1);
        System.out.println(num6);
    }
}
