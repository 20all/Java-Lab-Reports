import java.util.Scanner;

class Number {
    private int x, y, z;
    Number(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public int getMax() {
        return ((x>y) && (x>z) ? x : (y > z) ? y: z); // used ternary for one line code(but it increases the complexity)
    }
}
public class Qsn_41 { // here according to question this class's name should be NumberDemo but i have made it Qsn_41 to maintain the sequence of java files in the folder
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any three numbers,");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        Number number = new Number(n1, n2, n3);

        int maxNumber = number.getMax();
        System.out.println("Max number : "+maxNumber);
        input.close();
    }
}
// -> OUTPUT
// Enter any three numbers,
// 0
// 9
// 88
// Max number : 88