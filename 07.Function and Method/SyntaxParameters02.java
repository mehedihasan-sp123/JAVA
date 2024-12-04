import java.util.Scanner;

public class SyntaxParameters02 {
    public static int CalculateSum(int a, int b) {    // (Parameter/Formal parameter)
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        int sum = CalculateSum(a,b);           //  (Arguments or Actual Parameters)
        System.out.println("Sum is: "+sum);
    }
}