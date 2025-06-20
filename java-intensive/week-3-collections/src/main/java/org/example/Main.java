package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Madina", "217-904-96-27", "madina@google.com");
        Contact contact2 = new Contact("Edward", "111-111-11-11", "edward@boston.com");

        ContactManager contacts = new ContactManager();
        contacts.addContact(contact1);
        contacts.addContact(contact2);
        contacts.removeContact(contact2);

        contacts.displayAllContacts();

        contacts.lookupPhoneNumber("Madina");
        contacts.updatePhoneNumber("Madina","111-111-11-11");
        System.out.println("Check");
        contacts.displayAllContacts();


    }
}