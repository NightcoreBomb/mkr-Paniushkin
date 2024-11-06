package puc;

public class Nospace extends MessageDecorator {
    public Nospace(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        // Отримуємо контент і видаляємо зайві пробіли
        return this.message.getContent().replaceAll("\\s", "").trim();
    }
}
