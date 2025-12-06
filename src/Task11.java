/* 11. get a input from the user for two variables starting and ending then print the values form the
        starting to the ending user values */
import java.util.Scanner;
class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a starting number");
        int start = sc.nextInt();
        System.out.println("enter a ending number");
        int end = sc.nextInt();
        System.out.println("the num from "+start+" to " +end);
        for(int i = start; i <= end; i++){
            System.out.println(i);
        }
    }
}
