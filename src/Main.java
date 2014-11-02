import access_control.CreditCard;
import interfaces.IHacker;
import man.BankClient;
import man.Hacker;

/**
 * Created by ION on 24.10.2014.
 * comentariu
 */
public class Main {
    static void maliciousMethod(CreditCard card) {
        card.expenses = 0;
        System.out.println(card.cardNumber);
    }

    public static void main(String[] args) {
        maliciousMethod(new CreditCard("484652", 500.4));
        IHacker hacker1 = new Hacker("Moebius", "RO6589474848668");
        Man client1 = new BankClient("Eratostene", "RO2343745383638373");
        BankClient client2 = new BankClient(null);

        try {
            hacker1.Hack(client1.getCard());
        } catch (HackException e) {
            System.out.println("Exception while hacking: " + e.getMessage());
        }

        /**
         * Created by ION on 02.11.2014.
         * se verifica daca client2 detine card
         */
        client2.setName("Strabo");
        System.out.println("Cardul lui este?\n" + (BankClient.hasCard() ? "Yes!" : "No!"));

    }
}
