import java.util.HashMap;

public class test {


    public static  void  main(String srgs[]){
        System.out.println(longestSubstring("abcabcd"));
    }
    public  static  int longestSubstring(String s){
        int max=0;
        HashMap<Character, Integer> hms=new HashMap<>();
for(int i=0; i<s.length(); i++){
if(hms.keySet().contains(s.charAt(i))){
    break;
}
    hms.put(s.charAt(i), i);
max=hms.size();
}
        return  max;
    }
}
