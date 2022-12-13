package com.addressbook;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book system Program ");
        ContactPerson cp = new ContactPerson();
        System.out.println(cp.toString());
        AddingContact contact= new AddingContact();
        //contact.addContact();
        System.out.println(contact.toString());
    }
    }
