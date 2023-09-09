package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Stack after push operation: ");
        stack stack = new stack(23);
        stack.push(34);
        stack.push(90);
        stack.push(56);
        stack.push(78);
        stack.push(89);

        stack.printstack();

        stack.pop();
        stack.pop();

        System.out.println();
        System.out.println("Stack after pop operation: ");

        stack.printstack();


    }
}