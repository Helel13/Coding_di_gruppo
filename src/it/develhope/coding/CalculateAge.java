package it.develhope.coding;

import java.time.LocalDate;

public class CalculateAge {


    private CalculateAge() {}

    public static int calculateAge ( int userAge){

        int bornYear = (LocalDate.now().getYear() - userAge);
        return bornYear;

    }






}
