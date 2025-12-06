// Array concept
import java.util.Scanner;

public class Arrays_types {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks1 =10;                  //takes more memory to store
        int marks2=20;
        int marks3=30;
        int marks4=40;
        int marks5=50;
        System.out.print("marks3 :" +marks3);

        int [] marks = new int[5];           //stores the same data type values by using the single variable
        marks[0] = 10;                       //            (using the array concept)
        marks[1] = 20;
        marks[2] = 30;

        marks[3] = 40;
        marks[4] = 50;
        System.out.println("marks of the student of the third subject :" +marks[2]);

        int [] arr = {10,200,300,499,67};      //inilization of array values at the same time
        //using the for loop to print the 5 marks
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("marks of the student of the second subject :" +arr[3]);

        //reading the values to the array from the user
        int [] vin=new int[5];
        System.out.println("Enter 5 values by pessing the enter key :\n");
        for(int i=0;i<vin.length;i++){
            vin[i]=input.nextInt();
        }
        System.out.println("Entered 5 values by pessing the enter key is :");
        for(int i=0;i<vin.length;i++){
            System.out.println(vin[i]);
        }

        Float [] hari = new Float[5];  // array using the float data type
        hari[0] = 10.0f;
        hari[1] = 20.0f;
        hari[2] = 30.0f;
        hari[3] = 40.0f;
        hari[4] = 50.0f;
        System.out.println("printing the float values by using the array :" +hari[0]);

        String [] ka = new String[5];          //using the string data type in array
        ka[0] = "dgsdA";
        ka[1] = "dvsvB";
        ka[2] = "Cxcvbzc ";
        ka[3] = "Dzfgzxc";
        ka[4] = "Ecxzv";
        System.out.println("printing the String values by using the array :" +ka[4]);

        //using the for loop to print the string values
        for(int i=0;i<ka.length;i++){
            System.out.println(ka[i]);
        }
    }
}
