package com.example.javastudies;

public class Product {
    public String name;
    public double price;
    public int quantity;

    // o construtor abaixo vai obrigar a fornecer nome, preco e quantidade
    public Product(String name, double price, int quantity) {
        this.name = name; // sisgnifica que o atributo do objeto (aquele descrito no comeco dessa classe) receba o valor do name que u eu passei via argumento.
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) { // aqui é um outro construtor que nao recebe a quantidade em estoque pois o mesmo será inicializado com 0
        this.name = name;
        this.price = price;
//        this.quantity = quantity; nao se faz necessario coloocar o this aqui nesse construtor, ja que nao há ambiguidade da palavra quantity. Portanto tod.o o quantity citado aqui será o quantity da classe.
//        nao preciso dizer pq ela é inicializada com zero.
    }
    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}