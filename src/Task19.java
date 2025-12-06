/*19. write a java program to accept the values and size of the two arrays and print the similar elements
        from the two arrays
*/
import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //first array
        System.out.println("Enter the size of the 1st array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the 1st array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        //second array
        System.out.println("Enter the size of the 2nd array: ");
        int m = input.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter the elements of the 2nd array: ");
        for (int i = 0; i < m; i++) {
            arr2[i] = input.nextInt();
        }

        //final array
        int [] finarr;
        if (arr.length > arr2.length) {
            finarr = new int[arr.length];
        }
        else{
            finarr = new int[arr2.length];
        }

        //sizes of the three arrays
        System.out.println("size of the 1st array: "+ arr.length);
        System.out.println("size of the 2nd array: "+ arr2.length);
        System.out.println("size of the 3rd array: "+ finarr.length);

        //printing the elements in first array
        System.out.println("Entered elements of the 1st array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+",");
        }

        //printing the elements in second array
        System.out.println("");
        System.out.println("Entered elements of the 2nd array: ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i]+",");
        }

        //printing the similar elements
        System.out.println("");
        System.out.println("final array elements are");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i] == arr2[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
        /*int k=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i] == arr2[j]) {
                    finarr[k] = arr2[j];
                    k++;
                }
            }
        }
        System.out.println("final array elements are");
        for (k = 0; k < finarr.length; k++) {
            System.out.println(finarr[k]+"");
        }*/
    }
}


