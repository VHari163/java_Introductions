public class Inheritance_single_inheritance {
    static  class father{
        void car(){
            System.out.println("he had a car");
            //System.out.println();
        }
    }
    static class son extends father{

    }
    public static void main(String[] args) {
        father f = new father();
        son s = new son();
        System.out.println("father");
        f.car();
        System.out.println("son");
        s.car();
    }
}
