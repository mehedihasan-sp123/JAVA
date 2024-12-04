public class ReverseGivenNumber {
    public static void main(String[]args) {
        int n = 89180024;
        int rev;

        while(n>0) {
            int LastDigit = n%10;
            rev = (rev*10)+LastDigit;
            n = n/10;
        }
        System.out.println(rev);    
    }
}
