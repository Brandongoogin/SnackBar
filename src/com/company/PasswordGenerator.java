package com.company;

public class PasswordGenerator {
    private String prefix;
    private int digits;
    private int randomDigits;
    static int count = 0;

    public PasswordGenerator(int a, String b) {
        digits = a;
        prefix = b;

    }

    public PasswordGenerator(int a) {
        digits = a;
        prefix = "A";
    }

    public String pwGen() {
        randomDigits = (int) (Math.random() * Math.pow(10, digits));
        String a = prefix + "." + randomDigits;
        count++;
        return a;
    }

    public int pwCount() {
        return count;

    }
    public static void main(String[] args){
        PasswordGenerator pw1 = new
                PasswordGenerator(4, "chs");
        pw1.pwCount();
        pw1.pwGen();
        pw1.pwGen();
        pw1.pwCount();
        PasswordGenerator pw2 = new
                PasswordGenerator(6);
        pw2.pwCount();
        pw2.pwGen();
        pw2.pwCount();
        pw1.pwCount();














    }






}
