package org.example;

import java.util.ArrayList;

public class ContactManager {
    ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void addContact(Contact contact){
        contacts.add(contact);
        //do i need this.contacts?
        //duplicates
    }

    public void removeContact(Contact contact){
        if (contacts.contains(contact)){
            contacts.remove(contact); //check for duplicate
        } else {
            System.out.println("This contact doesn't exist.");
        }
    }

    public void displayAllContacts(){
        System.out.println("All contacts");
        for (Contact contact : contacts){
            System.out.println(contact);
        }

    }


}
