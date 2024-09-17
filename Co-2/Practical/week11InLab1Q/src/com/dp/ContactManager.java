package com.dp;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class ContactManager {
	private Map<String, String> contacts;

    // Constructor
    public ContactManager() {
        contacts = new HashMap<>();
    }

    // Method to add a contact
    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
        System.out.println("Contact added: " + name);
    }

    // Method to remove a contact
    public void removeContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println("Contact removed: " + name);
        } else {
            System.out.println("Contact not found: " + name);
        }
    }

    // Method to retrieve a contact's phone number
    public String getContact(String name) {
        return contacts.getOrDefault(name, "Contact not found");
    }

    // Method to list all contacts
    public void listAllContacts() {
        Set<Map.Entry<String, String>> entrySet = contacts.entrySet();
        if (entrySet.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("Contact List:");
            for (Map.Entry<String, String> entry : entrySet) {
                System.out.println("Name: " + entry.getKey() + ", Phone: " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        // Create an instance of ContactManager
        ContactManager manager = new ContactManager();

        // Add contacts
        manager.addContact("Alice", "123-456-7890");
        manager.addContact("Bob", "987-654-3210");
        manager.addContact("Charlie", "555-555-5555");

        // Retrieve and display a contact's phone number
        System.out.println("Bob's Phone Number: " + manager.getContact("Bob"));

        // Remove a contact
        manager.removeContact("Alice");

        // List all contacts
        manager.listAllContacts();
    }

}
