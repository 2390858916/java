package method;
import java.util.Scanner;
public class selectarray {
    public static void main(String[] args) {
        int[] arr = {11,22,33};
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int retult = select(arr,x);
        System.out.println(retult);

    }
    public static int select(int[] arr,int x){
        int i = 0;
        for (i = 0;i<arr.length;i++){
            if(x==arr[i]){
               break;
            }
        }
        return i;
    }
}
