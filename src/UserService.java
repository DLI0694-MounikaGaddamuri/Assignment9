import java.util.*;

class UserAlreadyExistsException extends Exception {
    UserAlreadyExistsException(String message) {
        super(message);
    }
}

class UserNotFoundException extends Exception {
    UserNotFoundException(String message) {
        super(message);
    }
}

public class UserService {

    public static void registerUser(ArrayList<String> list, String user_name) throws UserAlreadyExistsException {

        if (list.contains(user_name))
            throw new UserAlreadyExistsException(user_name + " already exists!");
        else
            list.add(user_name);
    }

    public static void checkUserExistence(ArrayList<String> list, String user_name) throws UserNotFoundException {

        if (!(list.contains(user_name)))
            throw new UserNotFoundException(user_name + " doesn't exist!");
//        else
//            System.out.println(user_name+" exists");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter user name:");
        String user1 = input.next();
        System.out.println("Enter user name:");
        String user2 = input.next();
        try {
            registerUser(list, user1);
            registerUser(list, user2);
            checkUserExistence(list, user1);
            checkUserExistence(list, user2);
        } catch (UserAlreadyExistsException e) {
            System.out.println(e.getMessage());
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}