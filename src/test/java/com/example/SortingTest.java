package com.example;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SortingTest {
    private Sorting sorting = new Sorting();

    @Test (expected = IllegalArgumentException.class)
    public void testNullCase() {
        sorting.sort(null);
    }

    @Test
    public void testEmptyCase() {
        sorting.sort(new String[]{});
    }

    @Test
    public void testSingleElementArrayCase() {
        String[] actual = { "2" };
        sorting.sort(actual);
        assertEquals("2", actual[0]);
    }

    @Test
    public void test10Arguments() {
        String[] actual = { "2", "3", "-1", "1", "5", "8", "-2", "2", "9", "1" };
        sorting.sort(actual);

        String[] expected = { "-2", "-1", "1", "1", "2", "2", "3", "5", "8", "9" };

        assertArrayEquals(expected, actual);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testMoreThan10Arguments() {
        String[] actual = { "5", "6", "3", "2", "1", "-1", "-2", "-10", "4", "10", "11", "3", "6", "7" };
        sorting.sort(actual);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testNonIntegerArguments() {
        String[] actual = { "a", "b", "c", "err+r%%" };
        sorting.sort(actual);
    }

}
