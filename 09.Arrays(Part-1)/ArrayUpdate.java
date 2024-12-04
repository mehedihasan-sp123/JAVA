public class ArrayUpdate {
    public static void Update(int marks[],int nonChangable){
        nonChangable = 10;
        for(int i=0; i<marks[i]; i++)
        {
            marks[i] = marks[i]+i;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97,98,99};

        for(int i=0; i<=marks.length; i++);
        {
            System.out.println("Your value is:"+ marks[i]);
        }
        System.out.println();
    }
    
}
