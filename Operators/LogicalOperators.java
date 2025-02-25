package Operators;

public class LogicalOperators {

    public static void main(String[] args) {
        boolean isValid;
        isValid=!true;
        isValid=!false;
        int num1=10;
        int num2=20;
        isValid=!(num1<num2);

        //Logical short circuit AND operator

        boolean a=(num1>6)&&((num2=26)>15);
        System.out.println(a);
        System.out.println(num2);

        //Logical Short-Circuit OR, Logical OR operators in Java

       boolean b=num1<15||((num2=21)>15);
        System.out.println(b);
        System.out.println(num2);

        //Logical XOR operator

        boolean c=(num1<19)^(num2<30);
        System.out.println(c);

        // Compound Logical Assignment Operators
        boolean b1=true;
        b1 &=true;
        System.out.println(b1);

        boolean b2=true;
        b2 |=false;
        System.out.println(b2);

        boolean b3=true;
        b3 ^=false;
        System.out.println(b3);
    }
}

