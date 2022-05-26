package StringBuilderDemo;

public class Stringtransition {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        String s = sb.toString();
        System.out.println(s);

        String s1 = "heloo";
        StringBuilder sb2 = new StringBuilder(s);
        System.out.println(sb2);
    }
}
