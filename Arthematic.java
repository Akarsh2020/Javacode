public class Arthematic {
    double pi =3.14;
    static final double PI_VALUE=3.14;

    public static void main(String[] args) {
        Arthematic a=new Arthematic();
        int result=a.sum(30,50);

        System.out.println(result);
        System.out.println(PI_VALUE);
        System.out.println(a.pi);


    }
        public int sum ( int num1, int num2){
            int result = num1 + num2;

            return result;
        }

    public static int addtion ( int num1, int num2){
        int result = num1 + num2;
        return result;
    }
    }

