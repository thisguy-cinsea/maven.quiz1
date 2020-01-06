package com.github.perschola.stringutilities;

import com.github.perschola.StringUtilities;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/6/2020.
 */
public class ConcatentateTest {
    @Test
    public void test0() {
        // given
        StringUtilities stringUtils = new StringUtilities();
        String expected = "StarTetrahedron";
        String baseValue = "Star";
        String valueToBeAdded = "Tetrahedron";
        // when
        String actual = stringUtils.concatenate(baseValue, valueToBeAdded);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        // given
        StringUtilities stringUtils = new StringUtilities();
        String expected = "Metatron'sCube";
        String baseValue = "Metatron's";
        String valueToBeAdded = "Cube";

        // when
        String actual = stringUtils.concatenate(baseValue, valueToBeAdded);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        StringUtilities stringUtils = new StringUtilities();
        String expected = "NebuchadnezzarII";
        String baseValue = "Nebuchadnezzar";
        String valueToBeAdded = "II";

        // when
        String actual = stringUtils.concatenate(baseValue, valueToBeAdded);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        // given
        StringUtilities stringUtils = new StringUtilities();
        String expected = "StellatedOctahedron";
        String baseValue = "Stellated";
        String valueToBeAdded = "Octahedron";

        // when
        String actual = stringUtils.concatenate(baseValue, valueToBeAdded);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        // given
        StringUtilities stringUtils = new StringUtilities();
        String expected = "DracosConstellation";
        String baseValue = "Dracos";
        String valueToBeAdded = "Constellation";

        // when
        String actual = stringUtils.concatenate(baseValue, valueToBeAdded);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        // given
        StringUtilities stringUtils = new StringUtilities();
        String expected = "HeartHarmonics";
        String baseValue = "Heart";
        String valueToBeAdded = "Harmonics";

        // when
        String actual = stringUtils.concatenate(baseValue, valueToBeAdded);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        // given
        StringUtilities stringUtils = new StringUtilities();
        String expected = "ZetaReticuli";
        String baseValue = "Zeta";
        String valueToBeAdded = "Reticuli";

        // when
        String actual = stringUtils.concatenate(baseValue, valueToBeAdded);

        // then
        Assert.assertEquals(expected, actual);
    }

}
