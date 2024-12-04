import java.util.Scanner;
public class SyntaxWithParameters {
    public static int CalculateSum() {

        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum is:"+sum);
        return sum;

    }

    public static void main(String[] args) {
        CalculateSum();
    }
    
}
