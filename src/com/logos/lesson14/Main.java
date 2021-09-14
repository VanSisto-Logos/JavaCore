package com.logos.lesson14;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        Set<Product> productTreeSet = new TreeSet<>(new Comparator<Product>() {
//            @Override
//            public int compare(Product product, Product t1) {
//                return t1.getNumber() - product.getNumber();
//            }
//        });
//        Set<Product> productHashSet = new HashSet<>();
//        Set<Product> productLinkedHashSet = new LinkedHashSet<>();
//
//        Scanner scanner = new Scanner(System.in);
//
//        while (true){
//            System.out.print("Enter product name: ");
//            String name = scanner.next();
//            if (name.equals("break")) break;
//            System.out.print("Enter count: ");
//            int count = scanner.nextInt();
//
//            productTreeSet.add(new Product(name, count));
//            productHashSet.add(new Product(name, count));
//            productLinkedHashSet.add(new Product(name, count));
//
//        }

//        System.out.println(productTreeSet.toString());
//        System.out.println(productHashSet.toString());
//        System.out.println(productLinkedHashSet.toString());
//

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(1);
        queue.add(5);
        queue.offer(2);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }
}

//https://www.cs.usfca.edu/~galles/visualization/RedBlack.html