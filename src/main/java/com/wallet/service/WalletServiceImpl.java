public class WalletServiceImpl implements WalletService {

    private double balance = 0;

    public void addMoney(double amount) {
        balance += amount;
    }

    public void withdrawMoney(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

