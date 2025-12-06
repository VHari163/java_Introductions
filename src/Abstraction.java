public class Abstraction {
    abstract static class nexon{
        abstract void wheels();
        abstract void ac_control();
    }
    static class nexonbase extends nexon{
        void ac_control(){
            System.out.println("manual ac control");
        }
        void wheels(){
            System.out.println("steel wheels");
        }
    }
    static class nexontop extends nexon{
        void ac_control(){
            System.out.println("automatic ac control");
        }
        void wheels(){
            System.out.println("alloy wheels");
        }
    }
    public static void main(String[] args) {

        nexonbase b1 = new nexonbase();

        nexontop b2 = new nexontop();

        b1.ac_control();
        b1.wheels();

        System.out.print("");

        b2.ac_control();
        b2.wheels();
    }
}
