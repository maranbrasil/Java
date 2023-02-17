import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.PI;

public class Main {
    public static final double PI = 3.14159;

    public static void main(String[] args) { //não posso chamar um metodo nao estatico dentro de um metodo estático
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circumference(radius);

        double v = volume(radius);
        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", PI);

        sc.close();
    }

    private static double volume(double radius) {
        var power = Math.pow(radius, 3);
        return (4 * PI * power) / 3;
    }

    private static double circumference(double radius) {
        return 2 * PI * radius;
    }
}