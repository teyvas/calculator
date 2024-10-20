package com.alatoo.calculatorapp;

public class Calculator {
    private double op1;
    private double op2;
    private char operator;
    private double result;

    public void setOp1(double op1) {
        this.op1 = op1;
    }

    public void setOp2(double op2) {
        this.op2 = op2;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double getResult() {
        return result;
    }

    public void calculate() {
        switch (operator) {
            case '+':
                result = op1 + op2;
                break;
            case '-':
                result = op1 - op2;
                break;
            case '*':
                result = op1 * op2;
                break;
            case '/':
                if (op2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                result = op1 / op2;
                break;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }

    public void clear() {
        op1 = 0;
        op2 = 0;
        operator = ' ';
        result = 0;
    }
}
