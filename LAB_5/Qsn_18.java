class Prime {
    private int n;
    Prime(int number) {
        this.n = number;
    }
    void primeGenerator() {
        for(int i = 2; i <= n; i++) {
            int acc = 0;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    acc++;
                    break;
                }
            }
            if(acc == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
public class Qsn_18 {
    public static void main(String[] args) {
        int n = 100;
        Prime prime = new Prime(n);
        System.out.printf("Prime numbers from %d to %d%n:",0,n);
        prime.primeGenerator();
    }
}

