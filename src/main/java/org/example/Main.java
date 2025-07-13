package org.example;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> list1 = new MyLinkedList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        MyLinkedList<String> list2 = new MyLinkedList<>();
        list2.add("Date");
        list2.add("Elderberry");

        System.out.println("List1:");
        for (String item : list1) {
            System.out.println(item);
        }
        System.out.println("List2:");
        for (String item : list2) {
            System.out.println(item);
        }

        // Demonstrate print()
        System.out.println("List2 using print():");
        list2.print();

        // Demonstrate apply() with a lambda
        System.out.println("List2 with apply() (uppercase if String):");
        list2.apply(System.out::println);
    }
}