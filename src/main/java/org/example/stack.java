package org.example;

public class stack {

    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }

    }

    //stack mainly contains the top node and the height
    private Node top;
    private int height;

    public stack(int value){
        Node newnode = new Node(value);
        top = newnode;
        height++;
    }

    public void printstack(){
        Node temp = top;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    //So , in the stack we are mainly going to perform two operations push and pop operations

    //Push operation : It is used to push the node into the stack

    public void push(int value){
        Node newnode = new Node(value);
        if(height == 0){
            top = newnode;
        }
        else {
            newnode.next = top;
            top = newnode;
            height++;
        }
    }

    //Pop operation: It is used to pop the node from the stack

    public Node pop(){
        Node temp = top;
        if(height == 0){
            return null;
        }

        top = top.next;
        temp.next = null;
        height--;

        return temp;
    }




}
