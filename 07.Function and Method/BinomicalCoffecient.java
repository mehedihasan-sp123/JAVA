public class BinomicalCoffecient {
    public static int binCoeff(int n, int r){  //n=10, r=2;

        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }
    public static void main(String[] args) {
        System.out.println(bincoeff(10, 2));
    }
}