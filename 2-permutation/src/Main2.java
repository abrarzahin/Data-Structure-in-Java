public class Main2
{


    public static void main(String[] args) {
        String s1= "abc";
    String s2 ="cba";
    System.out.println(permutation(s1,s2));
    }
            

public static String sort (String s){
    char[] content = s.toCharArray(); 
    java.util.Arrays.sort(content);
    return new String(content);
}

public static boolean permutation(String s, String t){

    if(s.length() != t.length()){
        return false;
    }

    return sort(s).equals(sort(t));


        }

    }