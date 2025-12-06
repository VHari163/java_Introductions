import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a mansoon season name :");
        String Weather = sc.nextLine();
        switch (Weather)
        {
            case "rainy","water":
                System.out.println("be closer to your favourate person 🫂🫂");
                break;
            case  "summer","hot":
                System.out.println("wear loose dress 👙");
                break;
            case "winter","cold":
                System.out.println("wear jackets🕵️‍♂️🧤🧣");
                break;
            default:
                System.out.println("try another season 🥰");
        }
    }
}
