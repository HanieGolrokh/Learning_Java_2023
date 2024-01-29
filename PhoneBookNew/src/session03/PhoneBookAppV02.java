package session03;

import session03.Model.Contact;
import session03.Model.PersonalContact;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookAppV02 {
    private static ArrayList<Contact> contacts = new ArrayList<>();
    public static void main(String[] args) {
        String choice;
        Scanner scanner = new Scanner(System.in);
        do {
            displayMenu();
            choice = scanner.nextLine();
            switch (choice){
                case "0" -> {
                    System.out.println("Exiting program.");
                    //scanner.close();
                    System.exit(0);
                }
                case "1" -> addContact(scanner);
                case "2" -> printAllContacts();
                case "3" -> System.out.println("Search contact/s");
                case "4" -> System.out.println("The contact count is: " + contacts.size() );
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
        while (choice != "0");
        //scanner close();
    }

    private static void printAllContacts() {
        if (contacts.isEmpty())
            System.out.println("The phone book is empty!");
        else {
            System.out.println("The phone book is empty!");
            for (Contact contact : contacts) {
//                System.out.println("Name: " + contact.getName());
//                System.out.println("Number: " + contact.getNumber());
                System.out.println(contact.toString());
            }
        }
    }

    private static void addContact(Scanner scanner) {
//        Contact newContact = new Contact();
        System.out.println("Please enter a name");
        String name = scanner.nextLine();
//        newContact.setName(name);
        System.out.println("Please enter a phone number");
        String number= scanner.nextLine();
//        int number= scanner.nextInt();
//        newContact.setNumber(number);
//        Contact newContact = new Contact(name,number);
//        contacts.add(newContact);
//        contacts.add(new Contact(name,number));
        contacts.add(new PersonalContact(name,number));
        System.out.println("Contact updated successfully!");
    }

    private static void displayMenu() {
        System.out.println("-----------------------");
        System.out.println("Phone Book Menu");
        System.out.println("0. Exit");
        System.out.println("1. Add new contact");
        System.out.println("2. Print all contacts");
        System.out.println("3. Search contact/s");
        System.out.println("4. Print contacts count \n");
        System.out.println("Select your choice ");
    }
}
