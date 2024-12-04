public class SmallestNumber {
    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        
        for(int i=0; i<numbers[i]; i++)
        {
            if(smallest>numbers[i])
            {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int numbers[] = {1,2,6,3,0};
        System.out.println("Smallest Number is :" +" " +getSmallest(numbers));
    }
}