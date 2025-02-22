public class EmptyCheckDemo {

    public static void main(String[] args) {

        String myString="";
      boolean  isEmptyString=myString.isEmpty();
        boolean  isLengthString=myString.length()==0;
        boolean  isEqualString ="".equals(myString);
        String nullString=null;
        boolean isnullempty="".equals(nullString);
        boolean  isNullEmptyString=nullString.isEmpty();


    }
}
