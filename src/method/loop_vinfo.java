package method;
import java.util.Scanner;
public class loop_vinfo {
    public static void main(String[] args) {
        // 键盘录入 接收
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of week");
        int week = sc.nextInt();
        switch (week){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("error");
        }
    }
}
