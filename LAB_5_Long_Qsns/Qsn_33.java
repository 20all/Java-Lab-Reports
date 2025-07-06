import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private double totalBalance;
    BankAccount(String aN, double tB) {
        this.accountNumber = aN;
        this.totalBalance = tB;
    }
    public void deposit() {
        System.out.println("Account no. "+accountNumber+" deposited.");
    }
    public void withdraw() {
        System.out.println("Amount withdrawn by Account no."+accountNumber);
    }
    public double getBalance() {
        return totalBalance;
    }
}

class SavingAccount extends BankAccount {
    private double interestRate;
    SavingAccount(String aN, double tB, double iR) {
        super(aN, tB);
        this.interestRate = iR;
    }
    public void addInterest() {
        System.out.printf("Interest rate %.2f added to the amount.%n",interestRate);
    }
}
public class Qsn_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Account number: ");
        String accNo = input.nextLine();
        System.out.print("Enter the balance amount: ");
        double totalBal = input.nextDouble();
        input.nextLine();
        System.out.print("Enter the interest rate: ");
        double interestRate = input.nextDouble();

        SavingAccount bankAccount = new SavingAccount(accNo, totalBal, interestRate);
        System.out.println("Total Bank balance: "+bankAccount.getBalance());
        bankAccount.addInterest();
        bankAccount.deposit();
        bankAccount.withdraw();
        input.close();
    }
}

// -> OUTPUT 
// Enter the Account number: 1000000101010
// Enter the balance amount: 50000
// Enter the interest rate: 13.33
// Total Bank balance: 50000.0
// Interest rate 13.33 added to the amount.
// Account no. 1000000101010 deposited.
// Amount withdrawn by Account no.1000000101010