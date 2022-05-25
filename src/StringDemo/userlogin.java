package StringDemo;
import java.util.Scanner;

public class userlogin {
    public static void main(String[] args) {
        String username = "admin";
        String password = "admin";
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(count<3){
            System.out.println("please input username");
            String name = sc.nextLine();
            System.out.println("please input password");
            String pwd = sc.nextLine();
            if(!name.equals(username)){
                System.out.println("not this user");
                count++;
                continue;
            } else if (!pwd.equals(password)) {
                System.out.println("pwd worn");
                count++;
                continue;
            }else{
                System.out.println("logging");
                break;
            }
        }
        System.out.println("no change");

    }
}
