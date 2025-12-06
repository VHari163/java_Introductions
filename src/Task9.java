// 9.check the user given number is divisible by 3 and 5

import java.util.Scanner;
class Task9 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter a number");
     int num = sc.nextInt();
     if ( num%3 == 0 && num%5 == 0 )
        System.out.println("the number is divisible ");
    else
        System.out.println("the number is not divisible ");
    }
 }

