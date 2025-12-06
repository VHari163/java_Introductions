// Hybride inheritance

public class Task29 {
    static  class A{
        void a(){
            System.out.println(" first class");
        }
    }
    static class  B extends A{
        void b(){
            System.out.println("second class");
        }
    }
    static class  C extends A{
        void c(){
            System.out.println("third class");
        }
    }
    static class  D extends B{
        void d(){
            System.out.println("fourth class");
        }
    }
    static class  E extends C{
        void e(){
            System.out.println("fifth class");
        }
    }
    public static void main(String[] args) {

        A a1 = new A();
        B b1 = new B();
        C c1 = new C();
        D d1 = new D();
        E e1 = new E();

        System.out.println("First class .............");
        a1.a();

        System.out.println("Second class ..............");
        b1.a();
        b1.b();

        System.out.println("Third class ..............");
        c1.a();
        c1.c();

        System.out.println("Fourth class ..............");
        d1.a();
        d1.b();
        d1.d();

        System.out.println("Fourth class ...............");
        e1.a();
        e1.c();
        e1.e();
    }
}
