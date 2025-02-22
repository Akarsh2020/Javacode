public class StringBufferDemo {

    public static void main(String[] args) {
        StringBuffer str=new StringBuffer();
        str.append("world");
        str.insert(0,"hello ");
        str.deleteCharAt(4);
        str.insert(4,"o");
        str.setLength(5);
        str.reverse();

        String str1=str.toString();
        System.out.println(str1);

    }
}
