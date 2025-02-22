import java.util.Locale;

public class ChangeCaseDemo {
    public static void main(String[] args) {


        String orginalString = "Akarsh";
        String upperCase = orginalString.toUpperCase();
        String lowerCase = orginalString.toLowerCase();
        String specailCase="sdews23#SADS";
        String specialupperCase=specailCase.toUpperCase();
        String speciallowercase=specailCase.toLowerCase(Locale.ENGLISH);

    }
}
