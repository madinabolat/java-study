package org.example;

public class Contact {
    public String name;
    public String phoneNumber; //consider making this private
    private String email;

    public Contact(String name, String phoneNumber, String email){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString(){
        return "Contact{name="+name+", phone = "+phoneNumber+", email = "+email+"}";
    }
}
