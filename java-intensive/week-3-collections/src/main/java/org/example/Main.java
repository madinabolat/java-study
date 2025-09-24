package org.example;

public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Madina", "123", "m@gmail.com");
        Contact contact2 = new Contact("Edward", "123", "e@gmail.com");
        Contact contact3 = new Contact("Madina", "456", "m2@gmail.com");
        ContactManager contactManager = new ContactManager();
        contactManager.addContact(contact1);
        contactManager.addContact(contact2);
        contactManager.addContact(contact3);
        contactManager.displayAllContacts();
        contactManager.lookupPhoneNumber("Madina");
        contactManager.lookupPhoneNumber("Peach");

    }
}