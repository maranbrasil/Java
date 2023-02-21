package util;

import static java.lang.Math.PI;

public class Calculator {

    // coloco a palavra reservada static pq pode ser calculada independentemente do objeto.
    // ou seja. No exemplo da branch class-70 ve-se que ao instanciar um ojjeto calculator (Calculator calc = new Calculator()) e pdirmos pra mostrar os dados de circunference e volume dele passando um raio igual a tres
    // e depois intanciando um objeto calc2 passando o mesmo raio 3, teremos os mesmos valores. Portanto quando um metodo retorna sempre o mesmo valor para diferentes instancias podemos dizer que o metodo é estático
    // isso quer dizer que nao será mais necessraio instanciar um objeto para obter os valores dele

    public static final double PI = 3.14159;

    public static double volume(double radius) {
        var power = Math.pow(radius, 3);
        return (4 * PI * power) / 3;
    }

    public static double circumference(double radius) {
        return 2 * PI * radius;
    }
}
