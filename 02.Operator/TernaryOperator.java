//TernaryOperator:    variable = condition? statement1 : statement2;

public class TernaryOperator {
    public static void main(String[] args) {

        int larger = (5 > 8)? 5 : 8;
        System.out.println(larger);

        String Type = (5 % 2 == 0)? "even" : "odd";
        System.out.println(Type);
    }
}
