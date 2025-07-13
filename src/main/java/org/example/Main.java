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
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        System.out.println("List2:");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }

        // Demonstrate print()
        System.out.println("List2 using print():");
        list2.print();

        // Demonstrate apply() with a lambda
        System.out.println("List2 with apply() (uppercase if String):");
        list2.apply(System.out::println);
    }
}