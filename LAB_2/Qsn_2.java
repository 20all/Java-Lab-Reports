public class Qsn_2 {
    public static void main(String[] args) {
        // using for loop
        for(int i = 1; i <= 100; i++) {
            System.out.printf("%4d",i);
        }
        System.out.println("");
        // using while loop
        int w = 1;
        while(w <= 100) {
            System.out.printf("%4d",w);
            w++;
        }
        System.out.printf("\n");
        // using do-while loop
        int d =1;
        do {
            System.out.printf("%4d",d);
            d++;
        } while(d <= 100);
    }
}
