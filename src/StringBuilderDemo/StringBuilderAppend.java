package StringBuilderDemo;

public class StringBuilderAppend {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
//        StringBuilder sb2 = sb.append("hello");
//        System.out.println(sb);
        sb.append("hello").append("world").append(100);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
