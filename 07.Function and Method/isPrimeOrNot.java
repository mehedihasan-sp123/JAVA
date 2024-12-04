public class isPrimeOrNot {
    public static boolean isPrime(int n) {
        if(n==2){
            return true;
        }

        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(2));    }
}