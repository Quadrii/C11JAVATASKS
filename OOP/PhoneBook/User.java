package OOP.PhoneBook;

import java.util.ArrayList;

public class User {
    ArrayList<Contact> contactLists= new ArrayList<>();

    public void addNewContact(String name, String number, String address){
        Contact contactList = new Contact(name, number, address);
        contactLists.add(contactList);
    }
    public Contact viewContact(int id){
        for (Contact contact : contactLists){
            if (contact.getId() == id){
                return contact;
            }
        }
        throw new PhoneBookExceptions("No CONTACT with that name");
    }

    public void deleteContact(int id){
        for (Contact contact : contactLists){
            if (contact.getId() == id){
                contactLists.remove(contact);
                System.out.println("Contact deleted");
            }
        }
    }


    public ArrayList<Contact> getContacts() {
        return contactLists;
    }

}

