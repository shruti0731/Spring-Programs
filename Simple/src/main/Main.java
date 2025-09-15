package main;
import model.User;
import service.UserService;
import java.util.Scanner;

public class Main {
	private static UserService userService = new UserService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add User");
            System.out.println("2. Get All Users");
            System.out.println("3. Get User By ID");
            System.out.println("4. Update User");
            System.out.println("5. Delete User");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    addUser(scanner);
                    break;
                case 2:
                    getAllUsers();
                    break;
                case 3:
                    getUserById(scanner);
                    break;
                case 4:
                    updateUser(scanner);
                    break;
                case 5:
                    deleteUser(scanner);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addUser(Scanner scanner) {
        System.out.print("Enter User ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter User Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter User Email: ");
        String email = scanner.nextLine();

        User user = new User(id, name, email);
        userService.addUser(user);
        System.out.println("User added successfully.");
    }

    private static void getAllUsers() {
        userService.getAllUsers().forEach(System.out::println);
    }

    private static void getUserById(Scanner scanner) {
        System.out.print("Enter User ID: ");
        String id = scanner.nextLine();
        userService.getUserById(id).ifPresentOrElse(
                System.out::println,
                () -> System.out.println("User not found.")
        );
    }

    private static void updateUser(Scanner scanner) {
        System.out.print("Enter User ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter New User Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter New User Email: ");
        String email = scanner.nextLine();

        boolean updated = userService.updateUser(id, name, email);
        if (updated) {
            System.out.println("User updated successfully.");
        } else {
            System.out.println("User not found.");
        }
    }

    private static void deleteUser(Scanner scanner) {
        System.out.print("Enter User ID: ");
        String id = scanner.nextLine();
        boolean deleted = userService.deleteUser(id);
        if (deleted) {
            System.out.println("User deleted successfully.");
        } else {
            System.out.println("User not found.");
        }
    }
}
