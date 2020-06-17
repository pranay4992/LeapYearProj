package com.pranay;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the year");
        Scanner Sc = new Scanner(System.in);
        LeapYear L = new LeapYear();
        System.out.println(L.isLeapYear(Sc.nextInt()));




    }
}
