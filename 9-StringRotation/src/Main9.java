public class Main9
{


    public static void main(String[] args) {
      
        String S1="waterbottle";
        String S2="erbottlewat";
        System.out.println(isRotation(S1,S2));
    }
   
    public static boolean isRotation(String s1,String s2){
        int len=s1.length();
        if(len==s2.length()&&len>0){
            String s1s1=s1+s1;
            return isRotation(s1s1,s2);
        }
        return false;

    }
   



  
}
