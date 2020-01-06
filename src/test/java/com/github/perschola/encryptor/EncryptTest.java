package com.github.perschola.encryptor;

import com.github.perschola.Encryptor;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/6/2020.
 */
public class EncryptTest {
    private void test(String input, String expected) {
        Encryptor encryptor = new Encryptor();

        // when
        String actual = encryptor.encrypt(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test0() {
        String input = "a";
        String expected = "d";
        test(input, expected);
    }

    @Test
    public void test1() {
        String input = "b";
        String expected = "e";
        test(input, expected);
    }


    @Test
    public void test2() {
        String input = "c";
        String expected = "f";
        test(input, expected);
    }



    @Test
    public void test3() {
        String input = "z";
        String expected = "c";
        test(input, expected);
    }


    @Test
    public void test4(){
        //Given
        String word = "y";
        String expected = "b";
        test(word, expected);
    }


    @Test
    public void test5(){
        //Given
        String word = "x";
        String expected = "a";
        test(word, expected);
    }


    @Test
    public void test6(){
        //Given
        String word = "w";
        String expected = "z";
        test(word, expected);
    }

    @Test
    public void test7() {
        //Given
        String input = "wxyz";
        String expected = "zabc";
        test(input, expected);
    }
}
