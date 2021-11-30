package trainingassignment1;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the base of the triangle : ");
        double base = sn.nextDouble();
        System.out.println("Enter the height of the triangle : ");
        double height = sn.nextDouble();
        System.out.println("Area of the triangle is : " + ((base * height)/2));
    }
}

