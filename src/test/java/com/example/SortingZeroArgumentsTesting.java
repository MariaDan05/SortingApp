package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class SortingZeroArgumentsTesting {
    App m = new App();

    private String[] arr;

    public SortingZeroArgumentsTesting(String[] arr) {
        this.arr = arr;
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
        m.sort(arr);
        assertArrayEquals(new String[] {}, arr);
    }

}
