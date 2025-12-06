public class Inheritance_multiple_inheritance_1 {
    static class a{
        void soound(){
            System.out.print("I am A ");
        }
    }
    static class b extends a{
        void soound(){
            System.out.print("I am B ");
        }
    }
    static class c extends a{
        void soound(){
            System.out.print("I am C ");
        }
    }
    static class d extends b,c{
        void soound(){
            System.out.print("I am D ");
        }
    }
    public static void main(String[] args) {
        a a1=new a();
        b b1=new b();
        c c1=new c();
        d d1=new d();

        a1.soound();
        b1.soound();
        c1.soound();
        d1.soound();
}
