import java.util.Arrays;
interface NumberCheck {
    boolean check(int n);
}
// using anonymous function 
// here i don't need to use function, i can simply check the even or odd in if block, but i wanted to explore the Lambda expression for anonymous function in java 
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
