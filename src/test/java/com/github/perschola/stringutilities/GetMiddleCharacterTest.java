package com.github.perschola.stringutilities;

import com.github.perschola.StringUtilities;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 1/6/2020.
 */
public class GetMiddleCharacterTest {

    @Test
    public void test1() {
        //Given
        StringUtilities utilities = new StringUtilities();
        String word = "Aggadah";
        char expected = 'a';

        //When
        char actual = utilities.getMiddleCharacter(word);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        //Given
        StringUtilities utilities = new StringUtilities();
        String word = "information";
        char expected = 'm';

        //When
        char actual = utilities.getMiddleCharacter(word);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        //Given
        StringUtilities utilities = new StringUtilities();
        String word = "reification";
        char expected = 'c';

        //When
        char actual = utilities.getMiddleCharacter(word);

        //Then
        assertEquals(expected, actual);
    }


    @Test
    public void test4() {
        //Given
        StringUtilities utilities = new StringUtilities();
        String word = "ohm";
        char expected = 'h';

        //When
        char actual = utilities.getMiddleCharacter(word);

        //Then
        assertEquals(expected, actual);
    }
}
