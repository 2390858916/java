package StringDemo;
import java.util.Scanner;
public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("put the char");
        String line = sc.nextLine();
        for (int x =0;x<line.length();x++){
            System.out.println(line.charAt(x));
        }
    }
}

