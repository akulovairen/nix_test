package task2;

import java.util.Arrays;

public class TwoNumbers {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);
        String operation= args[2];
        if(operation.equals("sum")){
            System.out.println(a+b);
        } else if(operation.equals("sub")){
            System.out.println(a-b);
        }else if(operation.equals("div")){
            System.out.println(a/b);
        }else if(operation.equals("mul")){
            System.out.println(a*b);
        }else {
            System.out.println("ошибка ввода");
        }
        int[] arr= new int[]{3,8,9,123,678,976,1};
        System.out.println(Arrays.toString(arr));
    }
}
