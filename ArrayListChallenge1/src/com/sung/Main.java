package com.sung;

public class Main {

    private static mobilePhone newMobile = new mobilePhone("330 330 330");

    public static void main(String[] args) {
	// write your code here

        addNewContact("Sungmin YI", "5309794076");
        addNewContact("Yonna YI", "123123123");
        updateContact("Sungmin YI", "123455666");
        myContactList();
    }

    public static void addNewContact(String name, String number){
        Contact newContact = Contact.createContact(name,number);
        newMobile.addNewContact(newContact);
    }

    public static void myContactList(){
        newMobile.printContacts();
    }

    public static void updateContact(String name,String phone){
        Contact existingContact = newMobile.queryContact(name);
        if(existingContact != null){
            Contact newContact = Contact.createContact(name,phone);
            newMobile.updateContact(existingContact,newContact);
        }

    }


}
