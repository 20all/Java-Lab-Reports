public class Qsn_6 {
    public static void main(String[] args) {
        int start = 100;
        int end = 200;
        System.out.println("Numbers from "+start+" to "+end+" which are exactly divisible by 4 are:");
        for(int i = start; i <= end; i++) {
            if(i%4 == 0) {
                System.out.printf("%4d",i);
            }
        }
    }
}
