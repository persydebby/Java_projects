package trainingassignment1;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int Num = sn.nextInt();
        int Rem = (Num % 2);
        if (Rem == 0) {
            System.out.println("The number " + Num + " is even");
        }
        else {
            System.out.println("The number " + Num + " is odd");
        }
    }
}
