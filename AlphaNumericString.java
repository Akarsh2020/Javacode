public class AlphaNumericString {

    public static void numberOfChars(String s)
    {
        int alphabatechar=0, numberchar=0, specailchar=0;
        for (char c : s.toCharArray()){
            if(Character.isAlphabetic(c)){
                alphabatechar++;
            }
            else if (Character.isDigit(c)){
                numberchar++;
            }
            else {
                specailchar++;
            }

        }
        System.out.println("the number of Alphates " +alphabatechar );
        System.out.println("the number of number " +numberchar );
        System.out.println("the number of specailCharacters " + specailchar);


    }


    public static void main(String[] args) {
        String s="2343xvdsdgfs%$#@#$dsaafc";
        numberOfChars(s);

    }

}
