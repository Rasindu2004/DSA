/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Imp;
import java.util.LinkedHashSet;
import java.util.SequencedSet;

/**
 *
 * @author Rasindu
 */
public class LinkedHashSetSequencedSet {
    public static void main(String[] args) {
        // LinkedHashSet implements SequencedSet (Java 21+)
        SequencedSet<String> animals = new LinkedHashSet<>();

        // 1. Adding elements (maintains insertion order, no duplicates)
        animals.addFirst("Cat");      // Adds at the beginning
        animals.addLast("Dog");       // Adds at the end
        animals.addLast("Elephant");
        animals.addFirst("Bear");
        animals.addLast("Fox");

        System.out.println("Initial LinkedHashSet: " + animals);

        // 2. Accessing first & last elements
        System.out.println("First element: " + animals.getFirst());
        System.out.println("Last element: " + animals.getLast());

        // 3. Removing first & last elements
        String removedFirst = animals.removeFirst();
        String removedLast = animals.removeLast();
        System.out.println("Removed -> First: " + removedFirst + ", Last: " + removedLast);
        System.out.println("After removal: " + animals);

        // 4. Reversed view (live view, changes reflect in both directions)
        SequencedSet<String> reversed = animals.reversed();
        System.out.println("Original order: " + animals);
        System.out.println("Reversed order: " + reversed);

        // 5. Iterating
        System.out.print("Forward iteration: ");
        animals.forEach(e -> System.out.print(e + " "));
        System.out.println();

        System.out.print("Reverse iteration: ");
        reversed.forEach(e -> System.out.print(e + " "));
        System.out.println();

        // 6. Adding to reversed view also updates the original set
        reversed.addFirst("Giraffe"); // Adds at the end of the original
        System.out.println("After adding Giraffe via reversed view: " + animals);
    }
}

