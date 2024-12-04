public class TypeCasting {
    public static void main(String[] args) {
        float a = 25.99f;
        int b = (int)a;     // here type casting 
        System.out.println(b);

        float marks = 99.999f;
        int marks2 = (int)(marks);
        System.out.println(marks2);

        char ch = 'a';
        int number = ch;
        System.out.println(number);

        char ch2 = 'b'; //'c', 'd', 'e'
        int number2 = ch2;
        System.out.println(number2);
    }
    
}
