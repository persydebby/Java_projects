package trainingassignment1;

        import java.util.Scanner;

public class FibonacciNonRecursive{
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the number of elements for Fibonacci series : ");
        int Num = sn.nextInt();
        int n1 = 0 ;
        int n2 = 1 ;
        int n3 = 0;
        for (int i = 0; i < Num ; i++) {
            System.out.print( n1 + " ");
            n3 = n1 + n2 ;
            n1 = n2 ;
            n2 = n3 ;
        }
    }

}

