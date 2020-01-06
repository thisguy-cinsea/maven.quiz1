package com.github.perschola.stringutilities;

import com.github.perschola.StringUtilities;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/6/2020.
 */
public class ReverseTest {


    @Test
    public void test0() {
        // Given
        StringUtilities utilities = new StringUtilities();
        String input = "Smartdust";
        String expected = "tsudtramS";

        // when
        String actual = utilities.reverse(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        // Given
        StringUtilities utilities = new StringUtilities();
        String input = "5HT";
        String expected = "TH5";

        // when
        String actual = utilities.reverse(input);

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test2() {
        // Given
        StringUtilities utilities = new StringUtilities();
        String input = "Electrogavitics";
        String expected = "scitivagortcelE";

        // when
        String actual = utilities.reverse(input);

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test3() {
        // Given
        StringUtilities utilities = new StringUtilities();
        String input = "Manipura";
        String expected = "arupinaM";

        // when
        String actual = utilities.reverse(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        // Given
        StringUtilities utilities = new StringUtilities();
        String input = "Negentropy";
        String expected = "yportnegeN";

        // when
        String actual = utilities.reverse(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReverseOfReverse1() {
        // Given
        StringUtilities utilities = new StringUtilities();
        String input = "Kundalini";
        String expected = input;

        // when
        String actual = utilities.reverse(utilities.reverse(input));

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testReverseOfReverse2() {
        // Given
        StringUtilities utilities = new StringUtilities();
        String input = "Demiurge";
        String expected = input;

        // when
        String actual = utilities.reverse(utilities.reverse(input));

        // then
        Assert.assertEquals(expected, actual);
    }
}
