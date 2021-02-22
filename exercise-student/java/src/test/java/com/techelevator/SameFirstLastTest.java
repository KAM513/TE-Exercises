package com.techelevator;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class SameFirstLastTest {
    @Test
    public void Null_Expect_False() {

        SameFirstLast exercises = new SameFirstLast ();


        assertEquals (false, exercises.isItTheSame (null));
    }

    @Test
    public void ArrayLength0_Expect_False() {

        SameFirstLast exercises = new SameFirstLast ();


        assertEquals (false, exercises.isItTheSame (new int[]{}));
    }

    @Test
    public void ArrayLength1_Expect_True() {

        SameFirstLast exercises = new SameFirstLast ();


        assertEquals (true, exercises.isItTheSame (new int[]{1}));
    }

    @Test
    public void ArrayLength_Two_Or_More() {

        SameFirstLast exercises = new SameFirstLast ();


        assertEquals (true, exercises.isItTheSame (new int[]{1, 1}));
        assertEquals (true, exercises.isItTheSame (new int[]{1, 3, 1}));
        assertEquals (false, exercises.isItTheSame (new int[]{1, 3}));
        assertEquals (false, exercises.isItTheSame (new int[]{1, 3, 3}));

    }

}


