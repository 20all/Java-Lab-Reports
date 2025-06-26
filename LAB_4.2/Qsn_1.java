import java.util.Arrays;

public class Qsn_1 {
    public static void main(String[] args) {
        // number
        int[] numbers = {2, 4, 25, 3, 1, 2, 10};
        System.out.println("Original numeric array = "+Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted numeric array = "+Arrays.toString(numbers));
        // string
        String[] str = {"Bishal", "Yuna", "Ranjana", "Kavi", "moon", "Fisti", "Moon", "Maon"};
        System.out.println("Original string array = "+Arrays.toString(str));
        Arrays.sort(str, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Sorted string array = "+Arrays.toString(str));
    }
}
