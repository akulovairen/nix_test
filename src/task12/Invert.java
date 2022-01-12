package task12;

import java.util.Arrays;

public class Invert {
    public static void main(String[] args) {
        int[]arr=new int[]{34,6,8,2,5,67,8,566};
        inverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void inverse(int[] arr) {
        for (int i = 0; i< arr.length/2; i++){
            int t= arr[i];
            arr[i]= arr[arr.length-i-1];
            arr[arr.length-i-1]=t;
        }
    }


}
