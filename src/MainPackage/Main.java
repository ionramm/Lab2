package MainPackage;

import AccessControl.CreditCard;

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
    }
}
