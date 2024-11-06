package puc;

public class Name extends MessageDecorator {
    // Ім'я та прізвище безпосередньо в коді
    private static final String FIRST_NAME = "Владислав";
    private static final String LAST_NAME = "Панюшкін";

    public Name(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        // Повертаємо ім'я, прізвище та контент повідомлення
        return FIRST_NAME + " " + LAST_NAME + " " + this.message.getContent();
    }
}
