import java.util.Arrays;
import java.util.stream.IntStream;

class Prime {
    private int n;
    Prime(int number) {
        this.n = number;
    }
    void primeGenerator() {
        // int[] numbers = IntStream.range(2, n).toArray();
        // int[] primeNumbers;
        for(int i = 2; i <= n; i++) {
            int acc = 0;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    acc++;
                    break;
                }
            }
            // System.out.print(acc+" ");
            if(acc == 0) {
                System.out.print(i+" ");
            }
        }
        // return primeNumbers;
    }
}
public class Qsn_18 {
    public static void main(String[] args) {
        int n = 100;
        Prime prime = new Prime(n);
        System.out.printf("Prime numbers from %d to %d%n:",0,n);
        prime.primeGenerator();
        // System.out.println(Arrays.toString(primeNumbers));
    }
}

