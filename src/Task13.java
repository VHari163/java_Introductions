//  13. to find that the given character is of vowel or consonent
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a character:");
        char ch1 = input.next().charAt(0);
        char ch = Character.toLowerCase(ch1);
        if(ch== 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("the character is a vowel :");
        }
        else{
            System.out.println("the character is not a vowel :");
        }

    }
}
