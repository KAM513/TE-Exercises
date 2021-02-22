package com.techelevator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AnimalGroupNameTest {
    @Test
    public void Provide_Known_Animal_Name_Expect_Known_Group_Name() {

        AnimalGroupName animalGroup = new AnimalGroupName ();


        String herdName = animalGroup.getHerd ("giraffe");


        assertEquals ("Tower", herdName);
    }

    @Test
    public void Provide_Known_Animal_Name_WrongCase_Expect_Known_Group_Name() {

        AnimalGroupName animalGroup = new AnimalGroupName ();


        String herdName = animalGroup.getHerd ("GiRAffe");


        assertEquals ("Tower", herdName);
    }

    @Test
    public void Provide_Unknown_Animal_Name_Expect_Unknown_Group_Name() {

        AnimalGroupName animalGroup = new AnimalGroupName ();


        String herdName = animalGroup.getHerd ("");
        String steve = "elephants";

        String herdName2 = animalGroup.getHerd (steve);


        assertEquals ("unknown", herdName);
        assertEquals ("unknown", herdName2);
    }

    @Test
    public void Provide_Null_Unknown_Group_Name() {

        AnimalGroupName animalGroup = new AnimalGroupName ();

       String herdName = animalGroup.getHerd(null);


        assertEquals ("unknown", herdName);
    }

}

