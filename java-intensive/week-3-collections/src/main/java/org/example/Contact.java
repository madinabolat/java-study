package org.example;

public class Contact {
    public String name;
    private String phoneNumber;
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
