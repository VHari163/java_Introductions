// 14. write a java program to find how many odd numbers in the range of 1 to 10 and their sum and count of the numbers
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        for(int a=0;a<=10;a++){
            if(a%2==1) {
                System.out.println(a);
                count = count + 1;
                sum = sum + a;
            }
        }
        System.out.println("number of odd numbers:"+count);
        System.out.println("sum of odd numbers:"+sum);
    }
}
