import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        System.out.println("Enter your number: " );
        Scanner sc = new scanner(System.in){
            int n = sc.nextInt();
            int sum = 0;

            int i = 1;
            while(i <= n){
                sum=sum+i;
                i++;
            }
        }
        System.out.println("Sum of First Natural number is:"+sum);
    }
}
