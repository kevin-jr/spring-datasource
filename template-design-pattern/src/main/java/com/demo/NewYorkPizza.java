package com.demo;

public class NewYorkPizza extends PizzaTemplate{

    @Override
    public void prepared() {
        System.out.println("NY::prepared");
    }

    @Override
    public void bake() {
        System.out.println("Ny::bake");
    }

    @Override
    public void topping() {
        System.out.println("Ny::topping");
    }

    @Override
    public void serve() {
        System.out.println("NY::serving");

    }

    @Override
    public void checkBill() {
        System.out.println("NY::prepared");
    }
}
