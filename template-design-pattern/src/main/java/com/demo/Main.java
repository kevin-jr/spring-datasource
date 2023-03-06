package com.demo;

public class Main {
    public static void main(String[] args) {
        PizzaTemplate pizzaTemplate = new ChicagoPizza();
        pizzaTemplate.sellPizza();

        PizzaTemplate ny = new NewYorkPizza();

        ny.sellPizza();
    }
}
