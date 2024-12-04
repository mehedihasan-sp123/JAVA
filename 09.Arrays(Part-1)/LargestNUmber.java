public class LargestNUmber {
    public static int getLergest(int number[]) {
         int largest = Integer.MIN_VALUE;

         for(int i=0; i<number.length; i++)
         {
            if(largest<number[i])
            {
                largest = number[i];
            }
         }
         return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {9,6,12,4,5,};
        System.out.print("Largest Number is :" +" " +getLergest(numbers));
    }
}