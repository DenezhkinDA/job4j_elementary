package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {3, 5, 7, 1, 8};
        int[] result = Turn.back(input);
        int[] expected = new int[] {8, 1, 7, 5, 3};
        Assert.assertArrayEquals(expected, result);
    }
}
