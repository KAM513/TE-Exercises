package com.techelevator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DateFashionTests {

    @Test
    public void getATable_returns_2_if_you_and_date_are_above_8() {
        DateFashion sut = new DateFashion ();
        int score = sut.getATable (5, 10);

        Assert.assertEquals (2, score);
    }

    @Test
    public void getATable_returns_0_if_either_less_than_2() {
        DateFashion sut = new DateFashion ();
        int score = sut.getATable (5, 2);

        Assert.assertEquals (0, score);

    }


}
