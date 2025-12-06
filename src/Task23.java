/*23. find the largest and the smallest elements in an array and the elements for the array must be
      from the user */

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the arrya : ");
        int size = input.nextInt();
        int [] arr =  new int[size];
        System.out.print("Enter the values for the arrya : ");
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Entered the values for the arrya : ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        int max=arr[0];
        int min=arr[0];
        System.out.println(" ");
        for(int j=0;j<size;j++){
            if(max <= arr[j] ){
                max=arr[j];
            }
        }
        for(int j=0;j<size;j++){
            if(min >= arr[j]){
                min=arr[j];
            }
        }
        System.out.println("Max element in the array = "+max);

        System.out.println("Min element in the array = "+min);
    }
}
