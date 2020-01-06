package com.github.perschola.encryptor;

import com.github.perschola.Encryptor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 1/6/2020.
 */
public class AcronymTest {
    private void test(String phrase, String expected) {
        //Given
        Encryptor encryptor = new Encryptor();

        //When
        String actual = encryptor.acronym(phrase);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        String phrase = "Portable Network Graphics";
        String expected = "PNG";
        test(phrase, expected);
    }

    @Test
    public void test2() {
        //Given
        String phrase = "Ruby on Rails";
        String expected = "ROR";
        test(phrase, expected);
    }

    @Test
    public void test3() {
        //Given
        String phrase = "First In, First Out";
        String expected = "FIFO";
        test(phrase, expected);
    }

    public void test6() {
        // given
        String phrase = "Center Disease Control Whistle Blower";
        String expected = "CDCWB";
        test(phrase, expected);
    }

    public void test7() {
        // given
        String phrase = "Tuskegee Macon County, Alabama";
        String expected = "TMCA";
        test(phrase, expected);
    }

    public void test8() {
        // given
        String phrase = "John Charles Cutler";
        String expected = "JCC";
        test(phrase, expected);
    }

    @Test
    public void test9() {
        // Given
        String phrase = "digital immunity infrastructure";
        String expected = "DII";
        test(phrase, expected);
    }

    public void test4() {
        // given
        String phrase = "Tactical Reconnaissance Nuclear Powered Aerospace Platform";
        String expected = "TRNPAP";
        test(phrase, expected);
    }
}
