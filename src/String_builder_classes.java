public class String_builder_classes {
    public static void main(String[] args) {
        String str1 = "i love programming ❤";
        StringBuilder sb = new StringBuilder(str1);

        System.out.println(sb.length());

        sb.append(" gamming 🏀");
        System.out.println(sb);

        sb.insert(20," and");
        System.out.println(sb);

        sb.replace(2,6,"like");
        sb.replace(2,3,"L");
        System.out.println(sb);

        sb.delete(19,24);
        System.out.println(sb);

        //reverse
        sb.reverse();
        String str = sb.toString();
        System.out.println(str);

    }
}
