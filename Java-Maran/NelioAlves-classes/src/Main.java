import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) { //não posso chamar um metodo nao estatico dentro de um metodo estático
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        Calculator calc = new Calculator();

        double c = calc.circumference(radius);

        double v = calc.volume(radius);
        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", calc.PI);

        sc.close();
    }
}