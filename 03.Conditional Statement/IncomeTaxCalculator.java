import java.util.Scanner;
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        System.out.print("Enter your income : ");

        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
       // double tax;

        if(income <= 100) {
            System.out.println("Your tax is : " +(income*0));
        }else if(income > 100 && income <= 200){
            System.out.println("Your tax is : " +(income*0.2));
        }else if(income > 200 && income < 300){
            System.out.println("Your tax is : "+(income*0.3));
        }else{
            System.out.println("Your tax is : " +(income*0.5));
        }
    }
}
