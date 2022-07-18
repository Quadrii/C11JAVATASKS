package OOP.PhoneBook;

import OOP.Main;

import java.util.Scanner;

public class PhoneBookMain {
    static User user = new User();
    private static void dummyContacts(){
        user.addNewContact("Tolu", "08123456730", "Gbagada, Lagos");
        user.addNewContact("Oyin", "08025456730", "Ikeja, Lagos");
        user.addNewContact("Yinka", "09023456730", "Ayobo, Lagos");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = "";
        dummyContacts();
        do {
            System.out.println("press 1 to add new contact");
            System.out.println("press 2 to view contacts");
            System.out.println("press 3 view a contact");
            System.out.println("press 4 to remove a contact");
            System.out.println("press 0 to quit");
            int response = input.nextInt();
            switch (response){
                case 1:
                    System.out.println("Enter name");
                    String name = input.next();
                    System.out.println("Enter phone number");
                    String number = input.next();
                    System.out.println("Enter address");
                    String address = input.next();
                    user.addNewContact(name,number, address);
                    System.out.println("Do you wish to continue? y/n ? ");
                    answer=input.next();
                    break;
                case 2:
                    System.out.println(user.getContacts());
                    break;
                case 3:
                    System.out.println("Enter contact Id");
                    int contactId = input.nextInt();
                    System.out.println(user.viewContact(contactId));
                    break;
                case 4:
                    System.out.println("Enter contact Id");
                    int removeContactId = input.nextInt();
                    user.deleteContact(removeContactId);

            }
        }while (answer.equals("y"));
    }
}
