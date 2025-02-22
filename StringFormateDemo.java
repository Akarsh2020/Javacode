public class StringFormateDemo {

    public static void main(String[] args) {
        String message="Hello %s,you have %d messages";

        String message1=String.format(message,"Akarsh",5);
        String message2=    String.format(message,"sowmya",10);

        String price="the price of product is %.3f";
        String price1=String.format(price,17.9);
        String price2=String.format(price,23.54);

        String message3="my name is %3$s,im %2$d year old,im leaving in %1$s";

        String messag=String.format(message3,"benglore",40,"akarsh");


    }
}
