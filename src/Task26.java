/*26. Hirechical inheritance

 */

public class Task26 {
    static class zoo{
        void aquatic_animals_do(){
            System.out.println("this aquatic animals lives inside of the water");
        }
        void wild_animals_do(){
            System.out.println("this wild animals lives outside of the water");
        }
    }
    static class aquatic_animals extends zoo{
        void water(){
            System.out.println("like : Fish, Sea horse and etc.....");
        }
    }
    static class wild_animals extends zoo{
        void wild(){
            System.out.println("like : Lion, Tiger and etc.....");
        }
    }
    public static void main(String[] args) {
        zoo z = new zoo();
        aquatic_animals a = new aquatic_animals();
        wild_animals w = new wild_animals();

        System.out.println("");
        System.out.println("zoo");
        z.aquatic_animals_do();
        z.wild_animals_do();

        System.out.println("");
        System.out.println("Aquatic animals");
        a.water();
        a.aquatic_animals_do();

        System.out.println("");
        System.out.println("Wild animals");
        w.wild();
        w.wild_animals_do();

    }
}
