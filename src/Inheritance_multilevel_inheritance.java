public class Inheritance_multilevel_inheritance {

        static class animal{
            void eat(){
                System.out.println("eating......");
            }
        }
        static class dog  extends animal{
            void bark(){
                System.out.println("barking......");
            }
        }
        static class cat extends dog{
            void meow(){
                System.out.println("meowing......");
            }
        }

    public static void main(String[] args) {
        animal a1 = new animal();
        dog a2 = new dog();
        cat a3 = new cat();

        a1.eat();
        a2.bark();
        a3.meow();

        a2.eat();
        a2.bark();

        a3.eat();
        a3.bark();
        a3.meow();

    }

}
