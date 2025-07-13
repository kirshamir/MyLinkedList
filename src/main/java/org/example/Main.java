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

        System.out.println("List1 before move:");
        for (String item : list1) {
            System.out.println(item);
        }
        System.out.println("List2 before move:");
        for (String item : list2) {
            System.out.println(item);
        }

        // Move all items from list1 to list2
        list1.moveItemsTo(list2);

        System.out.println("List1 after move:");
        for (String item : list1) {
            System.out.println(item);
        }
        System.out.println("List2 after move:");
        for (String item : list2) {
            System.out.println(item);
        }

        // Test add(Iterable)
        java.util.List<String> moreFruits = java.util.Arrays.asList("Fig", "Grape");
        list2.add(moreFruits);
        System.out.println("List2 after adding more fruits:");
        for (String item : list2) {
            System.out.println(item);
        }

        // Test moveItemsTo with compatible types
        MyLinkedList<Object> objectList = new MyLinkedList<>();
        list2.moveItemsTo(objectList);
        System.out.println("objectList after moving from list2:");
        for (Object item : objectList) {
            System.out.println(item);
        }

        // Demonstrate print()
        System.out.println("objectList using print():");
        objectList.print();

        // Demonstrate apply() with a lambda
        System.out.println("objectList with apply() (uppercase if String):");
        objectList.apply(item -> {
            if (item instanceof String) {
                System.out.println(((String) item).toUpperCase());
            } else {
                System.out.println(item);
            }
        });

        // Example with Integer and Number
        MyLinkedList<Integer> intList = new MyLinkedList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        MyLinkedList<Number> numList = new MyLinkedList<>();
        numList.add(10.5);
        numList.add(20.5);

        System.out.println("intList before move:");
        for (Integer i : intList) {
            System.out.println(i);
        }
        System.out.println("numList before move:");
        for (Number n : numList) {
            System.out.println(n);
        }

        // Move all Integers into Number list
        intList.moveItemsTo(numList);

        System.out.println("intList after move:");
        for (Integer i : intList) {
            System.out.println(i);
        }
        System.out.println("numList after move:");
        for (Number n : numList) {
            System.out.println(n);
        }

        // Example with String and Object
        MyLinkedList<String> strList = new MyLinkedList<>();
        strList.add("Hello");
        strList.add("World");

        MyLinkedList<Object> objList = new MyLinkedList<>();
        objList.add(42);
        objList.add(3.14);

        System.out.println("strList before move:");
        for (String s : strList) {
            System.out.println(s);
        }
        System.out.println("objList before move:");
        for (Object o : objList) {
            System.out.println(o);
        }

        // Move all Strings into Object list
        strList.moveItemsTo(objList);

        System.out.println("strList after move:");
        for (String s : strList) {
            System.out.println(s);
        }
        System.out.println("objList after move:");
        for (Object o : objList) {
            System.out.println(o);
        }
    }
}