package com.realdolmen.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Node {
    private Operator op;

    private Node a;
    private Node b;

    public Composite(Operator op, Node a, Node b) {
        this.op = op;
        this.a = a;
        this.b = b;
    }

    @Override
    public void operation() {
        System.out.println(getValue());
    }

    @Override
    public int getValue() {
        return op.calc(a.getValue(), b.getValue());
    }
}
