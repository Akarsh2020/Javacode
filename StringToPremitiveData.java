public class StringToPremitiveData {
    public static void main(String[] args) {
        String strInt="433";
        int num=Integer.parseInt(strInt);

        String strDouble="43.21";
        double doubleNum=Double.parseDouble(strDouble);

        String strFloat="27.43";
        float floatNum=Float.parseFloat(strFloat);

        String strBoolen="true";
        boolean booleanNum=Boolean.parseBoolean(strBoolen);

        String strboolean1="madan";
        boolean booleanname=Boolean.parseBoolean(strboolean1);

        String hello="hello";
        char firstCar=hello.charAt(0);
        char[] charArray=hello.toCharArray();
        char secoundchar=charArray[1];




    }
}
