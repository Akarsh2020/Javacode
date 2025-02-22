public class Methodinvocation {
    public static void main(String[] args) {
        Methodinvocation obj =new  Methodinvocation();
        obj.method1();


    }
        public void method1 ()
        {
            int number = 10;
            System.out.println("method1");
            String output = method2();
            System.out.println(output);
        }
        public String method2 ()
        {
            String output = "Hello world";
            System.out.println("method2");
            method3("Hii");

            return output;

        }
        public void method3 (String input)
        {
            System.out.println(input);
            System.out.println("method3");
            method4(10);
        }
        public void method4 ( int num)
        {

            System.out.println(num);
            System.out.println("method4");
        }
    }
