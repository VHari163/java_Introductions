public class Sting_methods{
    public static void main(String[] args) {
        //
        String s1 = "HELLO";
        String s2 = "hello";
        String s3 = "world";

        //prints the character at the given index
        System.out.println("character at index 3 :"+s1.charAt(3));

        //checks the length of the string
        System.out.println("length of the string :"+s1.length());

        // index of the given characters in parenthasis "()"
        System.out.println(s2.indexOf("ll"));
        System.out.println(s3.indexOf("LL"));
        System.out.println(s1.indexOf("o"));

        //equals cases(checks the strings)
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        //contains
        System.out.println(s1.contains("HELL"));
        System.out.println(s2.contains("he"));

        //converting cases
        System.out.println(s1.toLowerCase());     //converting the uppercase letters to the lowercase letters

        System.out.println(s2.toUpperCase());    //converting the lowercase letters to the uppercase letters

        //replace the original string
        String s4 = "i love java program";
        String s5 = (s4.replace("program","Hari"));      //replacing the program word with hari
        System.out.println(s4);
        System.out.println(s5);

        //sub string
        System.out.println(s4.substring(5));   //printing the sub strings from the s4
        System.out.println(s4.substring(5,8));

        //string concatenation
        System.out.println((s1+" "+s2)); //adding two string
        int x=10;
        System.out.println(s5+" "+x); //adding primitive data types
    }
}
