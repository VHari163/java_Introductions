//   single inheritance
public class Task27 {
    static class domestic{
        void domestic_animals(){
            System.out.println("Domestic animals ");
            System.out.println("Like : Dog, Cat, Cow and etc....");
        }
    }
    static class wild extends domestic{
        void wild_animals(){
            System.out.println("Wild animals ");
            System.out.println("Like : lion, Tiger, Bear and etc....");
        }
    }

    public static void main(String[] args) {
        domestic d = new domestic();
        wild w = new wild();


        d.domestic_animals();


        w.wild_animals();
        w.domestic_animals();
    }
}
