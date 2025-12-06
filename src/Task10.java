/* 10. using the switch case take the input of 6 subjects marks and average of the marks and then
       if the average is <35 then print "Additional classes ar erequired" else print "good to go "*/
import java.util.Scanner;
class Task10 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter a c marks");
       int a = sc.nextInt();
       System.out.println("enter a java marks");
       int b = sc.nextInt();
       System.out.println("enter a py marks");
       int c = sc.nextInt();
       System.out.println("enter a maths marks");
       int d = sc.nextInt();
       System.out.println("enter a crt marks");
       int e = sc.nextInt();
       System.out.println("enter a coommunication marks");
       int f = sc.nextInt();
       int sum =a+b+c+d+e+f;
       System.out.println("the total marks : "+sum);
       float avm = sum/6;
       System.out.println("the average marks : "+avm);
       if (avm<35){
           System.out.println("additioanal class required ");
       }
       else {
           System.out.println("additioanal class not required and you are good to go :");
       }
    }
}
