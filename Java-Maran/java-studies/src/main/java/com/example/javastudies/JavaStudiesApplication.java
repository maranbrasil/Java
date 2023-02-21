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

       // Product product = new Product(); essa instanciaçao terá erro, ja que o construtor existente na classe demanda argumentos.

//       System.out.println(product.name);
//       System.out.println(product.price);
//       System.out.println(product.quantity);
         // ao printar esses caras acima após um objeto ser instanciado, o objeto retorna os valres padrao.
         // ou seja: para string retorna null e para double/int retorna 0

         // ja que nao faz sentido haver um produto sem nome e sem preço, podemos fazer com que o constutor exija tais valores para se instanciado

       System.out.println("Enter product data: ");
       System.out.print("Name: ");

       String name = sc.nextLine(); // eu coloco variaveis temporárias aqui para que entao eu instancia a minha classe com os valores preeenchidos, uma vez que ja existe um construtor solicitando argumentos
       System.out.print("Price: ");

       double price = sc.nextDouble();
       System.out.print("Quantity in stock: ");
       int quantity = sc.nextInt();

       Product product = new Product(name, price, quantity); // agora posso instanciar o pbjeto, pois o mesmo tem os argumentos que foram descritos no construtor da classe product
       System.out.println();

       System.out.println("Product data: " + product);
       System.out.println();

       System.out.print("Enter the number of products to be added in stock: ");
       quantity = sc.nextInt();
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