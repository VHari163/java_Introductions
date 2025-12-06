//  15.from the range of 1 to 100 how many can divisible by 3 and 5
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count =0;
        for(int i=1;i<=100;i++){
            if(i%3==0 && i%5==0){
                count = count+1;
            }
        }
        System.out.print(count);
    }
}
