public class StringComparisonDemo {
    public static void main(String[] args) {
        String str1=new String("Hello");
        String str2=new String("hii");
        String str3=new String("Hello");

      boolean b1 =  str1.equals(str2);
      boolean b2=str1.equals(str3);

        boolean  b3 =str1.equals("Hello");
        boolean b4="hii".equals(str3);
        boolean b5="Hello".equals("Hello");

        String str4="Akarsh";
        String str5="akarsh";
        boolean b6=str4.equalsIgnoreCase(str5);
//str5.compareToIgnoreCase()
        String message = "Java is fun!";
        char mess =message.charAt(11);
        System.out.println(mess);

    }
}
