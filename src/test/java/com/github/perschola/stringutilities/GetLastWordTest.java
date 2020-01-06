package com.github.perschola.stringutilities;

import com.github.perschola.StringUtilities;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 1/6/2020.
 */
public class GetLastWordTest {

    @Test
    public void test1() {
        // Given
        StringUtilities utilities = new StringUtilities();
        String sentence = "We assume chemical evolution is a sufficient explanation.";
        String expected = "explanation.";

        // When
        String actual = utilities.getLastWord(sentence);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // Given
        StringUtilities utilities = new StringUtilities();
        String sentence = "What is meant by 'irreducible complexity'?";
        String expected = "complexity'?";

        // When
        String actual = utilities.getLastWord(sentence);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        // Given
        StringUtilities utilities = new StringUtilities();
        String sentence = "quantum information conservation";
        String expected = "conservation";

        // When
        String actual = utilities.getLastWord(sentence);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        // Given
        StringUtilities utilities = new StringUtilities();
        String sentence = "The universe yields geometries so elegant, they animate with intelligence.";
        String expected = "intelligence.";

        // When
        String actual = utilities.getLastWord(sentence);

        // Then
        assertEquals(expected, actual);
    }
}
