package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SortingNonIntegerArgumentsTesting {
    App m = new App();

    private String[] arr;

    public SortingNonIntegerArgumentsTesting(String[] arr) {
        this.arr = arr;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { new String[] { "2", "a", "dmmd", "-1", "aaa", "2w2", "alal", "--", "+-k", "-1111", "kaka" }},
                { new String[] { "snd", "a", "4", "-1", "@@@", "1", "^%$"} },
                { new String[] { "&tt54", "&&", "hi", "bye"} },
                { new String[] { "0+n", "sks"} }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNoRootsCase() {
        m.sort(arr);
    }

}
