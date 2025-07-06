
interface Num {
    int add(int x, int y);
    int diff(int x, int y);
}

class Calculate implements Num  {
    @Override
    public int add(int x, int y) {
        return x + y;
    }
    @Override
    public int diff(int x, int y) {
        return x - y;
    }
}
public class Qsn_37 {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 3;
        Calculate calculate = new Calculate();
        System.out.printf("%d + %d = %d%n",n1, n2,calculate.add(n1, n2));
        System.out.printf("%d - %d = %d%n",n1, n2,calculate.diff(n1, n2));
    }
}
