public class StringEven {

    public static void main(String[] args) {
        String s = "I am Akarsh Shetty and Kishore is abesent today";
        StringEven obj =new StringEven();
        obj.method();
    }

    public  void  method(){
        String s = "I am Akarsh Shetty and Kishore is abesent today";
        for(String y :s.split(" ")){
            if(y.length()%2!=0){
                System.out.println(y);
            }
        }


    }

}
