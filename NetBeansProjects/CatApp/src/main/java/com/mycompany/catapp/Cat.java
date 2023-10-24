package com.mycompany.catapp;

/**
 *
 * @author Joat
 */
public class Cat {
    private String name;
    private int age, weight;
    
    public Cat (String nameIn, int ageIn, int weightIn) {
        this.name = nameIn;
        this.age = ageIn;
        this.weight = weightIn;
    }
    
    public void walk(int distance) {
        this.weight -= distance;
    }

    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age + ", Weight: " + this.weight;
    }
    
    public void eat(int amount) {
        if(this.weight > 20) {
            System.out.println("Can't eat anymore food, else the cat will be too fat!");
        }
        else {
            this.weight += amount;
        }
    }
}