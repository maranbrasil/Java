package com.example.javastudies;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class JavaStudiesApplication {
   // construtor é executado toda vez que instaciamos um objeto (new()).
   // usos comuns: iniciar valores dos atributos e recepçao de dados quando da instanciacao
   // o contrutor padrao é ex: Product prod - new Product();
   // pode-se especificar mais de um construtor para a mesma classe

    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

       // a palavra this serve para diferenciar atributos de variaveis locais, ja que elas podem tem o mesmo nome.
       // e tbm para passar o prórpio objeto como argumento na chamada de um metodo ou contrutor

       System.out.println("Enter product data: ");
       System.out.print("Name: ");

       String name = sc.nextLine(); // eu coloco variaveis temporárias aqui para que entao eu instancia a minha classe com os valores preeenchidos, uma vez que ja existe um construtor solicitando argumentos
       System.out.print("Price: ");

       double price = sc.nextDouble();
//       System.out.print("Quantity in stock: "); apago essa parte
//       int quantity = sc.nextInt();


//     sobrecarga é vc disponibilizar mais de uma versao para a mesma operacao, sendo a diferenca a quantidade de parametros


       Product product = new Product(name, price); // agora o construtor nao leva em consideracao a quantidade em estoque
       System.out.println();

       System.out.println("Product data: " + product);
       System.out.println();

       System.out.print("Enter the number of products to be added in stock: ");
       int quantity = sc.nextInt();
       product.addProducts(quantity);
       System.out.println();

       System.out.println("Updated data: " + product);
       System.out.println();

       System.out.print("Enter the number of products to be removed from stock: ");
       quantity = sc.nextInt();
       product.removeProducts(quantity);

       System.out.println();
       System.out.println("Updated data: " + product);
       sc.close();
    }
}