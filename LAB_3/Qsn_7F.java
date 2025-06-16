public class Qsn_7F {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 5; j >= 1; j--) {
                if(j>i) {
                    System.out.printf(" ");
                }else {
                System.out.printf("%d",i);
                }
            }
            System.out.print("\n");
        }
    }
}
