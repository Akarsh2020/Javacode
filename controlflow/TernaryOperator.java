package controlflow;

public class TernaryOperator {
    public static void main(String[] args) {
        int x=10, y;

        if (x>5){
            y=20;

        }else {
            y=30;

        }
        System.out.println(y);
//Ternary opertor method

        y=x>5?20:30;
        System.out.println(y);
    }
}
