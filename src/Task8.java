/* 8. get the input for the variable income, if the income is <7000 thenprint" Scholorship is available"
       else "not available for Scholorship "
 */
import java.util.Scanner;
class Task8 {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        System.out.println("enter your income");
        int income=h.nextInt();
        if(income<7000)
            System.out.println("you are eligible for schlorship");
        else
            System.out.println("you are not eligible for schlorship");
    }
}
