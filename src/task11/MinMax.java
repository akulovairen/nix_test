package task11;

import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int[]arr=new int[]{12,76,2,67,98,45,8,34,98,105};

        getResult(arr);
        System.out.println(getMin(arr));
        System.out.println(getMax(arr));

    }
    private static int getMax(int[] arr){
        int max= Arrays.stream(arr).max().orElse(0);
        return max;
    }

    private static int getMin(int[] arr){
        int min= Arrays.stream(arr)
                .min().orElse(0);
        return min;

    }

    private static void getResult(int[] arr) {
        var min= arr[0];
        var max = arr[0];
        for (int next : arr){
            if( next< min){
                min=next;
            }
            if( next>max){
                max=next;
            }
        }
        System.out.println("Минимальное " + min);
        System.out.println("Максимаьное "+ max);
    }

}
