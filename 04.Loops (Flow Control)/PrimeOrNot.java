import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n==2){
            System.out.println("N is prime ");       
        }else{
            boolean isPrime=true;
            for(int i=1; i<=Math.sqrt(n)-1; i++){
                if(n%i==0){
                    isPrime=false;
                }
            }
            if(isPrime = true){
                System.out.println("n ia prime number");
            }else{
                System.out.println("n is not a prime number");
            }
        }
    }
}