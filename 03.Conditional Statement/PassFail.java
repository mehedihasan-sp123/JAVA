import java.util.Scanner;
public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String status = (marks >= 33)? "pass" : "fail";
        System.out.println("Your status is : " +status);
    }
    
}
