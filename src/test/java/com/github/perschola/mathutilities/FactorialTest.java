package com.github.perschola.mathutilities;

import com.github.perschola.MathUtilities;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/5/2020.
 */
public class FactorialTest {
    //given
    private void test(Integer inputVal, Integer expected) {
        MathUtilities mathUtilities = new MathUtilities();

        // when
        Integer actual = mathUtilities.factorial(inputVal);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test0() {
        test(0, 1);
    }

    @Test
    public void test1() {
        test(1, 1);
    }

    @Test
    public void test2() {
        test(2, 2);
    }

    @Test
    public void test3() {
        test(3, 6);
    }

    @Test
    public void test4() {
        test(4, 24);
    }

    @Test
    public void test5() {
        test(15, 2004310016);
    }

    @Test
    public void test6() {
        test(15, 2004310016);
    }
}
