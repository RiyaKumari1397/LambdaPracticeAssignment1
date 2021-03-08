package com.knoldus;

import java.util.Scanner;

public class MaxOfTwoNumbersMain {
    public static void main(String[] args) {
        MaxOfTwoNumbers obj = new MaxOfTwoNumbers();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Values");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = obj.getMax(a, b);
        System.out.println("maximum number is " +max);
    }
}
