public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Неверно указан пароль!");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}