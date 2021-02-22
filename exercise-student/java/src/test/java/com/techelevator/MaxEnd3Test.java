package com.techelevator;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class MaxEnd3Test {

    @Test
    public void End_Bigger_Test() {

        MaxEnd3 exercises = new MaxEnd3 ();

        assertArrayEquals (new int[]{3, 3, 3}, exercises.makeArray (new int[]{1, 0, 3}));
        assertArrayEquals (new int[]{3, 3, 3}, exercises.makeArray (new int[]{1, 10, 3}));
    }

    @Test
    public void Beginning_Larger_Test() {

        MaxEnd3 exercises = new MaxEnd3 ();


        assertArrayEquals (new int[]{13, 13, 13}, exercises.makeArray (new int[]{13, 0, 3}));
        assertArrayEquals (new int[]{13, 13, 13}, exercises.makeArray (new int[]{13, 20, 3}));

    }

    @Test
    public void End_Same_Size_Test() {

        MaxEnd3 exercises = new MaxEnd3 ();


        assertArrayEquals (new int[]{10, 10, 10}, exercises.makeArray (new int[]{10, 0, 10}));
        assertArrayEquals (new int[]{10, 10, 10}, exercises.makeArray (new int[]{10, 20, 10}));
    }

}
