import java.util.Arrays;
interface NumberCheck {
    boolean check(int n);
}
// using anonymous function 
public class Qsn_10 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int odd = 0;
        int even = 0;
        System.out.println("Array : "+Arrays.toString(array));
        NumberCheck isEven = (n) -> n % 2 == 0; // lambda expression
        for(int a : array) {
            if(isEven.check(a)) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("No. of Even numbers: "+even);
        System.out.println("No. of Odd numbers: "+odd);
    }
}
