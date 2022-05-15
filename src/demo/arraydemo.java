package demo;

public class arraydemo {
    public static void main(String[] args) {
//        动态初始化数组
//        只指定长度 由系统数组分配初始值
        int[] arr = new int[3];
//        类型 数组 数组名 申请空间 类型 数组 长度
//        静态初始化
        int[] arr2 = {100,200,333};
        arr2[1] = 100;
        System.out.println(arr[1]);

        for(int i = 0;i<arr2.length;i++){
            System.out.println(arr[i]);
        }
        int max = 0;
        for (int x = 0;x<arr2.length;x++){
            if(arr2[x]>max){
                max = arr2[x];
            }
        }
        System.out.println(max);

    }
}
