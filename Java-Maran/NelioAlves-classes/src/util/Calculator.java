package util;

import static java.lang.Math.PI;

public class Calculator { // como a classe calculator nao é statica, nao preciso deixar os membros staticos
    public static final double PI = 3.14159;

    public double volume(double radius) {
        var power = Math.pow(radius, 3);
        return (4 * PI * power) / 3;
    }

    public double circumference(double radius) {
        return 2 * PI * radius;
    }
}
