//get the iniput for variable marks check that if marks is >35 then pass else fail
import java.util.Scanner;

class Task7 {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        System.out.print("Enter a marks: ");
        int mark= h.nextInt();
        if(mark>35)
            System.out.println("pass");
        else
            System.out.println("fail");
    }
}
