package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ContactManager {
    ArrayList<Contact> contacts = new ArrayList<Contact>();
    HashMap<String, String> phoneNumbers = new HashMap<>();

    public void lookupPhoneNumber(String name){
        if (phoneNumbers.containsKey(name)){
            System.out.println(name+"'s phone number: "+ phoneNumbers.get(name));
        }
        else {
            System.out.println("This contact doesn't exist.");
        }

    }

    public void updatePhoneNumber(String name, String phoneNumber){
        if (phoneNumbers.containsKey(name)){
            phoneNumbers.put(name,phoneNumber);
            System.out.println(name+"'s new phone number: "+ phoneNumber);
            for (Contact c : contacts){
                if (c.name.equals(name)){
                    c.phoneNumber = phoneNumber;
                    return;
                }
            }
        }
        else {
            System.out.println("This contact doesn't exist.");
        }
    }

    public void addContact(Contact contact){
        for (Contact c : contacts){
            if (c.name.equals(contact.name)){
                System.out.println("The contact already exists");
                return;
            }
        }
        contacts.add(contact);
        phoneNumbers.put(contact.name, contact.phoneNumber);
    }

    public void removeContact(Contact contact){
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()){
            Contact c = iterator.next();
            if (c.name.equals(contact.name)){
                iterator.remove();
                phoneNumbers.remove(contact.name);
                //need to remove from iterator - not contacts
                //no need to mention the element - it removes the current element it is pointing at
                return;
            }
        }
        //need iterator here and not for loop because when you remove an element in the loop iteration
        //then the underlying structure is modified but the for loop is not finished yet, and it expects old structure
        //even if you do return - still best practice to use iterator instead
        System.out.println("This contact doesn't exist.");
    }

    public void displayAllContacts(){
        System.out.println("All contacts:");
        for (Contact contact : contacts){
            System.out.println(contact);
        }
    }
}
