package task14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersection {
    public static void main(String[] args) {

        int[] arr=new int[]{45,6,7,5,4,345,67,1,4};
        int[] arr1 = new int[]{34,5,65,67,45,1,34,5};


        System.out.println(dupli(arr,arr1));
        System.out.println(Arrays.toString(dupliList(arr,arr1)));
    }
    private static int[] dupliList(int[] arr, int[] arr1){
        return Arrays.stream(arr)
                .distinct()
                .filter(x -> Arrays.stream(arr1)
                        .anyMatch(y->y==x))
                .toArray();
    }

    private static Set<Integer> dupli(int[] arr, int[] arr1) {
        Set<Integer> duplicate = new HashSet<>();
        for (int k : arr) {
            for (int i : arr1) {
                if (k == i) {
                    duplicate.add(i);
                }
            }
        }
        return duplicate;
    }
}