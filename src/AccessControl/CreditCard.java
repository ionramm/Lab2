package AccessControl;

/**
 * Created by ION on 24.10.2014.
 * carti de credit
 */
public class CreditCard {
    public String cardNumber;
    public double expenses;

    public CreditCard(String cardNo, double expens) {
        cardNumber = cardNo;
        expenses=expens;
    }

    public void charge(double amount) {
        expenses += amount;
    }

    public String getCardNumber(String password) {
        if (password.equals("SECRET!3*!")) {
            return cardNumber;
        }
        return "jerkface";
    }
}
