/* 16. take the inputs from the user randomly if the user gives the +ve ask again if the user gave that as
 -ve then calculate it and display it */
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int total=0;
        do {
            System.out.print("Enter number: ");
            number = input.nextInt();
            total = total + number;
        }while(number>0);
    System.out.println("the total is : "+total);
    }
}
