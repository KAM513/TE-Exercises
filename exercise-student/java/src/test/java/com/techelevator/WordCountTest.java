package com.techelevator;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class WordCountTest {
    @Test
    public void Null_Expect_Empty_Set() {

        WordCount exercises = new WordCount ();


        assertEquals (new HashMap <String, Integer> (), exercises.getCount (null));
    }

    @Test
    public void EmptySetTest_Expect_Empty_Set() {

        WordCount exercises = new WordCount ();


        assertEquals (new HashMap <String, Integer> (), exercises.getCount (new String[]{}));
    }

    @Test
    public void UniqueTest_Expect_1Each() {

        WordCount exercises = new WordCount ();

        Map <String, Integer> expected = new HashMap <> ();
        expected.put ("Josh", 1);
        expected.put ("David", 1);
        expected.put ("Casey", 1);
        expected.put ("Craig", 1);


        assertEquals (expected, exercises.getCount (new String[]{"Josh", "David", "Casey", "Craig"}));
    }

    @Test
    public void Repeat_Word_Test() {

        WordCount exercises = new WordCount ();

        Map <String, Integer> expected = new HashMap <> ();
        expected.put ("Josh", 4);


        assertEquals (expected, exercises.getCount (new String[]{"Josh", "Josh", "Josh", "Josh"}));
    }

    @Test
    public void Word_Not_Provided_Tests() {

        WordCount exercises = new WordCount ();

        Map <String, Integer> expected = new HashMap <> ();
        expected.put ("Josh", 4);


        assertNotEquals (expected, exercises.getCount (new String[]{"Craig", "Craig", "Craig", "Craig"}));
    }
}

