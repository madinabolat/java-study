package org.example;

public class Contact implements Comparable<Contact>{
    public String name;
    public String phoneNumber; //consider making this private
    public String email;

    public Contact(String name, String phoneNumber, String email){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString(){
        return "Contact{name="+name+", phone = "+phoneNumber+", email = "+email+"}";
    }

    @Override
    public int compareTo(Contact example) {
        return this.name.compareTo(example.name);
    }
}
