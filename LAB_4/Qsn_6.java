import java.util.Scanner;

public class Qsn_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 10;
        System.out.println("Enter the age of "+size+" persons:");
        int[] persons = new int[size];
        for(int i = 0; i < size; i++) {
            persons[i] = input.nextInt();
        }
        int acc = 0;
        for(int p : persons) {
            if(p >= 16 && p <= 20) {
                acc++;
            }
        }
        System.out.println("No. of persons of age group 16-20 is "+acc);
        input.close();
    }
}
