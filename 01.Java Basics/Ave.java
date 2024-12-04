import java.util.Scanner;
public class Ave{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double sum = a+b+c;
        double ave = sum/3;
        System.out.println("Average is: "+ave);
    }
}