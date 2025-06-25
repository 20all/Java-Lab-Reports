public class Qsn_23 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 50; i++) {
            sum += i;
        }
        System.out.println("Sum of all natural numbers upto 50 = "+sum);
        sum = 50*51/2; // using formula sum of n natural numbers = n*(n+1)/2
        System.out.println("Sum of all natural numbers upto 50 = "+sum);
    }
}
