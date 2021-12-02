package trainingassignment1;

import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the number of elements for Fibonacci series : ");
        int Num = sn.nextInt();
        for (int i = 0; i < Num ; i++) {

            System.out.print(fib(i) + " ");
        }
    }
    static int fib(int n) {
        if (n <= 1)
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }
}

