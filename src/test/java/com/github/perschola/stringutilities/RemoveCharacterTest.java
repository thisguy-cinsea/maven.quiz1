package com.github.perschola.stringutilities;

import com.github.perschola.StringUtilities;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 1/6/2020.
 */
public class RemoveCharacterTest {

    @Test
    public void test0() {
        // Given
        StringUtilities utilities = new StringUtilities();
        String word = "melatonin";
        String expected = "melatnin";
        char charToRemove = 'o';

        //When
        String actual = utilities.removeCharacter(word, charToRemove);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        // Given
        StringUtilities utilities = new StringUtilities();
        String word = "tryptophan";
        String expected = "rypophan";
        char charToRemove = 't';

        //When
        String actual = utilities.removeCharacter(word, charToRemove);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // Given
        StringUtilities utilities = new StringUtilities();
        String word = "hydroxytryptamine";
        String expected = "hydroytryptamine";
        char charToRemove = 'x';

        //When
        String actual = utilities.removeCharacter(word, charToRemove);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        // Given
        StringUtilities utilities = new StringUtilities();
        String word = "diethyl";
        String expected = "diethl";
        char charToRemove = 'y';

        //When
        String actual = utilities.removeCharacter(word, charToRemove);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        // Given
        StringUtilities utilities = new StringUtilities();
        String word = "methyl";
        String expected = "ethyl";
        char charToRemove = 'm';

        //When
        String actual = utilities.removeCharacter(word, charToRemove);

        //Then
        assertEquals(expected, actual);
    }

}
