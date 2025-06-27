import java.util.Scanner;
class Power {
        int n;
        int x;
        int toPower(int x, int n) {
            for(int i = 1; i <= n; i++) {
                x *= x;
            }
            return x;
        }
        void takeInput() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the integer: ");
            x = input.nextInt();
            System.out.print("Enter its power: ");
            n = input.nextInt();
            input.close();
        }
        int ans = 1;
        void calculate() {
            for(int i = 1; i <= n; i++) {
                ans *= x;
            }
        }
        void display() {
            System.out.printf("%d to the power %d = %d%n",x,n,ans);
        }
    }
public class Qsn_17 {
    
    public static void main(String[] args) {
        // Qsn_17 p = new Qsn_17();
        Power p = new Power();
        p.takeInput();
        p.calculate();
        p.display();
    }
}
