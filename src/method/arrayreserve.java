package method;

public class arrayreserve {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        for(int star = 0,end = arr.length-1;star<=end;star++,end--){
            int temp = arr[star];
            arr[star] = arr[end];
            arr[end] = temp;
        }
        prinarry(arr);

    }
    public static void prinarry(int[] arr){
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
