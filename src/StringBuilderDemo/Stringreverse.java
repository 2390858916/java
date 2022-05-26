package StringBuilderDemo;
import java.util.Scanner;
public class Stringreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the char");
        String line = sc.nextLine();
        String s = reverses(line);
        System.out.println(s);
    }
    public static String reverses(String s){
        return new StringBuilder(s).reverse().toString();
    }
}
