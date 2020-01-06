package com.github.perschola.mathutilities;

/**
 * Created by leon on 1/6/2020.
 */


import com.github.perschola.MathUtilities;
import org.junit.Assert;
import org.junit.Test;

public class DoubleAddTest {
    private static final double DELTA = 0.001;

    private void test(Double baseValue, Double valueToAdd) {
        //Given
        MathUtilities utilities = new MathUtilities();
        double expected = baseValue + valueToAdd;

        //When
        double actual = utilities.add(baseValue, valueToAdd);

        //Then
        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void test0() {
        test(1.0,4.5);
    }

    @Test
    public void test1() {
        test(5.1,10.5);
    }

    @Test
    public void test2() {
        test(1832913.2,12091.01);
    }
}