import java.util.Arrays;

public class Qsn_8 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int e : array) {
            if(e < smallest) {
                secondSmallest = smallest;
                smallest = e;
            } else if(e < secondSmallest && e != smallest) {
                secondSmallest = e;
            }
        }
        System.out.println("Array : "+Arrays.toString(array));
        if(secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element exists!(All elements are equal)");
        } else {
            System.out.println("Second smallest element = "+secondSmallest);
        }
    }
}
