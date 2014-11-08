package man;

import interfaces.IHacker;

/**
 * Created by ION on 02.11.2014.
 */
public class Hacker extends Man implements IHacker {
    String cardNumber;

    public Hacker(String name, String cardNo) {
        super(name);
        setCard(cardNo);
    }

    /**
     * Sets the card number of the client
     *
     * @param cardNo The card number
     */
    public void setCard(String cardNo) {
        this.cardNumber = cardNo;
    }

    /**
     * Gets the card number of the client
     */
    public String getCard() {
        return cardNumber;
    }

    @Override
    public void Hack() {
        if (getName() == null) {
            System.out.println("Card Hacked!");
            return;
        }

        System.out.println(getName() + " has hacked.");
    }

    @Override
    public boolean Hack(String CardNumber) {
        if (CardNumber != "")
            return true;
        return false;
    }

    @Override
    public boolean hasCard(String cardNumber) {
        if (cardNumber != "")
            return true;
        return false;
    }
}
