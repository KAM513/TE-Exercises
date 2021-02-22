package com.techelevator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Less20Test {
    @Test
    public void isLessThanMultipleOf20_returns_true_if_n_is_less_than_multiple_of_20() {

        Less20 sut = new Less20 ();
        boolean value = sut.isLessThanMultipleOf20 (19);
        Assert.assertTrue (true);
    }

    @Test
    public void isLessThanMultipleOf20_returns_false_if_n_is_more_than_multiple_of_20() {

        Less20 sut = new Less20 ();
        boolean value = sut.isLessThanMultipleOf20 (21);
        Assert.assertFalse (false);
    }
}
