/*24. write java code to print the count of odd and even elements in an arrya the elements must
        be from the user */

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter the elements for the array : ");
        for(int j=0;j<n;j++){
            arr[j] = sc.nextInt();
        }

        System.out.println("Entered the elements for the array : ");
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }

        System.out.println(" ");

        int evencount=0;
        int oddcount=0;

        for(int j=0;j<n;j++){
            if(arr[j]%2==0){
                evencount = evencount + 1;
            }
        }

        for(int j=0;j<n;j++){
            if(arr[j]%2!=0){
                oddcount = oddcount + 1;
            }
        }

        System.out.println("Even count : "+evencount);
        System.out.println("Odd count : "+oddcount);
    }
}
