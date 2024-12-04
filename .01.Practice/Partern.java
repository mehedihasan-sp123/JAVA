public class Partern {
    public static void HeRec(int totalRow, int totalCol) {
        for(int i=1; i<=totalRow; i++){
            for(int j=1; j<=totalCol; j++) {

            if(i==1 || i==totalRow || j==1 || j==totalCol) {
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
          }
        }
    }
    public static void main(String[] args) {
        HeRec(4,4);
    }
}