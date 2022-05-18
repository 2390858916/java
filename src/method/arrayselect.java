package method;

public class arrayselect {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44};
        int[] arr2 = {56,25,88,85};
        boolean result = arrayselect(arr,arr2);
        System.out.println(result);
    }
    public static boolean arrayselect(int[] arr,int[] arr2){
        if(arr.length!=arr2.length){
            return false;
        }
        for (int j:arr){
            for (int i:arr2){
                if (j==i){
                    return false;
                }
            }
        }
        return true;
    }
}
