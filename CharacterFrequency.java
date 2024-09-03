import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String to find its Character Frequency : ");
        String str = scan.nextLine();
        System.out.println( freqOfCharacter(str));
    }
    public static String freqOfCharacter(String s){
        int count = 0;
        List<String> list = new ArrayList<>();

        for(int i = 0;i<s.length();i++){
            for(int j = 0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(!list.contains(s.charAt(i)+String.valueOf(count))){
                list.add(s.charAt(i)+ String.valueOf(count));}
            count = 0;
        }


        String result = "";
        for(int i = 0;i<list.size();i++){
            result = result + (list.get(i));
        }
        return result;
    }
}
