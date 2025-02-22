import java.util.Locale;

public class ALLString {
    private static String num;

    public static void main(String[] args) {


        //1.String creating type  ---------------------------------------------------------------********************

        String name = "Akarsh"; // using initialization and declaration(literal) // it will store in string pool
        String OBJ = new String("AKARSH"); // using object creations // it will store in heep memeory


        //2.Intern method -----------------------------------*********************
        //its is a method to convert object creations string value and literal string value

        String num = "Aku";
        String obj = new String("Aku").intern();
        System.out.println(num==obj);

        //3.concat method ------------------------------------*************************
        // adding to two string values using concat method

        String hi="hello"+" "+"uni" ;// concat using + opertator
        String HI1="HELLO".concat(" ").concat( " Aakrsh"); // adding two string using concat method
        System.out.println(hi);
        System.out.println(HI1);

        //4.Escape sequence characters and Unicode char values in string  ---------------------------*************

        //if  want pring sting value in double code (""), we have use \"  \" for string

        String na="i am \"Akarsh\"";
        System.out.println(na); //op is "Akarsh"

       // 5.we can use unicode char in string values ----------------------------------***************

        String uni="\u0061k\u0061rsh";
        System.out.println(uni);


// 6. finding the length of string ,it will start from 0 ---------------------------******

 String str1="hello";
 String str2="hi";
 String combined =str1+" "+str2;
 int lenght1=str1.length();
 int lenght2=str2.length();
 int combined1 =combined.length();
        System.out.println(lenght1);
        System.out.println(lenght2);
        System.out.println(combined1);
// 7.comparing  the strings using equals method and it's a case-sensitive---------------------------------------******
        
        String st1="hllo";
        String st2="hllo";
        String st3="hii";
        
        boolean b1=st1.equals(st2);
        boolean b2=st2.equals(st3);
        System.out.println(b1); //op=true
        System.out.println(b2); // op=false
        
        // 8. for ignorecasesensitive-----------------------------------------------------***************
        
        String st4="java";
        String st5="JAVA";
        
        boolean B=st4.equalsIgnoreCase(st5);
        System.out.println(B); //op-true

        //9.fetching string character using index method-----------------------------*********************

        String A="JAVAA";
        char j=A.charAt(4);
        System.out.println(j);//OP-A IF index is more than it will be StringIndexOutOfBoundsException

 //10.check if a string is empty -------------------------------------------****************************

      //a.using isempty method--------------------------------------------------------------************
        String emp="";
        boolean empty=emp.isEmpty();
        System.out.println(empty); //op -true
        
      //b.using lenght method----------------------------------------------------**************************
      boolean empty1="".length()==0;
        System.out.println(empty1); // op-true

        // c. using empty method------------------------------------------------**************************
        String empty2="";
        boolean isempty="".equals(empty2);
        System.out.println(isempty);

        // 11. changing the casesenstive in string ------------------------------------------****************

        String orginalCase="java";
        String uppercase=orginalCase.toUpperCase();
        System.out.println(uppercase); // op-JAVA

        //12.convert data type to strings------------------------**************************

        int intValue=433;
        double doubleValue =43.20;
        boolean booleanValue=true;

        String vl1=String.valueOf(intValue);
        String vl2=String.valueOf(doubleValue);
        String vl3=String.valueOf(booleanValue);

        System.out.println(vl1);
        System.out.println(vl2);
        System.out.println(vl3);

        //convert int by + concatination

        int age=30;
        String vl5="My age is" + age;
        System.out.println(vl5); // op- My age is 30;

        //13.Searching for a value in string

        //a.indexof method

        String orgString="hello,world";
        int index=orgString.indexOf("h");
        System.out.println(index);

      //b.contains method=---------------/*****************

        String orgstr="hello world";
        boolean iscontians= orgstr.contains("world");
        boolean iscontains2=orgstr.contains("@");
        System.out.println(iscontians);
        System.out.println(iscontains2);

        //c.startwith and endswith method

        String orgstrng="hello world";
        boolean Startwith=orgstrng.startsWith("hello");
        boolean endWith=orgstrng.endsWith("d");
        System.out.println(Startwith);
        System.out.println(endWith);

        //d. matches method--------------------**************

        String orgnalstg="hell, world";
        boolean match=orgnalstg.matches(".*hel.*" );
        System.out.println(match);


        //










    }
}

