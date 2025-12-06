// 01. get input from the user as name, age

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Can you find the letters of your name on the keyboard?\nThen type it : ");
        String num = input.nextLine();

        System.out.print("Enter that how many years did you took breath on th earth : ");
        int years = input.nextInt();

        System.out.println("");
        System.out.println("Then see this !\nIs this is your name : "+num);
        System.out.println("");
        System.out.println("And also see this \nIs this is your age : "+years);
    }
}
