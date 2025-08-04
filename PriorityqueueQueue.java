/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Imp;
import java.util.PriorityQueue;
import java.util.Queue;


/**
 *
 * @author Rasindu
 */
public class PriorityqueueQueue {
    public static void main(String[] args) {
        // PriorityQueue implements Queue interface (min-heap by default)
        Queue<Integer> numbers = new PriorityQueue<>();

        // 1. Adding elements (automatically arranged in natural order - ascending)
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(50);

        System.out.println("PriorityQueue (natural order): " + numbers);

        // 2. Accessing the head of the queue
        System.out.println("Peek (head element): " + numbers.peek());

        // 3. Removing elements (poll removes head - smallest element first)
        System.out.println("Poll (remove head): " + numbers.poll());
        System.out.println("After poll: " + numbers);

        // 4. Iterating through the PriorityQueue (order not guaranteed in iteration)
        System.out.print("Iterating: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 5. Checking if the queue contains an element
        System.out.println("Contains 30? " + numbers.contains(30));

        // 6. Size of the queue
        System.out.println("Size: " + numbers.size());

        // 7. Removing all elements
        numbers.clear();
        System.out.println("After clearing: " + numbers);
    }
}
