package puc;

/**
 * The TextMessage class is a basic implementation of the Message interface.
 * It stores and returns the content of a plain text message.
 */
public class TextMessage implements Message {
    private String content;

    /**
     * Constructs a TextMessage with the specified content.
     *
     * @param content the content of the message
     */
    public TextMessage(String content) {
        this.content = content;
    }

    /**
     * Returns the content of the message.
     *
     * @return the message content
     */
    @Override
    public String getContent() {
        return content;
    }
}