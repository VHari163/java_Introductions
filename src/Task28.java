// multilevel inheritance

public class Task28 {
    static class zoo1{
        void zoo11(){
            System.out.println("zoo1");
        }
    }
    static class zoo2 extends zoo1{
        void zoo22(){
            System.out.println("zoo2");
        }
    }
static class zoo3 extends zoo2{
        void zoo33(){
        System.out.println("zoo3");
        }
}
    public static void main(String[] args) {
        zoo1 z1=new zoo1();
        zoo2 z2=new zoo2();
        zoo3 z3=new zoo3();

        System.out.println("");
        System.out.println("first class");
        z1.zoo11();

        System.out.println("");
        System.out.println("second class");
        z1.zoo11();
        z2.zoo22();

        System.out.println("");
        System.out.println("third class");
        z3.zoo11();
        z3.zoo22();
        z3.zoo33();
    }
}
