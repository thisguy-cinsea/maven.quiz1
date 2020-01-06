package com.github.perschola.mathutilities;

import com.github.perschola.MathUtilities;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/6/2020.
 */
public class SquareTest {
    // given
    private void test(Integer input, Integer expected) {
        MathUtilities mathUtilities = new MathUtilities();

        // when
        Integer actual = mathUtilities.square(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test0() {
        test(0, 0);
    }

    @Test
    public void test1() {
        test(1, 1);
    }

    @Test
    public void test2() {
        test(2,4);
    }

    @Test
    public void test3() {
        test(10,100);
    }
    @Test
    public void test4() {
        test(12,144);
    }
}
