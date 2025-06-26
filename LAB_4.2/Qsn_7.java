import java.util.Arrays;
import java.util.Scanner;

public class Qsn_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        while(true) {
            System.out.print("Enter the number of persons: ");
            n = input.nextInt();
            if(n <= 0) {
                System.out.println("number of persons must be greater than '0'!");
            } else {
                break;
            }
        }
        int[] ages = new int[n];
        System.out.println("Enter the ages of "+n+" persons:");
        for(int i = 0; i < n; i++) {
            System.out.print("Age "+(i+1)+" : ");
            ages[i] = input.nextInt();
            while (ages[i] <= 0) {
                System.out.println("Ages should be above '0'!!");
                System.out.print("Age "+(i+1)+" : ");
                ages[i] = input.nextInt();
            }
        }
        int oldest = ages[0];
        int youngest = ages[0];
        for(int i = 0; i < ages.length; i++) {
            if(ages[i] > oldest) {
                oldest = ages[i];
            }
            if(ages[i] < youngest) {
                youngest = ages[i];
            }
        }
        System.out.println("Ages of "+n+" persons : "+Arrays.toString(ages));
        System.out.println("Oldest age: "+oldest);
        System.out.println("Youngest age: "+youngest);
        input.close();
    }
}
