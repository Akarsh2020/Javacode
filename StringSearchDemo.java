public class StringSearchDemo {
    public static void main(String[] args) {


        String stringOrginal = "Hello, world!";

        int index = stringOrginal.indexOf('!');
        int index2 = stringOrginal.indexOf("world");
        int index3 = stringOrginal.indexOf("@");

        boolean isContains=stringOrginal.contains("Hello");
        boolean isPresent=stringOrginal.contains("@");
        boolean startsWith=stringOrginal.startsWith("He");
        boolean endsWith=stringOrginal.endsWith("d!");
        boolean isMatches=stringOrginal.matches(".*world.*");
     }

}
