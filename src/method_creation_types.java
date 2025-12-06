// creating of methods in java

public class method_creation_types {
    //called position


    public static void first(){
        System.out.println("First Method");
    }

    public static void second(int a){
        System.out.println("Second Method");
        System.out.println(a);
    }

    public static int third(){
        int a,b,c;
        a=10;
        b=20;
        c=a+b;
        System.out.println("Third Method");
        return c;
    }
    public static int fourth(int d,int e,int f){
        int g=d+e+f;
        System.out.println("Fourth Method");
        return g;
    }
    public static void main(String[] args) {

        first();
        //without return type and without parameters

        second(10);                         //without return type and with parameters

        int h = third();                       //with return type and without parameters
        System.out.println(h);

        int k=fourth(10,20,30);        //with return type and with parameters
        System.out.println(k);
    }
}
