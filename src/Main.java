import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();
        System.out.print("Подтвердите пароль: ");
        String confirmPassword = scanner.nextLine();

        try {
            if (!isValidLogin(login)) {
                throw new WrongLoginException();
            }

            if (!isValidPassword(password, confirmPassword)) {
                throw new WrongPasswordException();
            }

            System.out.println("Логин и пароль верны!");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean isValidLogin(String login) throws WrongLoginException {
        if (login.length() >= 20 || !login.matches("[a-zA-Z0-9_]+")) {
            throw new WrongLoginException("Неверно указан логин!");
        }
        return true;
    }

    public static boolean isValidPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password.length() >= 20 || !password.matches("[a-zA-Z0-9_]+") || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Неверно указан пароль!");
        }
        return true;
    }
}