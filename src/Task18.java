//18. write a code to check the string is paindrom are not

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = input.nextLine();
        StringBuilder sb = new StringBuilder(str);
        String hari =sb.reverse().toString();
        if(hari.equals(str)){
            System.out.println("This is a palindrome");
        }
        else{
            System.out.println("This is not a palindrome");
        }
    }
}
