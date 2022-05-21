package method;

import java.util.Scanner;

public class setCpuScore {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("input the " + (i + 1) + " value");
            arr[i] = sc.nextInt();
        }
        int max = maxScore(arr);
        int min = minScore(arr);
        int sum = sumScore(arr);
        int avg = (sum - max - min /arr.length-2);
        System.out.println("max:" + max);
        System.out.println("min:" + min);
        System.out.println("sum:" + sum);
        System.out.println("avg:" + avg);

    }

    public static int maxScore(int[] arr) {
        int max = arr[0];
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        return max;
    }

    public static int minScore(int[] arr) {
        int min = arr[0];
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] < min) {
                min = arr[x];
            }
        }
        return min;
    }

    public static int sumScore(int[] arr) {
        int sum = 0;
        for (int x = 0; x < arr.length; x++) {
            sum += arr[x];
        }
        return sum;
    }
}
