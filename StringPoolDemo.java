public class StringPoolDemo {

    static  String hello="hello";
    static String hii="hello";
    static String hey="hey";

    public static void main(String[] args) {


        System.out.println(hello == hii);
        System.out.println(hello.hashCode());
        System.out.println(hii.hashCode());
        System.out.println(hey.hashCode());

        String obj=new String("hello");
        String obj2=new String("hello");
        String obj3=new String("hey");
        System.out.println(obj==obj2);



    }

}
