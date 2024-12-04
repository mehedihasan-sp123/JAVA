//Unary Operators are two types: 1)increment: ++, a=a+1; a++; ++a; 2)decrement: --; a=a-1; a--; --a;

public class UnaryOperator {
    public static void main(String[] args) {

        int a = 10;
        int b = ++a;             //pre increment: 1.Change value, and 2.Use same value;
        System.out.println(a);
        System.out.println(b);
        System.out.println();    // nextLine

        int A = 10;
        int B = A++;             //post increment: 1.Change value; 2.Use given value;
        System.out.println(A);
        System.out.println(B);
        System.out.println();    // nextLine
  
        int x = 10;
        int y = --x;             //pre decrement: 1.Change value, and 2.Use same value;
        System.out.println(x);
        System.out.println(y); 
        System.out.println();     // nextLine
 
        int X = 10;
        int Y = x--;              //post decrement:  1.Use given value, 2.Change value; 
        System.out.println(X); 
        System.out.println(Y); 
        System.out.println();      // nextLine

    }
}
