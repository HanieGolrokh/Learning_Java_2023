import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneContactApp {
    public static List<String> contactList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        for (;;) {
            displayMenu();

            String userInput = myObj.nextLine();

            switch (userInput) {
                case "1" -> method1(myObj);
                case "2" -> method2();
                case "3" -> {
                    System.out.println("Exiting program.");
                    myObj.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
    // test

    public static void displayMenu() {
        System.out.println("Phone Contact");
        System.out.println("-----------------------");
        System.out.println("1. Add new contact");
        System.out.println("2. Print all contacts");
        System.out.println("3. Exit ");
        System.out.println("Select a menu item ");
    }

    public static void method1(Scanner myObj) {
        for (;;) {
            System.out.println("Please enter a name (type 'exit' to stop): ");
            String userName = myObj.nextLine();

            if (userName.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Please enter a number: ");
            String userNumber = myObj.nextLine();

            contactList.add("Name: " + userName + ", Number: " + userNumber);
        }
    }

    public static void method2() {
        System.out.println("Contacts in the list:");
        contactList.forEach(System.out::println);
    }
}
