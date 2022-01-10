package task4;

public class SumOfDigits {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int sum=0;
        while (a>0){
            sum+=a%10;
 //           System.out.println(a%10); вывод числа задом наперед
            a=a/10;
        }
        System.out.println(sum);
    }

}
