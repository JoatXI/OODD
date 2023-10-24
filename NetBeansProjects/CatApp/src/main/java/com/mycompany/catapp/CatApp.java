package com.mycompany.catapp;

/**
 *
 * @author Joat
 */
public class CatApp {

    public static void main (String[] args)
    {
        Cat clyde = new Cat ("Clyde", 2, 5);
        Cat binnie = new Cat ("Binnie", 5, 4);
        Cat flathead = new Cat ("Flathead", 7, 10);
        Cat cupra = new Cat ("Cupra", 2, 7);
        
        clyde.toString();
        binnie.toString();
        
        clyde.walk(1);
        binnie.walk(1);
        
        clyde.toString();
        binnie.toString();
        
        clyde.walk(1);
        clyde.toString();
        
        flathead.eat(2);
        flathead.toString();
        
        cupra.walk(4);
        cupra.toString();
    }
}
