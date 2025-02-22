public class StringTrimDemo {

    public static void main(String[] args) {
        String java1="  JAVA".trim();
        String java2="JAVA ".trim();
        String java3="\n \t java \t \r".trim();
        String java4="\n\t \r java \t";

        boolean isSame="java".equals("  java".trim());
    }
}
