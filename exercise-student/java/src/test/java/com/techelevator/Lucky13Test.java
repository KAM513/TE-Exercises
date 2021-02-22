package com.techelevator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Lucky13Test {
    @Test
    public void Null_Expect_True() {

        Lucky13 lucky = new Lucky13 ();


        assertEquals (true, lucky.getLucky (null));
    }

    @Test
    public void Array_With_No_1s_Or_0s_Expect_True() {

        Lucky13 lucky = new Lucky13 ();


        assertEquals (true, lucky.getLucky (new int[]{0, 2, 4}));
        assertEquals (true, lucky.getLucky (new int[]{}));
    }

    @Test
    public void Array_With_All_1s_Or_0s_Expect_False() {

        Lucky13 lucky = new Lucky13 ();


        assertEquals (false, lucky.getLucky (new int[]{1, 1, 1}));
        assertEquals (false, lucky.getLucky (new int[]{3, 3, 3}));
        assertEquals (false, lucky.getLucky (new int[]{1, 3}));
    }

}

