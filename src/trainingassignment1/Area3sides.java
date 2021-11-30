package trainingassignment1;

import java.util.Scanner;

public class Area3sides {
        public static void main(String[] args) {
            Scanner sn = new Scanner(System.in);
            System.out.println("Enter the size of side A of the triangle : ");
            double A = sn.nextDouble();
            System.out.println("Enter the size of side B of the triangle : ");
            double B = sn.nextDouble();
            System.out.println("Enter the size of side C of the triangle : ");
            double C = sn.nextDouble();
            double P = ((A+B+C)/2);
            System.out.println("Perimeter of the triangle with 3 sides is : " + P);
            System.out.println("Area of the triangle with 3 sides is : " + Math.sqrt(P*(P-A)*(P-B)*(P-C))) ;
        }
    }


