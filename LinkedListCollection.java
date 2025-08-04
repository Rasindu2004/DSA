/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Imp;
import java.util.LinkedList;
import java.util.Iterator;

/**
 *
 * @author Rasindu
 */
public class LinkedListCollection {
    
    public static void main(String[] args) {
        
        // Create a LinkedList of Strings
        LinkedList<String> names = new LinkedList<>();

        // 1. Adding elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.addFirst("Zara");  // Adds at the beginning
        names.addLast("David");  // Adds at the end

        System.out.println("Initial LinkedList: " + names);

        // 2. Accessing elements
        System.out.println("First Element: " + names.getFirst());
        System.out.println("Last Element: " + names.getLast());
        System.out.println("Element at index 2: " + names.get(2));

        // 3. Updating elements
        names.set(2, "Eve");
        System.out.println("After updating index 2: " + names);

        // 4. Removing elements
        names.remove("Bob");        // Remove by value
        names.remove(0);            // Remove by index
        names.removeFirst();        // Remove first element
        names.removeLast();         // Remove last element
        System.out.println("After removals: " + names);

        // 5. Checking if LinkedList contains a value
        System.out.println("Contains Charlie? " + names.contains("Charlie"));
        System.out.println("Contains Eve? " + names.contains("Eve"));

        // 6. Iterating through LinkedList
        System.out.print("Iterating using Iterator: ");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

        System.out.print("Iterating using for-each loop: ");
        for (String name : names) {
            System.out.print(name + " ");
        }

        // 7. Size of LinkedList
        System.out.println("\nSize of LinkedList: " + names.size());

        // 8. Clearing the LinkedList
        names.clear();
        System.out.println("After clearing: " + names);
    }
}
