/*22.
*/


public class Task22 {
    static class Oppo{
        int price = 30000;
        String mobile_name = "Oppo Reno 8t 5g ";
        String storage = "128 gb" ;
        String BatteryCapacity = "500000 MAH";
        String charging_time = "45 minutes";
        String Battery_life = "5 days";
    }
    static class Vivo{
        int price = 25000;
        String mobile_name = "Vivo v25 ";
        String storage = "100 gb" ;
        String BatteryCapacity = "350000 MAH";
        String charging_time = "60 minutes";
        String Battery_life = "4 days";
    }
    static  class Mi{
        int price = 30000;
        String mobile_name = "android version 10 ";
        String storage = "128gb" ;
        String BatteryCapacity = "200000 MAH";
        String charging_time = "90 minutes";
        String Battery_life = "3 days";
    }
    public static void main(String[] args) {
        Oppo o =  new Oppo();
        Vivo v = new Vivo();
        Mi m = new Mi();

        System.out.println(" ");
        System.out.println("Oppo Reno 8t 5g specifications : ");
        System.out.println("prise = "+o.price);
        System.out.println("Storage = "+o.storage);
        System.out.println("Battery Capacity = "+o.BatteryCapacity);
        System.out.println("Battery life = "+o.Battery_life);

        System.out.println(" ");
        System.out.println("Vivo v25specifications : ");
        System.out.println("prise = "+v.price);
        System.out.println("Storage = "+v.storage);
        System.out.println("Battery Capacity = "+v.BatteryCapacity);
        System.out.println("Battery life = "+v.Battery_life);

        System.out.println(" ");
        System.out.println("Mi specifications : ");
        System.out.println("prise = "+v.price);
        System.out.println("Storage = "+v.storage);
        System.out.println("Battery Capacity = "+v.BatteryCapacity);
        System.out.println("Battery life = "+v.Battery_life);

    }
}
