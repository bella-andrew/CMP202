package OOP;

public class User {
    String name;
    String password;
    String login() {
        return "Logged in";
    }
    String logout() {
        return "Logged out";
    }
    String register() {
        if (name.isEmpty() || password.isEmpty()) {
            return "Can't be empty";
        } else {
            return "Successfull";
        }
    }
}
