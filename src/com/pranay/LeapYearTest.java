package com.pranay;

import static org.junit.Assert.*;

public class LeapYearTest {

    /* @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }*/

    @org.junit.Test
    public void isLeapYear() {
        LeapYear L = new LeapYear();
        assertTrue(L.isLeapYear(120));
    }
}