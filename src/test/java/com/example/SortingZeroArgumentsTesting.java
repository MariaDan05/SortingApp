package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class SortingZeroArgumentsTesting {
    private Sorting sorting = new Sorting();

    private String[] actual;

    public SortingZeroArgumentsTesting(String[] actual) {
        this.actual = actual;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { new String[] {} },
                { new String[] {} }
        });
    }

    @Test
    public void testNoRootsCase() {
        sorting.sort(actual);
        assertArrayEquals(new String[] {}, actual);
    }

}
