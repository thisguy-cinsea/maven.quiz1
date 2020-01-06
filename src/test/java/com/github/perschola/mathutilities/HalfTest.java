package com.github.perschola.mathutilities;

import com.github.perschola.MathUtilities;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/6/2020.
 */
public class HalfTest {
    private static final double DELTA = 0.001;

    // given
    private void test(Integer number, Double expected) {
        MathUtilities mathUtilities = new MathUtilities();

        // when
        Double actual = mathUtilities.half(number);

        // then
        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void test0() {
        test(0, 0.0);
    }
    @Test
    public void test1() {
        test(1, 0.5);
    }

    @Test
    public void test2() {
        test(2, 1.0);
    }
}
