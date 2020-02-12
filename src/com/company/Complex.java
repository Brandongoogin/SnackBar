package com.company;

public class Complex {
    double first;
    double second;
    public Complex(double a) {
        first = a;
        second = 0.0;

    }

    public Complex(double a, double b) {
        first = a;
        second = b;

    }

    public double abs() {
        return Math.sqrt(first * first + second * second);

    }
    public double add(Complex other) {
        double ans = (first + other.first) + (second + other.second);
        return ans;

    }
    public String toString(){
        return (first + " + " + second + " i");

    }
    public Complex multiply(Complex other) {
        return new Complex (((first * other.first) + (second * other.second)), ((first * other.second) + (second * other.first)));

    }
    public Complex add(double third){
        return new Complex ((first + third), (second + third));

    }
    public Complex multiply(double third){
        return new Complex (((first * third) - (second * third)), ((first * third) + (second * third)));
    }
    public static void main(String[] args){
        Complex c1 = new Complex(6,9);
        Complex c2 = new Complex(-2, 4);
        Complex c3 = new Complex(7,-5);

        System.out.println(c1);
        System.out.println(c1.abs());
        System.out.println(c1.add(c2));
        System.out.println(c1.add(4.0));
        System.out.println(c1.multiply(c2));
        System.out.println(c1.multiply(6.0));
        System.out.println();
        System.out.println(c2);
        System.out.println(c2.abs());
        System.out.println(c2.add(c3));
        System.out.println(c2.multiply(c3));
        System.out.println();
    }



}
