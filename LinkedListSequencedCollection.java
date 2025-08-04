/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Imp;
import java.util.LinkedList;
import java.util.SequencedCollection;
/**
 *
 * @author Rasindu
 */
public class LinkedListSequencedCollection {
    
    public static void main(String[] args) {
        // LinkedList now implements SequencedCollection<E>
        SequencedCollection<String> seq = new LinkedList<>();

        // Add elements at both ends
        seq.addFirst("Apple");
        seq.addLast("Banana");
        seq.addFirst("Cherry");
        System.out.println("After addFirst/addLast: " + seq);

        // Peek first and last elements
        System.out.println("First element: " + seq.getFirst());
        System.out.println("Last element: " + seq.getLast());

        // Remove first and last
        String removedFirst = seq.removeFirst();
        String removedLast = seq.removeLast();
        System.out.println("Removed: first=" + removedFirst + ", last=" + removedLast);
        System.out.println("After removal: " + seq);

        // Add more elements
        seq.addLast("Dates");
        seq.addLast("Elderberry");

        // Obtain a reversed view
        SequencedCollection<String> rev = seq.reversed();
        System.out.println("Original   : " + seq);
        System.out.println("Reversed   : " + rev);

        // Both forward and reverse iteration work via forEach and streams
        System.out.print("Forward iteration: ");
        seq.forEach(e -> System.out.print(e + " "));
        System.out.println();

        System.out.print("Reverse iteration: ");
        rev.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
}

