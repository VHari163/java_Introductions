public class Inheritance_hirechical_inheritance {

    static class animal {
        void eat() {
            System.out.println("eating......");
        }
    }

    static class dog extends animal {
        void bark() {
            System.out.println("barking......");
        }
    }

    static class cat extends animal {
        void meow() {
            System.out.println("meowing......");
        }
    }

    public static void main(String[] args) {
        animal a1 = new animal();
        dog a2 = new dog();
        cat a3 = new cat();

        System.out.println(" ");
        a1.eat();
        a2.bark();
        a3.meow();

        System.out.println(" ");
        a2.bark();
        a2.eat();

        System.out.println(" ");
        a3.meow();
        a3.eat();
    }
}
