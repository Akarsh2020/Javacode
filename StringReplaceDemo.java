public class StringReplaceDemo {
    public static void main(String[] args) {
        String orginalString="hello world!";
        String replacString=orginalString.replace('o','*');
        String replacString1=orginalString.replace("world","universe");
        String replacString2=orginalString.replace("World","universe");

        String orginalString1="ababab";
        String replacString3=orginalString1.replace("ab","x");
        String orginalString2="JAVA IS A FUN";
        String replacString4=orginalString2.replaceAll("A|E|I|O|U","*");
        String orginalString3="AKARSH HELLO SHETTY AKARSH AKARSH";
        String replacString5=orginalString3.replaceFirst("AKARSH","SOWMYA");


    }
}
