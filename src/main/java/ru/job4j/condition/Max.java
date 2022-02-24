package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int third) {
        return left > max(right, third) ? left : right > third ? right : third;
    }

    public static int max(int left, int right, int third, int fourth) {
        return left > max(right, third, fourth) ? left : right > max(third, fourth) ? right : third > fourth ? third : fourth;
    }

    public static void main(String[] args) {
        int msg = Max.max(16, 8, 6, 18);
        System.out.println(msg);
    }
}
