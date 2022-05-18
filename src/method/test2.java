package method;

public class test2 {
    public static void main(String[] args) {
        int[] arr = {68,27,95,88,171,996,51,210};
        int counter = 0;
        for (int i = 0;i<arr.length;i++){
            if(arr[i]%10!=7 && arr[i]/10%10!=7 && arr[i]%2==0){
                counter += arr[i];
            }
        }
        System.out.println(counter);
    }
}
