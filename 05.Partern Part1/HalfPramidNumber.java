import java.util.Scanner;
public class HalfPramidNumber {
    public static void main(String[] args) {
    System.out.print("Enter your number: ");
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
        
    for(int line=1; line<=n; line++)
    {
      for(int number=1; number<=line; number++ )
        {
            System.out.print(number);
        }
            System.out.println();
        }
      }
    }
