import java.util.Scanner;

public class Qsn_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of Seconds:");
        int seconds = input.nextInt();
        int hours = seconds / 3600;
        int rSeconds = seconds % 3600;
        int minutes = rSeconds / 60;
        rSeconds = rSeconds % 60;
        System.out.println(seconds+" seconds = "+hours+" H "+minutes+" m and "+rSeconds+" s");
        input.close();
    }
}
