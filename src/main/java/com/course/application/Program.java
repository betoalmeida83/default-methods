package com.course.application;

import com.course.service.BrazilInterestService;
import com.course.service.InterestService;
import com.course.service.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = input.nextDouble();
        System.out.print("Months: ");
        int months = input.nextInt();

        InterestService brazil = new BrazilInterestService(2.00);
        double BRinterest = brazil.payment(amount, months);

        System.out.println("\nBRAZIL:");
        System.out.println("Payment per month: R$" + String.format("%.2f",BRinterest/months));
        System.out.println("Payment after " + months + " months: R$" + String.format("%.2f",BRinterest));

        InterestService USA = new UsaInterestService(1.00);
        double USAinterest = USA.payment(amount, months);

        System.out.println("\nUSA:");
        System.out.println("Payment per month: USD" + String.format("%.2f",(USAinterest/months)/5.58));
        System.out.println("Payment after " + months + " months: USD" + String.format("%.2f",USAinterest/5.58));

        input.close();
    }
}