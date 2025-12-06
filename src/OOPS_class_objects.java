public class OOPS_class_objects {
    static class house{

        //global variables
        int bhk = 2;
        String site_name = "chittoor";
        int estimate = 2000000;
        String colour = "orange_red";
        boolean islocked = true;

        //methods
        void lock(){
            islocked = true;
            System.out.println("Door locked");
        }
        void unlock(){
            islocked = false;
            System.out.println("Door unlocked");
        }
    }
    public static void main(String[] args) {

        house h1 = new house();
        house h2 = new house();

        System.out.println(h1.colour);
        System.out.println(h2.colour);
        System.out.println(h1.site_name);
        System.out.println(h1.site_name);
        h1.lock();
        h1.unlock();
        h2.lock();
        h2.unlock();
    }
}
