public class Qsn_7C {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 6-i; j++) {
                System.out.printf("%d",j);
            }
            System.out.print("\n");
        }
    }
}
