//21. linear search program
import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int found = -1;
        System.out.println("Enter the size of the array: ");
        int[] arr = new int[input.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Entered elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("Enter the key value to search is the key is in the aray are not : ");
        int key = input.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = i;
            }
        }
        if (found == -1) {
            System.out.println("Key not found in the given array : ");
        } else {
            System.out.println("key found at the index of : " + found);
        }
    }
}
