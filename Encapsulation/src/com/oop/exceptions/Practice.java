package com.oop.exceptions;

public class Practice {
    public String frontBack(String str) {
        char first= str.charAt(0);
        char end= str.charAt(str.length()-1);

        String n= str.replace(first, end);
        System.out.println(n);
        System.out.println(n);
        String m=n.replace(end, first);
        System.out.println(m);

        return str;

    }

    public static void main(String[] args) {
        Practice p=new Practice();

        System.out.println(p.frontBack("alo"));
    }
}
