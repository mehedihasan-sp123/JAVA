public class PairsArray {
    public static void PrintPairs(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
            }
        }
        System.out.println(); // To add a newline after printing all pairs
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        PrintPairs(numbers);
    }
}
