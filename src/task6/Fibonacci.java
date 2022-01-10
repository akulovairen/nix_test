package task6;

public class Fibonacci {
    public static void main(String[] args) {
        long first = 0;
        long next = 1;
        long current = 0;

        System.out.println(first);
        System.out.println(next);

        while (first + next < 50) {
            current = first + next;
            first = next;
            next = current;
            System.out.println(current);
        }


    }
}
