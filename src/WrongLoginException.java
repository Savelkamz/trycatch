public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("Неверно указан логин!");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}