package com.hillel.course;

public class Wolf extends Animal implements WildAnimal {
    Wolf(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Wolf " + getName() + " says: 'Hawoo Hawoo' ");
    }

    @Override
    public void hunting() {
        System.out.println("Wolf " + getName() + " goes hunting.");
    }
}
