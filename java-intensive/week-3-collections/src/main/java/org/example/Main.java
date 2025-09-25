package org.example;

public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Madina", "123", "m@gmail.com");
        Contact contact2 = new Contact("Edward", "123", "e@gmail.com");
        Contact contact3 = new Contact("Madina", "456", "m2@gmail.com");
        Contact contact4 = new Contact("George", "456", "m2@yahoo.com");
        Contact contact5 = new Contact("Paul", "456", "m2@google.com");
        ContactManager contactManager = new ContactManager();
        contactManager.addContact(contact1);
        contactManager.addContact(contact2);
        contactManager.addContact(contact3);
        contactManager.addContact(contact4);
        contactManager.addContact(contact5);
        contactManager.displayAllContacts();
        contactManager.lookupPhoneNumber("Madina");
        contactManager.lookupPhoneNumber("Peach");
        contactManager.displayEmailDomains();
    }
}