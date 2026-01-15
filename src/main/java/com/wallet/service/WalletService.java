public interface WalletService {
    void addMoney(double amount);
    void withdrawMoney(double amount);
    double getBalance();
}

