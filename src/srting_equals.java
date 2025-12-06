public class srting_equals {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("adc");

        if(s1 == s3) {
            System.out.println("they are equal");
        }
        else {
            System.out.println("they are not equal");
        }

        if(s1.equals(s3)) {
            System.out.println("they are equal");
        }
        else {
            System.out.println("they are not equal");
        }


    }
}
