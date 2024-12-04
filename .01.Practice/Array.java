import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int marks[] = new int[100];
        System.out.println("Enter your marks:");
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Phy : "+marks[0]);
        System.out.println("Che : "+marks[1]);
        System.out.println("Math : "+marks[2]);

         marks[2] = marks[2]+1;
         System.out.println("Update marks is: "+marks[2]);

         int parsentage = (marks[0] + marks[1] + marks[2])/3;
         System.out.println("Parsentage is : "+parsentage +"%");
         System.out.println("Length of array is = "+marks.length);
    }
    
}
