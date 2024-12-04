import java.util.Scanner;
public class threeItem {
    public static void main(String[] args) {
        System.out.println("Enter tour price:");

        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextInt();
        float pen = sc.nextInt();
        float book = sc.nextInt();
        double total = pencil+pen+book;
        double newTotal = total+(total*0.18);


        System.out.println("Price of pencil is: "+pencil);
        System.out.println("Price of pen is: "+pen);
        System.out.println("Price of book is: "+book);
        System.out.println("Your bill is:"+total +"Taka");
        System.out.println("with 18% tax bill is:" +newTotal +"Taka");


    }
}