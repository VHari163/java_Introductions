public class foreach{
        public static void main(String[] args) {
            int [] arr ={2,4,5,6,8,9,7};
            int key =7;

            boolean found=false;

            for(int num:arr){
                if(num==key){
                    found =true;
                    break;
                }
            }
            if(found==true){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
    }