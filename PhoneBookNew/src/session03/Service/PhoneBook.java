package session03.Service;

import session03.Model.BusinessContact;
import session03.Model.Contact;
import session03.Model.PersonalContact;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    private ArrayList<Contact> contacts = new ArrayList<>();
    public void run(){
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
    private void printAllContacts() {
        if (contacts.isEmpty())
            System.out.println("The phone book is empty!");
        else {
            for (Contact contact : contacts) {
                System.out.println(contact.toString());
            }
        }
    }

    private void addContact(Scanner scanner) {
        selectContactType();
        int type = scanner.nextInt();
        scanner.nextLine();
        if(type == 1){
            System.out.println("Please enter a name");
            String name = scanner.nextLine();
            System.out.println("Please enter a family");
            String family = scanner.nextLine();
            System.out.println("Please enter a phone number");
            String number= scanner.nextLine();
            PersonalContact personalContact = new PersonalContact(name,number);
            personalContact.setFamily(family);
            contacts.add(personalContact);
            System.out.println("Contact added successfully!");
        }
        else {
            System.out.println("Please enter a name");
            String name = scanner.nextLine();
            System.out.println("Please enter a phone number");
            String number= scanner.nextLine();
            System.out.println("Please enter a fax");
            String fax = scanner.nextLine();
            BusinessContact businessContact = new BusinessContact(name,number);
            businessContact.setFax(fax);
            contacts.add(businessContact);
            System.out.println("Contact added successfully!");
        }
    }

    private void selectContactType() {
        System.out.println("Contact Type");
        System.out.println("1. Personal");
        System.out.println("2. Business");
        System.out.println("Select your Type");
    }

    private void displayMenu() {
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
