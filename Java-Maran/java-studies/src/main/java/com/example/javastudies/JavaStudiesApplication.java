package com.example.javastudies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class JavaStudiesApplication {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Dolar price: ");
        double price = sc.nextDouble();

        System.out.print("Wanted dolar Amount: ");
        double wantedAmount = sc.nextDouble();

        double convertedCurrency = CurrencyConverter.converter(price, wantedAmount);

        System.out.printf("Total in reais needed to buy the wanted amount = %.2f", convertedCurrency);
    }
}
