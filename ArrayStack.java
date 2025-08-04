/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Imp;

/**
 *
 * @author Rasindu
 */
public class ArrayStack {
    static class Stack {
        int[] stack = new int[5];
        int top = -1;

        void push(int val) {
            if (top < 4) {
                stack[++top] = val;
            } else {
                System.out.println("Stack is full");
            }
        }

        int pop() {
            if (top >= 0) {
                return stack[top--];
            }
            System.out.println("Stack is empty");
            return -1;
        }

        void display() {
            if (top == -1) {
                System.out.println("Stack is empty");
            } else {
                for (int i = 0; i <= top; i++) {
                    System.out.print(stack[i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();     
        s.pop();         
        s.display();    
    }
}
