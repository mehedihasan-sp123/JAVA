import java.util.Scanner;
public class Product {
    public static int multiply(int a, int b){
        int product = a*b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        int prod = multiply(a,b);
        System.out.println("product is: " + prod);

        prod = multiply(3,5);
        System.out.println("Product is :" + prod);
    }
    
}
