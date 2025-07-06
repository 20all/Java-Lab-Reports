import java.util.Scanner;

class Rectangle {
    private int length, bredth;
    Rectangle(int l, int b) {
        this.length = l;
        this.bredth = b;
    }
    public int computeArea() {
        return length * bredth;
    }
    public void displayArea() {
        System.out.println("Area : "+computeArea());
    }
}
public class Qsn_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rectangle 1's details");
        System.out.print("length: ");
        int l1 = input.nextInt();
        System.out.print("bredth: ");
        int b1 = input.nextInt();
        System.out.println("Enter the rectangle 2's details");
        System.out.print("length: ");
        int l2 = input.nextInt();
        System.out.print("bredth: ");
        int b2 = input.nextInt();

        Rectangle rectangle1 = new Rectangle(l1, b1);
        Rectangle rectangle2 = new Rectangle(l2, b2);

        int rectangle1Area = rectangle1.computeArea();
        int rectangle2Area = rectangle2.computeArea();
        int largerRectangleArea = rectangle1Area > rectangle2Area ? rectangle1Area : rectangle2Area;
        System.out.println(" Area of larger rectangle : "+ largerRectangleArea);
        // if(rectangle1Area > rectangle2Area) {
        //     rectangle1.displayArea();
        // } else {
        //     rectangle2.displayArea();
        // }
        input.close();
    }
}
// -> OUTPUT
// Enter the rectangle 1's details
// length: 2
// bredth: 3
// Enter the rectangle 2's details
// length: 3
// bredth: 4
//  Area of larger rectangle : 12