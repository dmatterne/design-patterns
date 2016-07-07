package com.realdolmen.composite;

public class CompositeRunner {
    public static void main(String[] args) {
        Leaf a = new Leaf(5);
        Leaf b = new Leaf(3);
        Leaf c = new Leaf(2);
        Leaf d = new Leaf(6);

        Composite mul = new Composite(Operator.mul, a, b);

        Composite div = new Composite(Operator.div, mul, c);

        Composite plus = new Composite(Operator.plus, div, d);
        plus.operation();
    }
}
