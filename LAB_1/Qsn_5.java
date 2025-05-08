import java.util.Scanner;
public class Qsn_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of two circles:");
        double radius1 = input.nextDouble();
        double radius2 = input.nextDouble();
        double bigRadius, smallRadius;
        if(radius1 > radius2) {
            bigRadius = radius1; 
            smallRadius = radius2;
        } else {
            bigRadius = radius2; 
            smallRadius = radius1;
        }
        double area = Math.PI *(bigRadius*bigRadius - smallRadius*smallRadius);
        System.out.printf("Area Between the concentric Circles is: %.2f%n",area);
        input.close();
    }
}
