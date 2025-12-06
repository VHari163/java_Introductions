/* 12. write a java program using the switch case by axcessing the user input as month numbers and the
        output as user type 1 then related month and no.of days in the monthe  */
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number from 1 to 12 :");
        //int hi=input.nextInt();
        //switch (hi)
        switch(input.nextInt())
        {
            case 1:
                System.out.println("its january and it has 31 days");
                break;
            case 2:
                System.out.println("its february and it has 29 days");
                break;
            case 3:
                System.out.println("its march and it has 31 days");
                break;
            case 4:
                System.out.println("its april and it has 30 days");
                break;
            case 5:
                System.out.println("its may and it has 31 days");
                break;
            case 6:
                System.out.println("its june and it has 29 days");
                break;
            case 7:
                System.out.println("its july and it has 31 days");
                break;
            case 8:
                System.out.println("its august and it has 30 days");
                break;
            case 9:
                System.out.println("its september and it has 31 days");
                break;
            case 10:
                System.out.println("its octuber and it has 29 days");
                break;
            case 11:
                System.out.println("its november and it has 31 days");
                break;
            case 12:
                System.out.println("its december and it has 30 days");
                break;
        }
    }
}
