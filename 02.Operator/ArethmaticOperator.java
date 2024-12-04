//package Operator; 
//Arethmatic Operaters are: +, -, *, /, %;

import java.util.Scanner;
public class ArethmaticOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Addition is:"+(a+b));

        System.out.println("Subtraction is:"+(a-b));

        System.out.println("Multipulacation is:"+(a*b));

        System.out.println("Divition is:" +(a/b));

        System.out.println("Modulous is:" +(a%b));
    }
    
}
