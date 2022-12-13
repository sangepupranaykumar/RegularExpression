package com.addressbook;
import java.util.Scanner;
import java.util.ArrayList;
public class EditExixtingContact {
    Scanner scanner = new Scanner(System.in);
    AddingContact contact = new AddingContact();
    ArrayList<AddingContact> contactsArrayList = new ArrayList<AddingContact>();

    /*
     * Using Scanners & ArrayList for Editing Existing Contacts
     */
    public void addContact() {
        AddingContact contact = new AddingContact();
        System.out.println("Enter your FirstName: ");
        contact.setFirstName(scanner.next());
        System.out.println("Enter your LastName: ");
        contact.setLastName(scanner.next());
        System.out.println("Enter your Email: ");
        contact.setEmail(scanner.next());
        System.out.println("Enter your Address: ");
        contact.setAddress(scanner.next());
        System.out.println("Enter your City: ");
        contact.setCity(scanner.next());
        System.out.println("Enter your State: ");
        contact.setState(scanner.next());
        System.out.println("Enter your Zipcode: ");
        contact.setZip(scanner.nextInt());
        System.out.println("Enter your Mobile Number: ");
        contact.setMobile(scanner.nextLong());
        contactsArrayList.add(contact);
    }

    public void showContacts() {
        System.out.println(contact.toString());
        for (int i = 0; i < contactsArrayList.size(); i++) {
            AddingContact contacts = contactsArrayList.get(i);
            System.out.println(contacts.toString());
        }
    }

    public void editContact() {

        System.out.println("Enter the First Name to Edit : ");
        String FirstName = (scanner.next());
        boolean IsAvaible = false;

        for (AddingContact contact : contactsArrayList) {
            if (contact.getFirstName().equals(FirstName)) {
                IsAvaible = true;

                System.out.println("Enter your FirstName: ");
                contact.setFirstName(scanner.next());
                System.out.println("Enter your LastName: ");
                contact.setLastName(scanner.next());
                System.out.println("Enter your Email: ");
                contact.setEmail(scanner.next());
                System.out.println("Enter your Address: ");
                contact.setAddress(scanner.next());
                System.out.println("Enter your City: ");
                contact.setCity(scanner.next());
                System.out.println("Enter your State: ");
                contact.setState(scanner.next());
                System.out.println("Enter your Zipcode: ");
                contact.setZip(scanner.nextInt());
                System.out.println("Enter your Mobile Number: ");
                contact.setMobile(scanner.nextLong());
            }
        }

        if (IsAvaible == false) {
            System.out.println("Contact Doesn't exist.");
        }
    }
}
