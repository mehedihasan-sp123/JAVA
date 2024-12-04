import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        if(Number % 2 == 0){
            System.out.println("The number is:" +"Even");
        }else{
            System.out.println("The number is:" +"Odd");
        }
    }
}
