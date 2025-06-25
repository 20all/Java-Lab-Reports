import java.util.Scanner;

public class Qsn_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input present date
        System.out.print("Enter present year: ");
        int presentYear = input.nextInt();
        System.out.print("Enter present month (1-12): ");
        int presentMonth = input.nextInt();
        System.out.print("Enter present day (1-31): ");
        int presentDay = input.nextInt();

        // Input birth date
        System.out.print("Enter birth year: ");
        int birthYear = input.nextInt();
        System.out.print("Enter birth month (1-12): ");
        int birthMonth = input.nextInt();
        System.out.print("Enter birth day (1-31): ");
        int birthDay = input.nextInt();

        int year = presentYear-birthYear;
        int month = presentMonth-birthMonth;
        int day = presentDay-birthDay;

        if(month < 0 || (month == 0 && day < 0)) {
            year--;
            month+=12;
        }
        if(day < 0) {
            month--;
            day+=30;
        }
        if(month < 0) {
            year--;
            month+=12;
        }
        System.out.println("Your age: "+year+" years, "+month+" months, "+day+" days.");
    }
}
