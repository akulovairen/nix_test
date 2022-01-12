package task10;

import java.util.Arrays;
import java.util.OptionalDouble;

public class ArrAverage {
    public static void main(String[] args) {
        int[] arr=new int[]{12,65,78,94,55,3,4,76};
        double average = getAverage(arr);
        System.out.println(average);
        double averageWithLoop = getAverageWithLoop(arr);
        System.out.println(averageWithLoop);

    }

    public static double getAverageWithLoop(int [] arr){
        int sum=0;
        double result=0;
        for (int al:
             arr) {
            sum +=al;
        }
        result = (double) sum / arr.length;
        return result;
    }

    private static double getAverage(int[] arr) {
        OptionalDouble optionalDouble = Arrays.stream(arr).average();
        double average = optionalDouble.orElse(0);
        return average;
    }
}
