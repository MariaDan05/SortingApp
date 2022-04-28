package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SortingMoreThanTenArgumentsTesting {
    App m = new App();

    private String[] arr;

    public SortingMoreThanTenArgumentsTesting(String[] arr) {
        this.arr = arr;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { new String[] { "2", "3", "4", "-1", "2", "1", "2", "1222", "121", "-1111", "23443" }},
                { new String[] { "2", "3", "4", "-1", "2", "1", "2", "1222", "121", "-1111", "23443", "222222" } },
                { new String[] { "121212", "22", "333", "11", "22", "3", "4", "8", "3", "4", "-11", "22", "-2", "-4", "-5" } },
                { new String[] { "123", "542", "15", "1", "-22", "-123", "6", "9", "1", "2", "111", "111111" } }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNoRootsCase() {
        m.sort(arr);
    }

}
