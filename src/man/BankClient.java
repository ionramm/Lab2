package man;

/**
 * Created by ION on 02.11.2014.
 */
public class BankClient extends Man {
    String cardNumber;

    public BankClient(String name, String cardNo) {
        super(name);
        setCard(cardNo);
    }

    @Override
    public boolean hasCard() {
        if (this.cardNumber != "")
            return true;
        return false;
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
}
