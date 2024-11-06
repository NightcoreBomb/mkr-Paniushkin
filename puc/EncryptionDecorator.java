package puc;

/**
 * The EncryptionDecorator class provides simple encryption functionality for a message.
 * It extends the MessageDecorator class and modifies the getContent() method to return
 * the encrypted content.
 */
public class EncryptionDecorator extends MessageDecorator {

    /**
     * Constructs an EncryptionDecorator with the specified message.
     *
     * @param message the message to be encrypted
     */
    public EncryptionDecorator(Message message) {
        super(message);
    }

    /**
     * Returns the encrypted content of the message.
     *
     * @return the encrypted message content
     */
    @Override
    public String getContent() {
        return encrypt(message.getContent());
    }

    /**
     * Encrypts the given content using a simple method (reversing the text).
     *
     * @param content the content to be encrypted
     * @return the encrypted content
     */
    private String encrypt(String content) {
        // Simple encryption method for demonstration (reverses the text)
        return new StringBuilder(content).reverse().toString();
    }
}