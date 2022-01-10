package task8;

public class Piramid {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int c=1;
        for(int i=1; i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c +" ");
                c++;
            }
            System.out.println();
        }
    }
}
