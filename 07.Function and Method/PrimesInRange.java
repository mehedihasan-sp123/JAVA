public class PrimesInRange {
    public static void PrimeRange(int n) {
    for(int i=2; i<=n; i++) {
        if(isPrime(i)) {
            System.out.print(i+ " ");
        }
    }
    System.out.println();
}
public static void main(String args[] ) {
    PrimeRange(20);         // 2 to 20
  }
}