public class Encapsulation_2 {
    static class student{

        private String name;
        private int age;
        private String rollno;

        void setRollno(String name){
            rollno = name;
        }
        public String getRollno(){
            return rollno;
        }
        public String getName(){
            return name;
        }
        void setName(String n){
            name = n;
        }


        public int getAge(){
            return age;
        }
        void  setAge(int a){
            age=a;
        }

    }
    public static void main(String[] args) {

        student s1 = new student();
        s1.setName("John");
        s1.setAge(25);
        s1.rollno="1dg2345";
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.print(s1.getRollno());

    }
}
