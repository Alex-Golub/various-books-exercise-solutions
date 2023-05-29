package utils.chapter_11;

/**
 * **11.8 (New Account class)
 *
 * @author Alex Golub
 * @since 02/06/2023 2:41 PM
 */
public enum Type {
    W("Withdraw"), D("Deposit");

    private final String type;

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
