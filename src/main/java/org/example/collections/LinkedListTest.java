package org.example.collections;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> numLinkedList = new LinkedList<>();
        numLinkedList.add(12);
        numLinkedList.add(30);
        numLinkedList.add(55);
        numLinkedList.add(75);
        numLinkedList.add(92);

        System.out.println(numLinkedList);
        numLinkedList.addFirst(2);
        numLinkedList.addLast(105);
        System.out.println(numLinkedList);

        //Using as Queue
        Integer firstElement = numLinkedList.peek();
        System.out.println(firstElement);
        numLinkedList.pop();    //Removing an element.
        System.out.println(numLinkedList);
    }
}
