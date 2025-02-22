package org.example;

public class Reverse {
    public static void main(String[] args) {


        StringBuffer b = new StringBuffer("DHGFDDF^%$#%$23454t53dgf");
        String A = b.reverse().substring(6, 11) +" "+ b.substring(0, 5);
        System.out.println(A);
    }
}