package session03;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookAppV01 {
    public static void main(String[] args) {
        String choice;
        ArrayList <String> names = new ArrayList<>();
        ArrayList <String> numbers = new ArrayList<>();
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Phone Book Menu");
            System.out.println("-----------------------");
            System.out.println("0. Exit");
            System.out.println("1. Add new contact");
            System.out.println("2. Print all contacts");
            System.out.println("3. Search contact/s");
            System.out.println("4. Print contacts count \n");
            System.out.println("Select your choice ");
            choice = scanner.nextLine();
            switch (choice){
                case "0" -> {
                    System.out.println("Exiting program.");
                    //scanner.close();
                    System.exit(0);
                }
                case "1" -> {
                    System.out.println("Please enter a name");
                    String name = scanner.nextLine();
                    System.out.println("Please enter a phone number");
                    String phoneNumber = scanner.nextLine();
                    names.add(name);
                    numbers.add(phoneNumber);
                    System.out.println("Contact updated successfully!");
                }
                case "2" -> {
                    if (names.isEmpty())
                        System.out.println("The phone book is empty!");
                    else {
                        System.out.println("The phone book is empty!");
                        for (int i = 0; i < names.size(); i++) {
                            System.out.println("Name: " + names.get(i));
                            System.out.println("Number: " + numbers.get(i));
                        }
                    }
                }
                case "3" -> System.out.println("Search contact/s");
                case "4" -> System.out.println("The contact count is: " + names.size() );
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
        while (choice != "0");
        //scanner close();
    }
}
