public class Main6
{


    public static void main(String[] args) {
      
        String S1="aabcccccaaa";
       

        System.out.println(compress(S1));
    }
            

public static String compress(String str){
    int finalLength = countCompress(str);
    if(finalLength>= str.length()){
        return str;
    }
    StringBuilder compressed = new StringBuilder(finalLength);
    int countConsecutive=0;
    for(int i=0;i<str.length();i++){
        countConsecutive++;
        if(i+1>= str.length()|| str.charAt(i)!=str.charAt(i+1)){
            compressed.append(str.charAt(i));
            compressed.append(countConsecutive);
            countConsecutive=0;
        }
        
    }
    return compressed.toString();

}
  public static int countCompress(String str){
      int compressedlength=0;
      int countConsecutive=0;
      for(int i =0;i<str.length();i++){
          countConsecutive++;

          if(i+1>=str.length()|| str.charAt(i)!=str.charAt(i+1)){
              compressedlength= compressedlength + 1 + String.valueOf(countConsecutive).length();
              countConsecutive = 0;
          }
      }
      return compressedlength;
       
    }
}
