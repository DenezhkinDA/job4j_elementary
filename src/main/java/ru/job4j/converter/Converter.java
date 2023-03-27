package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = rubleToDollar(600);
        System.out.println("600 rubles are " + dollar + " dollars.");
        float in = 140;
        float expected = 2;
        float out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 Euro. Test results : " + passed);
        float inD = 600;
        float expectedD = 10;
        float outD = rubleToDollar(inD);
        boolean passedD = expectedD == outD;
        System.out.println("600 rubles are 10 Dollars. Test results : " + passedD);
        }
    }

