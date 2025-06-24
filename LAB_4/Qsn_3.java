import java.util.Scanner;

public class Qsn_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many Person's data do you want to enter? ");
        int n = input.nextInt();
        int[] age = new int[n];
        System.out.println("Enter the age of "+n+" persons:");
        for(int i = 0; i < n; i++) {
            age[i] = input.nextInt();
        }
        int youngest = age[0];
        int oldest = age[0];
        for(int i : age) {
            if(i < youngest) {
                youngest = i;
            }
            if(i > oldest) {
                oldest = i;
            }
        }
        System.out.println("Youngest age: "+youngest);
        System.out.println("Oldest age: "+oldest);
        input.close();
    }
}
