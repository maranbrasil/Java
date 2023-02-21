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