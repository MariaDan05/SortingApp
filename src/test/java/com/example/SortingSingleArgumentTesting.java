package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SortingSingleArgumentTesting {
    private Sorting sorting = new Sorting();

    private String[] actual;
    private String expected;

    public SortingSingleArgumentTesting(String[] actual, String expected) {
        this.actual = actual;
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
    public void testSingleArgumentCase() {
        sorting.sort(actual);
        assertEquals(expected, actual[0]);
    }

}
