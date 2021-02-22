package com.techelevator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FrontTimesTest {
    @Test
    public void generateString_if_length_less_3() {
        FrontTimes sut = new FrontTimes ();
        String result = sut.generateString ("Ch", 5);
        String expected = "ChChChChCh";
        Assert.assertEquals (expected, result);


    }

    @Test
    public void generateString_if_length_equal_to_3() {
        FrontTimes sut = new FrontTimes ();
        String result = sut.generateString ("Cho", 5);
        Assert.assertEquals ("ChoChoChoChoCho", result);

    }

    @Test
    public void generateString_if_length_greater_than_3() {
        FrontTimes sut = new FrontTimes ();
        String result = sut.generateString ("Choco", 4);
        Assert.assertEquals ("ChoChoChoCho", result);
    }
}
