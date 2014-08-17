package com.czeczotka.bdd.domain;

public class OrderItem {

    private String vegetable;
    private int amount;
    private int cost;

    public String getVegetable () {
        return vegetable;
    }

    public void setVegetable (String vegetable) {
        this.vegetable = vegetable;
    }

    public int getAmount () {
        return amount;
    }

    public void setAmount (int amount) {
        this.amount = amount;
    }

    public int getCost () {
        return cost;
    }

    public void setCost (int cost) {
        this.cost = cost;
    }
}