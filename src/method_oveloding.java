/*  method over loding means which contains samilar method names and with different paremetrs
 */
public class method_oveloding {


    public static void display(int a,int b){
        System.out.println("Display Method");
        System.out.println(a+b);
    }


    public static void display(String c){
        System.out.println("String Display Method");
        System.out.println(c);
    }
    public static void main(String[] args) {

        display(10,20);

        display("String printed");

    }
}
