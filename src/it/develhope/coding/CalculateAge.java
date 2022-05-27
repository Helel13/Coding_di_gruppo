package it.develhope.coding;

import java.time.LocalDate;

public class CalculateAge {


    private CalculateAge() {}

    public synchronized static int calculateAge ( int userAge){

        return (LocalDate.now().getYear() - userAge);

    }






}
