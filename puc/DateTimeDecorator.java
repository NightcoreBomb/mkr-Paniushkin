package puc;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The DateTimeDecorator class adds the current date and time to the end of the message content.
 * It extends the MessageDecorator class and modifies the getContent() method.
 */
public class DateTimeDecorator extends MessageDecorator {

    /**
     * Constructs a DateTimeDecorator with the specified message.
     *
     * @param message the message to be decorated with the current date and time
     */
    public DateTimeDecorator(Message message) {
        super(message);
    }

    /**
     * Returns the content of the message with the current date and time added at the end.
     *
     * @return the message content with the current date and time
     */
    @Override
    public String getContent() {
        // Формат дати і часу у вигляді "yyyy-MM-dd HH:mm:ss"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String currentDateTime = LocalDateTime.now().format(formatter);

        return message.getContent() + " " + currentDateTime;
    }
}
