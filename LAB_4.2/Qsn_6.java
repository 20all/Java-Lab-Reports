import java.util.Arrays;

public class Qsn_6 {
    public static int[] copyArray(int[] sourceArray) {
        int[] arrayCopied = new int[sourceArray.length];
        for(int i = 0; i < arrayCopied.length; i++) {
            arrayCopied[i] = sourceArray[i];
        }
        return arrayCopied;
    }
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Original Array: "+Arrays.toString(originalArray));
        // array copy using method
        int[] copy1 = copyArray(originalArray);
        System.out.println("Array copied using method: "+Arrays.toString(copy1));
        // array copy using iteration
        int[] copy2 = new int[originalArray.length];
        for(int i = 0; i < originalArray.length; i++) {
            copy2[i] = originalArray[i];
        }
        System.out.println("Array copied using Iteration: "+Arrays.toString(copy2));
    }
}
