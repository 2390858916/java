package StringDemo;

public class Stringuse {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println(s1);

        char[] chs = {'a','b','c'};
        String s2 = new String(chs);
        System.out.println(s2);

        byte[] num = {97,98,99};
        String s3 = new String(num);
        System.out.println(s3);

        String s4 = "abc";
        System.out.println(s4);

    }
}
