/*25. write a java code to print the +ve and the -ve elements in the array and the elements
        must be from the user */

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of the array : ");
        int n = input.nextInt();
        int [] arr = new int[n];

        System.out.print("Enter elements for the array : ");
        for(int i = 0; i < n; i++){
            arr[i] =input.nextInt();
        }

        System.out.print("Entered elements for the array : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " , ");
        }

        System.out.println(" ");
        System.out.print("the positive elements from the array is : ");
        for(int i = 0; i < n; i++){
            if (arr[i] > 0){
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println(" ");
        System.out.print("the negative elements from the array is : ");
        for(int i = 0; i < n; i++){
            if (arr[i] < 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
