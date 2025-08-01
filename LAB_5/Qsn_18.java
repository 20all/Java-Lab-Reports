import java.util.ArrayList;
import java.util.List;

class Prime {
    private int start;
    private int end;
    private List<Integer> primeNumbers;
    // constructor
    Prime(int s, int e) {
        this.start = s;
        this.end = e;
        this.primeNumbers = new ArrayList<>();
    }
    // prime checker method
    private boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    // prime number generator method
    public void generatePrime() {
        for(int i = start; i <= end; i++) {
            if(isPrime(i)) {
                primeNumbers.add(i);
            }
        }
    }
    // method to get the list of prime numbers
    public List<Integer> getPrimeNumbers() {
        return primeNumbers;
    }
}
public class Qsn_18 {
    public static void main(String[] args) {
        Prime prime = new Prime(1, 100); // creating Prime object from 1 to 100
        prime.generatePrime(); // generating prime numbers and adding them to the list
        System.out.println(prime.getPrimeNumbers()); // get the prime numbers added in the list
    }
}

