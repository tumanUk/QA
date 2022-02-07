package com.hillel.course;

public class Dog extends Animal implements Pet {

    Dog(String name) {
        super(name);
    }

    public void greets(Dog another) {
        System.out.println("Woof");
    }

    @Override
    public void greets() {
        System.out.println("Dod " + getName() + " says: 'Woof'");
    }

    @Override
    public void feed() {
        System.out.println("Feeding dog " + getName());
    }

    @Override
    public void walk() {
        System.out.println("Walking dog " + getName());
    }

    @Override
    public void play() {
        System.out.println("Playing with dog " + getName());
    }
}
