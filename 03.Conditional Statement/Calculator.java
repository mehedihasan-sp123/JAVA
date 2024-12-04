import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a :  ");
        int a = sc.nextInt();

        System.out.println("Enter the value of b : ") ;
        int b = sc.nextInt();
        
        System.out.println("Enter the operator :  " );
        int operator = sc.nextInt();


       switch(Oprator)
       {
        case '+' : System.out.println(a+b);
        break;
        case '-' : System.out.println(a-b);
        break;
        case '*' : System.out.println(a*b);
        break;
        case '/' : System.out.println(a/b);
        break;
        case '%' : System.out.println(a%b);
        break;
        //default : System.out.println("Wrong operator");
       }
    }
}
