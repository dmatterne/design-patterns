package com.realdolmen.composite;

public enum  Operator {
    plus {
        @Override
        int calc(int a, int b) {
            return a + b;
        }
    },
    minus {
        @Override
        int calc(int a, int b) {
            return a - b;
        }
    },
    mul {
        @Override
        int calc(int a, int b) {
            return a * b;
        }
    },
    div {
        @Override
        int calc(int a, int b) {
            return a / b;
        }
    };

    abstract int calc(int a, int b);
}
