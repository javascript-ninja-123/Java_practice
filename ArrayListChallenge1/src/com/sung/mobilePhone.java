package com.sung;

import java.util.ArrayList;

public class mobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContact = new ArrayList<Contact>();

    public mobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) >=0){
            System.out.println("Contact is already in file");
            return false;
        }
        myContact.add(contact);
        return true;
    }


    public boolean updateContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        if(position >=0){
            myContact.set(position, newContact);
            return true;
        }
        else{
            System.out.println("your old contact does not exist");
            return false;
        }
    }

    public boolean removeContact(Contact contact){
        int position = findContact(contact);
        if(position >=0){
            myContact.remove(contact);
            System.out.println("Your contact is removed");
            return true;
        }
        else{
            System.out.println("your contact cannot be deleted");
            return false;
        }
    }

    private int findContact(Contact contact){
        return this.myContact.indexOf(contact);
    }

    private int findContact(String name){
        for(int i=0; i<this.myContact.size(); i++){
            Contact contact = this.myContact.get(i);
            if(contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact){
        if(findContact(contact) >=0){
            return contact.getName();
        }
        else{
           return null;
        }
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if(position >=0){
            return this.myContact.get(position);
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List");
        for(int i=0; i<myContact.size(); i++){
            System.out.println("your name is" + myContact.get(i).getName() + " your phone number is " + myContact.get(i).getPhoneNumber());
        }
    }
}
