import static java.lang.Math.PI;

public class Circle {
    public double radius;

    public double calcCircumference() {
        return 2 * PI * radius;
    }

    public double calcVolume() {
        var power = Math.pow(radius, 3);
        return (4 * PI * power) / 3;
    }

    public String toString() {
        return System.out.printf(
                "Circumference : %.2f%n" +
                "Volume : %.2f%n" +
                "PI value: %.2f%n",
                calcCircumference(),
                calcVolume(),
                PI)
                    .toString();
    };
}
