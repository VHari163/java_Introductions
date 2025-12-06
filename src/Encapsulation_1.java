public class Encapsulation_1 {

    static class house{
        int bhk = 2;
        String site_name = "ck construction ";
        int estimate = 2000000;
        String colour = "orange_blue";
        boolean islocked = true;

        void lock(){
            islocked = true;
            System.out.println("door locked");
        }
        void unlock(){
            islocked = false;
            System.out.println("door unlocked");
        }

        //get class
        int getEsimate(){return estimate;}

        // set class
        void setEsimate(int esimatevalue){
            estimate = esimatevalue;
        }
    }
    public static void main(String[] args) {
        house h1 = new house();
        house h2 = new house();

        System.out.println(h1.colour);
        h2.colour = "red_orange";

        System.out.println(h2.colour);

        System.out.println(h1.site_name);

        h1.unlock();

        System.out.println(h2.estimate);

        h2.setEsimate(3000000);

        System.out.println(h2.getEsimate());
        System.out.println(h2.bhk);

        System.out.println(h2.estimate);

    }
}
