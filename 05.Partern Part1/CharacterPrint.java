public class CharacterPrint {
    public static void main(String[] args) {
        char ch = 'A';
        int n = 4;
        for(int line=1; line<=4; line++)
        {
            for(int ch=1; ch<=line; ch++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    
}
