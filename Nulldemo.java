public class Nulldemo {

    public static void main(String[] args) {
        String myString=null;
        Employe employeObject=new Employe("aku","s",'s',(byte) 2);
       String name=employeObject.getFirstName();
        System.out.println(name);
    }
}
