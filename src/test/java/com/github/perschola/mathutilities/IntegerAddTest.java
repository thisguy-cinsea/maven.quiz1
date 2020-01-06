package com.github.perschola.mathutilities;

/**
 * Created by leon on 1/6/2020.
 */


import com.github.perschola.MathUtilities;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerAddTest {

    private void test(Integer baseValue, Integer valueToAdd) {
        //Given
        MathUtilities utilities = new MathUtilities();
        int expected = baseValue + valueToAdd;

        //When
        int actual = utilities.add(baseValue, valueToAdd);

        //Then
        assertEquals(expected, actual);
    }
    @Test
    public void test0() {
        test(1,4);
    }

    @Test
    public void test1() {
        test(5,10);
    }

    @Test
    public void test2() {
        test(1832913,12091);
    }
}