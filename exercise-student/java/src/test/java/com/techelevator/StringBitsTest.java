package com.techelevator;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class StringBitsTest {

    @Test
    public void Null_Expect_Empty_String() {

        StringBits exercises = new StringBits ();


        assertEquals ("", exercises.getBits (null));
    }

    @Test
    public void StringLength0_Expect_Empty_String() {

        StringBits exercises = new StringBits ();

        assertEquals ("", exercises.getBits (""));
    }

    @Test
    public void StringLength1_Expect_Same_String() {

        StringBits exercises = new StringBits ();


        assertEquals ("H", exercises.getBits ("H"));
    }

    @Test
    public void StringLength2OrMore_Expect_Alternate_Letters() {

        StringBits exercises = new StringBits ();


        assertEquals ("Js", exercises.getBits ("Josh"));
        assertEquals ("Tc lvtr", exercises.getBits ("Tech Elevator"));
    }

}
