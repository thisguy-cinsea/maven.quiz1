package com.github.perschola.stringutilities;

import com.github.perschola.StringUtilities;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/6/2020.
 */
public class ReturnInputTest {
    // given
    private void test(String input) {
        StringUtilities stringUtilities = new StringUtilities();

        // when
        String actual = stringUtilities.returnInput(input);

        // then
        Assert.assertEquals(input, actual);
    }

    @Test
    public void test0() {
        test("Hey");
    }

    @Test
    public void test1() {
        test("Hello world");
    }

    @Test
    public void test2() {
        test("The quick brown fox");
    }

    @Test
    public void test3() {
        test("Jumps over the lazy dog");
    }

    @Test
    public void test4() {
        test("Five easy test cases");
    }

    @Test
    public void test5() {
        test("The universe yields geometries so elegant, they animate with intelligence.");
    }
}
