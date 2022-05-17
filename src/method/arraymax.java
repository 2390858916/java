package method;

public class arraymax {
    public static void main(String[] args) {
        int[] arr = {15,16,88,99};
        int max = getmax(arr);
        System.out.println(max);
    }
    public static int getmax(int[] arr){
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
