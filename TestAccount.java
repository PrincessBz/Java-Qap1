
public class TestAccount {
    public static void main(String[] args) {
        // Creating accounts with parameterized constructor
        Account acc1 = new Account("A101", "John Doe", 5000);
        Account acc2 = new Account("A102", "Jane Doe", 4000);

        // Display initial balances using getBalance()
        System.out.println("Initial Balances:");
        System.out.println("Acc1 Balance: $" + acc1.getBalance());
        System.out.println("Acc2 Balance: $" + acc2.getBalance());

        // Transfer $1000 from Acc1 to Acc2
        acc1.transferTo(acc2, 1000);

        // Display updated balances using getBalance()
        System.out.println("\nBalances after $1000 transfer:");
        System.out.println("Acc1 Balance: $" + acc1.getBalance());
        System.out.println("Acc2 Balance: $" + acc2.getBalance());
    }
}
