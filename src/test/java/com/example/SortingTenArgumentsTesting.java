package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class SortingTenArgumentsTesting {
    App m = new App();

    private String[] arr;
    private String[] expected;

    public SortingTenArgumentsTesting(String[] arr, String[] expected) {
        this.arr = arr;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { new String[] { "2", "3", "-1", "-4", "1", "10", "9", "3", "4", "1" }, new String[] { "-4", "-1", "1", "1", "2", "3", "3", "4", "9", "10" } },
                { new String[] { "10", "9", "8", "7", "6", "5", "4", "3", "2", "1" }, new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" } },
                { new String[] { "100", "93", "2", "12", "-3", "1", "200", "20", "122", "23" }, new String[] { "-3", "1", "2", "12", "20", "23", "93", "100", "122", "200" } },
                { new String[] { "6", "5", "4", "9", "5", "6", "8", "1", "-30", "8" }, new String[] { "-30", "1", "4", "5", "5", "6", "6", "8", "8", "9" } }
        });
    }

    @Test
    public void testNoRootsCase() {
        m.sort(arr);
        assertArrayEquals(expected, arr);
    }

}
