public class Task30 {
    abstract static class Zoo{
        abstract void lifestyle();
        abstract void food();
    }


    static class wild extends Zoo{
        void lifestyle(){
            System.out.println("this wild animal live's in the forest .........");
        }
        void food(){
            System.out.println("this wild animal hunts the other animals in the forest for their food ..........");
        }
    }


    static class aquatic extends Zoo{
        void lifestyle(){
            System.out.println("this aquatic animal live's in the forest ...........");
        }
        void food(){
            System.out.println("This aquatic animals takes fungie as their food ...........");
        }
    }

    public static void main(String[] args) {

        wild wild1 = new wild();
        aquatic aquatic1 = new aquatic();


        System.out.println("");
        System.out.println(" Wild animals ");

        wild1.lifestyle();
        wild1.food();



        System.out.println("");
        System.out.println(" Aquatic animals ");

        aquatic1.lifestyle();
        aquatic1.food();
    }

}
