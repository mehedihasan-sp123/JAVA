import java.util.Scanner;
public class PossitivrNegetive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number % 2 == 0){
        System.out.println("The number is : possitive");
        }else{
        System.out.println("The number is : negetive");
        }
        System.out.println();
        double temp = sc.nextDouble();
        if(temp >= 100){
            System.out.println("You have fever");
        }else{
            System.out.println("You have no fever");
        }
    }
}
