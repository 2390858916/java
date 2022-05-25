package StringDemo;
import java.util.Scanner;
public class Stringtest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the String");
        String line = sc.nextLine();
        int bn = 0;
        int sn = 0;
        int nn = 0;
        for (int i = 0;i<line.length();i++){
            char ch = line.charAt(i);
            if(ch>='A' && ch<='Z'){
                bn++;
            } else if (ch>='a' && ch<='z') {
                sn++;
            }else if(ch>='0'&&ch<='9'){
                nn++;
            }
        }
        System.out.println(bn);
        System.out.println(sn);
        System.out.println(nn);
    }
}
