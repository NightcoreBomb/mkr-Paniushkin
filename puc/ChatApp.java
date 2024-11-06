package puc;

/**
 * The ChatApp class demonstrates the use of the Decorator pattern for message processing.
 * Allows dynamic modifications to a message, such as encryption, adding hashtags, and emojis.
 */
public class ChatApp {
    /**
     * The main method to run the ChatApp application.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a basic message
        Message message = new TextMessage("  H  e ll   o, Wo  r  l  d!");

        // Add different dynamic processing methods to the message
        Message encryptedMessage = new EncryptionDecorator(message);
        Message nospace = new Nospace(encryptedMessage);
        Message DateTimeDecorator = new DateTimeDecorator(nospace);
        Message name = new Name(DateTimeDecorator);

        // Output the results
        System.out.println("Original Message:\n" + message.getContent() + "\n");
        System.out.println("Encrypted Message: \n" + encryptedMessage.getContent() + "\n");
        System.out.println("Encrypted Message + Nospace: \n" + nospace.getContent() + "\n");
        System.out.println("Encrypted Message + Nospace + date: \n" + DateTimeDecorator.getContent() + "\n");
        System.out.println("Encrypted Message + Nospace + date + name: \n" + name.getContent() + "\n");
    }
}