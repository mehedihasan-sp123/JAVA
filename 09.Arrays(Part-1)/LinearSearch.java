public class LinearSearch {
    public static int linSearch( int numbers[], int key) {
        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
 public static void main(String[] args) {
    int numbers [] = {50,60,70,80,90,100};
    int key = 70;

    int index = linSearch(numbers, key);
    if(index == -1)
    {
        System.out.println("Not Found");
    }else{
        System.out.println("Index is : " +index);
    }
 }
}