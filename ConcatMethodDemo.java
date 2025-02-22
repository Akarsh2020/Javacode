public class ConcatMethodDemo {

    public static void main(String[] args) {
//        String name="hello";
//        name=name+" "+"world";
//        System.out.println(name);
//
//
//        String name1="hello";
//        name1=name1.concat(" ").concat("world");
//        System.out.println(name1);


        String greeting ="Hello,";
        String name ="Alex.";
        String message="Welcome to elite Java Club!";
        String  personalizedMessage= greeting.concat(name).concat(message);
        System.out.println(personalizedMessage);
    }
}
