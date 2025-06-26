import java.util.Arrays;

public class Qsn_5 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int maxIndex = 0;
        int maxValue = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxIndex = i;
            }
        }
        System.out.println("Array : "+Arrays.toString(numbers));
        System.out.println("Maximum value is '"+maxValue+"' at index "+maxIndex);
    }
}
