package com.realdolmen.composite;

public class Leaf implements Node {
    private int value;

    public Leaf(int value) {
        this.value = value;
    }

    @Override
    public void operation() {
        System.out.println("VALUE " + value);
    }

    @Override
    public int getValue() {
        return value;
    }
}
