public class Polymorphism {
        static class poly{
            void display(){System.out.println("hello i am polymorphism ");}
            void display(String a){System.out.println(a);}
            void display(int e, int b){
                int d = e + b;
                System.out.println(d);
            }
        }
    public static void main(String[] args) {
        poly d1 = new poly();
        d1.display();

        d1.display(2,3);

        d1.display("String");

    }
}
