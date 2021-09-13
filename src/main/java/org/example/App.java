/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Maria Quiros
 */

/*Declaring package*/
package org.example;

/*Importing scanner class*/
import java.util.Scanner;
import java.lang.Math;

/*Specifying class*/
public class App {
    public static void main(String[] args) {

        /*Creating a scanner object*/
        Scanner scan = new Scanner(System.in);

        /*Initializing variables*/
        float principal;
        float rateInterest;
        float numberYears;
        float numberTimes;
        float newRateInterest;
        float amount;
        float numTimesYears;
        float expAmount;
        float totalAmount;


        /*Prompting for principal*/
        System.out.println("What is the principal amount?");
        principal = scan.nextFloat();

        /*Prompting for rate of interest*/
        System.out.println("What is the rate?");
        rateInterest = scan.nextFloat();

        /*Prompting for number of years*/
        System.out.println("What is the number of years?");
        numberYears = scan.nextFloat();

        /*Prompting for number of times the interest is compounded per year*/
        System.out.println("What is the number of times the interest is compounded per year?");
        numberTimes = scan.nextFloat();

        /*Dividing the interest rate by 10*/
        newRateInterest = (rateInterest / 10);

        /*Calculating the first part of the formula*/
        amount = (1 + (((newRateInterest / 100) / numberTimes)));

        /*Multiplying the number of times the interest is compounded by the number of years*/
        numTimesYears = (numberTimes * numberYears);

        /*Calculating the exponent*/
        expAmount = (float) Math.pow(amount, numTimesYears);

        /*Multiplying the principal by the exponent amount*/
        totalAmount = (principal * expAmount);

        /*Displaying the value of an investment compounded over time*/
        System.out.printf("$%.0f invested at %.1f%% for %.0f years compounded %.0f times per year is $%.2f.", +principal, +newRateInterest, +numberYears, +numberTimes, +totalAmount);
    }
}