/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Imp;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Rasindu
 */
public class HashsetSet {
    

    public static void main(String[] args) {
        // Create a HashSet of Strings
        Set<String> fruits = new HashSet<>();

        // 1. Adding elements (duplicates are automatically ignored)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate, will not be added

        System.out.println("Initial HashSet: " + fruits);

        // 2. Checking if an element exists
        System.out.println("Contains Mango? " + fruits.contains("Mango"));
        System.out.println("Contains Grapes? " + fruits.contains("Grapes"));

        // 3. Removing an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // 4. Size of the HashSet
        System.out.println("Size of HashSet: " + fruits.size());

        // 5. Iterating through the HashSet (for-each loop)
        System.out.print("Iterating: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 6. Clearing the HashSet
        fruits.clear();
        System.out.println("After clearing: " + fruits);
    }
}

