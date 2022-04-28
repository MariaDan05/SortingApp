package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SortingSingleArgumentTesting {
    App m = new App();

    private String[] arr;
    private String expected;

    public SortingSingleArgumentTesting(String[] arr, String expected) {
        this.arr = arr;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { new String[] { "4" }, "4" },
                { new String[] { "12" }, "12" },
                { new String[] { "-1" }, "-1" },
                { new String[] { "-2" }, "-2" },
                { new String[] { "3" }, "3" }
        });
    }

    @Test
    public void testNoRootsCase() {
        m.sort(arr);
        assertEquals(expected, arr[0]);
    }

}
