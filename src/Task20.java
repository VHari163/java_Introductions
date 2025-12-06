/* 20. read the inputs for array with the size of the array and then print the
 square of the every element in the array*/
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int [] arr = new int[size];
        int [] arr1 = new int[size];
        System.out.println("Enter the elements for the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < size; i++) {
            arr1[i] = arr[i]*arr[i];
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
