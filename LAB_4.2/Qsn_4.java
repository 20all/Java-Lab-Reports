public class Qsn_4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int target = 4;
        boolean isFound = false;
        for(int n : numbers) {
            if(target == n) {
                isFound = true;
                break;
            }
        }
        if(isFound) {
            System.out.println("Target '"+target+"' found.");
        } else {
            System.out.println("Target '"+target+"' not found!");
        }
    }
}
