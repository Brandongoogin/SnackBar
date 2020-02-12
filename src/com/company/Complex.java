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

    public double abs(double a, double b) {
        double ans = Math.sqrt(first * first + second * second);
        return ans;
    }
    public double add(Complex other) {
        double ans = (first + other.first) + (second + other.second);
        return ans;

    }
    public String toString(){
        return (first + " + " + second + " i");

    }
    public Complex multiply(Complex other) {
        return new Complex (((first * other.first) - (second * other.second)), ((first * other.second) + (second * other.first)));

    }
    public Complex add(double third){
        return new Complex ((first + third), (second + third));

    }
    public Complex multiply(double third){
        return new Complex (((first * third) - (second * third)), ((first * third) + (second * third)));
    }



}
