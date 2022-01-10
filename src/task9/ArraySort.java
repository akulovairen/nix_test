package task9;

import java.util.Arrays;

public class ArraySort {
    public static void sorted(int[] arr){
        for(int i=0;i< arr.length;i++){
            int pos=i;
            int min=arr[i];
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    pos=j;
                }
            }
            arr[pos]=arr[i];
            arr[i]=min;
        }
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,14,57,78,34,56,8,0,76,34};
        int[] arr1 =new int[]{34,86,2,45,17,3,25,96};
        int[] arr2 =new int[]{3,5,672,45,17,3,25,96};

        sorted(arr);
        System.out.println(Arrays.toString(arr));
        sorted(arr1);
        System.out.println(Arrays.toString(arr1));
        sorted(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
