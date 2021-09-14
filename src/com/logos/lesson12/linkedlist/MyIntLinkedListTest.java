package com.logos.lesson12.linkedlist;

public class MyIntLinkedListTest {
    static MyIntLinkedList list = new MyIntLinkedList();

    public static void main(String[] args) {
        showInfo();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        showInfo("After adding:");

        System.out.println("Get by index 1: " + list.get(1));
        System.out.println("Remove number 2 (" + list.remove(new Integer(2)) + ")");
        System.out.println("Again by index 1: " + list.get(1));

        showInfo("After removing:");

        list.clear();

        showInfo("After clearing:");
    }

    public static void showInfo(String header){
        System.out.println("===========================");
        System.out.println(header);
        System.out.println("Is empty: " + list.isEmpty());
        System.out.println("List size = " + list.size());
        list.forEach(System.out::println);
    }

    public static void showInfo(){
        showInfo("");
    }
}
