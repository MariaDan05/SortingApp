package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SortingNullTesting {
    private Sorting sorting = new Sorting();

    private String[] actual;

    public SortingNullTesting(String[] actual) {
        this.actual = actual;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {null},
                {null}
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullCase() {
        sorting.sort(actual);
    }


}

