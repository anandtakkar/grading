package com.assignment2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int num6;
        int num7;
        int percentage;

        System.out.println("Enter employee Name");
        num1 = sc.nextLine();

        System.out.println("Enter date of birth");
        num2 = sc.nextInt();

        System.out.println("Enter month of birth ");
        num3 = sc.nextInt();

        System.out.println("Enter birth year");
        num4 = sc.nextInt();

        System.out.println("Enter monthly salary");
        num5 = sc.nextInt();

        num6= 2020-num4;
        num7=num5*12;
        System.out.println("The name of the employee is " + num1);
        System.out.println("The age of the employee is " + num6);
        System.out.println("The annual salary of the employee is "+ num7);
        sc.nextLine();

        if(num7>=0 && num7<=200000){
            percentage=num7*5/100;
            System.out.println("Your tax amount is " + percentage);
        }
        else if (num7>=199999 && num7<=300000){
            percentage=num7*10/100;
            System.out.println("Your tax amount is " + percentage);
        }
        else if (num7>=299999 && num7<=400000){
            percentage=num7*15/100;
            System.out.println("Your tax amount is " + percentage);
        }
        else if (num7>=399999 && num7<=500000){
            percentage=num7*20/100;
            System.out.println("Your tax amount is " + percentage);
        }
        else {
            percentage=num7*20/100;
            System.out.println("Your tax amount is " + percentage);
        }
    }
}
