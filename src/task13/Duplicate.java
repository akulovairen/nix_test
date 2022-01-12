package task13;

import java.util.ArrayList;
import java.util.List;

public class Duplicate {
    public static void main(String[] args) {
        int [] arr=new int[]{23,76,1,3,57,93,23,2,4};


        System.out.println(duplicatMethod(arr));
    }

    private static List<Integer> duplicatMethod( int[] arr) {
        List<Integer> duplicates=new ArrayList<>();
        for(int i = 0; i< arr.length; i++){
            int a = arr[i];
            for (int j = 0; j< arr.length; j++){
                if(i==j) continue;
                int result= arr[j];
                if(a==result)
                    duplicates.add(result);
            }
        }
        return duplicates;
    }
}


