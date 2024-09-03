public class PrimeNumber {
    public static void main(String[] args) {
        int num = 19;
        System.out.println(primeNo(num));

    }
    public static String primeNo(int num ){

        for(int i = 2;i < Math.sqrt(num); i++){
            if(num % i == 0){
                return "The given number is NOT prime";
            }
        }
        return "The given number is Prime";
    }
}
