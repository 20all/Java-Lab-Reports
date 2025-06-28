public class Qsn_2 {
    public static void main(String[] args) {
        int n = 10;
        int acc = 0;
        for(int i = 2; i <= n; i++) {
            for(int j = 2; j < i; j++) {
                if(i%j == 0) {
                    acc++;
                    break;
                }
            }
            // System.out.printf(" %d",acc);
            if(acc!=0) {
                System.out.printf("%4d",i);
            } 
        }
    }
}
