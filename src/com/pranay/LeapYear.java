package com.pranay;

public class LeapYear {

 /*int year;

    public LeapYear(int year) {
        this.year = year;
    }*/

    public boolean isLeapYear(int year) {

        if(year%4!=0)
            return false;
        if(year%100!=0)
            return true;
        if(year%400!=0)
            return false;
        return true;


    }

}
