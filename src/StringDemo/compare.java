package StringDemo;

public class compare {
    public static void main(String[] args) {
        char[] chs = {'a','b','c'};
        String s1 = new String(chs);
        String s2 = new String(chs);
        String s3 = "abc";
        String s4 = "abc";
        //比较地址
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s4==s3);
        //比较内容
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s4.equals(s3));
    }
}
