package com.example;

import org.junit.Test;
import com.example.App;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class AppTest {
    App sorting = new App();

    @Test
    public void testEmptyCase() {
        sorting.sort(new String[]{});
    }

    @Test
    public void testSingleElementArrayCase() {
        String[] arr = { "2" };
        sorting.sort(arr);
        assertEquals("2", arr[0]);
    }

    @Test
    public void test10Arguments() {
        String[] arr = { "2", "3", "-1", "1", "5", "8", "-2", "2", "9", "1" };
        sorting.sort(arr);

        String[] ans = { "-2", "-1", "1", "1", "2", "2", "3", "5", "8", "9" };

        assertArrayEquals(ans, arr);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMoreThan10Arguments() {
        String[] arr = { "5", "6", "3", "2", "1", "-1", "-2", "-10", "4", "10", "11", "3", "6", "7" };
        sorting.sort(arr);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNonIntegerArguments() {
        String[] arr = { "a", "b", "c", "err+r%%" };
        sorting.sort(arr);
    }

}
