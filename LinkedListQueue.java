/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Imp;
 import java.util.NoSuchElementException;

/**
 *
 * @author Rasindu
 */
public class LinkedListQueue<T> {


    // Node class
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    // Queue fields
    private Node<T> front;
    private Node<T> rear;
    private int size;

    // Enqueue method
    public void enqueue(T value) {
        Node<T> newNode = new Node<>(value);
        if (rear != null) {
            rear.next = newNode;
        }
        rear = newNode;
        if (front == null) {
            front = rear;
        }
        size++;
    }

    // Dequeue method
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        T value = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return value;
    }

    // Peek method
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return front.data;
    }

    // isEmpty method
    public boolean isEmpty() {
        return front == null;
    }

    // Size method
    public int size() {
        return size;
    }

    // Display method
    public void displayQueue() {
        Node<T> current = front;
        System.out.print("Queue: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        LinkedListQueue<Integer> queue = new LinkedListQueue<>();

        // g. Enqueue the values
        System.out.println("Enqueuing values: 12, 5, 10, 20, 15");
        int[] initialValues = {12, 5, 10, 20, 15};
        for (int value : initialValues) {
            queue.enqueue(value);
            queue.displayQueue();
        }

        // h. Perform dequeue operation
        System.out.println("\nDequeuing one value...");
        System.out.println("Dequeued: " + queue.dequeue());
        queue.displayQueue();

        // i. Display front element
        System.out.println("\nPeeking front element...");
        System.out.println("Front element: " + queue.peek());

        // j. Enqueue 18
        System.out.println("\nEnqueuing value: 18");
        queue.enqueue(18);
        queue.displayQueue();

        // k. Display size
        System.out.println("\nQueue size: " + queue.size());

        // l. Print final queue state
        System.out.println("\nFinal queue state:");
        queue.displayQueue();
    }
}


