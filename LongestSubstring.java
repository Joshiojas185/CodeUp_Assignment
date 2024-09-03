import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {
    public static void main(String[] args) {
        String a = "123456789";
        System.out.println(longestSubstring(a));
    }
    public static int longestSubstring(String s){
        int max = 0;
        List<Character> list = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            list.clear();
            for(int j = i;j<s.length();j++){
                if(list.contains(s.charAt(j))){
                    break;
                }
                else{
                    list.add(s.charAt(j));
                }
            }
            if(list.size()>max){
                max = list.size();
            }
        }
        return max;
    }
}
