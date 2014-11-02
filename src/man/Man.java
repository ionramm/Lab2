package man;

/**
 * Created by ION on 02.11.2014.
 */
public abstract class Man {
    /* The name of the man */
    private String mName;

    /**
     * The default constructor that initializes the man with the given name
     *
     * @param name The name of the man
     */
    public Man(String name) {
        this.mName = name;
    }

    /**
     * This method must be overwritten by all the subclasses
     *
     * @param cardNumber The name of the card
     * @return <code>True</code> if the man has a card, <code>False</code> otherwise
     */
    public abstract boolean hasCard(String cardNumber);

    /**
     * Sets the name of the man
     *
     * @param name The name of the man
     */
    public void setName(String name) {
        this.mName = name;
    }

    /**
     * Gets the name of the man
     *
     * @return The name of the sman
     */
    public String getName() {
        return mName;
    }
}
