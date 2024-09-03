import java.util.Scanner;

public class NumToWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = scan.nextInt();
        System.out.println(numberToWords(num));
    }
    public static String numberToWords(int num){
        if(num == 0){
            return "Zero";
        }
        if(num == 1000){
            return "One Thousand";
        }
        String nums = String.valueOf(num);
        String[] num11to19 = {"Eleven","Twelve","Thirteen","Fourteen","Fifteen"
                ,"Sixteen","Seventeen","Eighteen","Nineteen"};
        if(num>=11 && num<=19){
            return num11to19[Integer.parseInt(Character.toString(nums.charAt(1)-1))];
        }
        String[] ones = {" ","One","Two","Three","Four","Five","Six",
                "Seven","Eight","Nine"};
        if(String.valueOf(num).length()==1){
            return ones[num];
        }
        String[] tens = {" ","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy",
                "Eighty","Ninety"};
        if(String.valueOf(num).length()==2){

            return tens[Integer.parseInt(Character.toString(nums.charAt(0)))] +" "+
                    ones[Integer.parseInt(Character.toString(nums.charAt(1)))];
        }
        else{String hundred = " Hundred ";
            if(nums.charAt(1)=='1' && Integer.parseInt(Character.toString(nums.charAt(0)))<= 9){
                return ones[Integer.parseInt(Character.toString(nums.charAt(0)))] + hundred +
                        num11to19[Integer.parseInt(Character.toString(nums.charAt(2)-1))];
            }

            return ones[Integer.parseInt(Character.toString(nums.charAt(0)))] + hundred +
                    tens[Integer.parseInt(Character.toString(nums.charAt(1)))] +" "+
                    ones[Integer.parseInt(Character.toString(nums.charAt(2)))];
        }

    }
}
