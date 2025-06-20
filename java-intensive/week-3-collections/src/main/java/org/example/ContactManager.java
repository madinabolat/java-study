package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class ContactManager {
    ArrayList<Contact> contacts = new ArrayList<Contact>();
    HashMap<String, String> namePhoneMap = new HashMap<>();

    //add: prevent duplicate contact (same name)
    public void addContact(Contact contact){
        contacts.add(contact);
        namePhoneMap.put(contact.name, contact.phoneNumber);
    }

    public void removeContact(Contact contact){
        contacts.remove(contact);
        namePhoneMap.remove(contact.name);
    }

    public void displayAllContacts(){
        int index = 0;
        while (index<contacts.size()){
            System.out.println(contacts.get(index).toString());
            index++;
        }
    }

    public void lookupPhoneNumber(String name){
        if (namePhoneMap.containsKey(name)){
            System.out.println("Phone number for " + name + " : "+ namePhoneMap.get(name));
        } else {
            System.out.println("Such contact doesn't exist. Please check again.");
        }

    }

    public void updatePhoneNumber(String name, String phoneNumber){
        if (namePhoneMap.containsKey(name)){
            int index = 0;
            while (index<contacts.size()){
                if (contacts.get(index).name.equals(name)){
                    contacts.get(index).phoneNumber=phoneNumber;
                }
                index++;
            }
            namePhoneMap.put(name,phoneNumber);
        } else {
            System.out.println("Such contact doesn't exist. Please check again.");
        }
    }


}
