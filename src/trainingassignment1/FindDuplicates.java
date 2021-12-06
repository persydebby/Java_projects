package trainingassignment1;

import java.util.Arrays;

public class FindDuplicates {
        public static void main(String[] args) {

            //Initialize array
            int [] arr = {1, 2, 3, 5,4 ,8, 7, 8, 9, 3,5};

            Arrays.sort(arr);
            System.out.println("Duplicate elements in the given array: ");
             for(int i = 0; i < arr.length; i++) {
                 for (int j = i + 1; j < arr.length; j++) {
                     if (arr[i] == arr[j])
                         System.out.println(arr[j]);

                 }
             }

        }
    }

