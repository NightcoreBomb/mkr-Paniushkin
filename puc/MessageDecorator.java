package puc;

/**
 * The MessageDecorator class implements the Message interface and serves as a base
 * decorator for adding additional functionality to a message. It holds a reference
 * to a Message object and delegates the getContent() method to it.
 */
public class MessageDecorator implements Message {
    protected Message message;

    /**
     * Constructs a MessageDecorator with the specified message.
     *
     * @param message the message to be decorated
     */
    public MessageDecorator(Message message) {
        this.message = message;
    }

    /**
     * Returns the content of the decorated message.
     *
     * @return the message content
     */
    @Override
    public String getContent() {
        return message.getContent();
    }
}