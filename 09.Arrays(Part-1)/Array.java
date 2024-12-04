import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        //DataType arrayNAme = []
        int marks[] = new int[100];
        System.out.println("Enter your marks:");

        Scanner sc = new Scanner(System.in);
        marks [0] = sc.nextInt();
        marks [1] = sc.nextInt();
        marks [2] = sc.nextInt();

        System.out.println("phy : "+marks[0]);
        System.out.println("che : "+marks[1]);
        System.out.println("math :"+marks[2]);

        marks[2] = 100;      //Update marks
        System.out.println("math: "+marks[2]);
        
        int parcentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("Parcentange is: "+parcentage+"%");
        System.out.println("Length of arrray is :" +marks.length);

    }
}