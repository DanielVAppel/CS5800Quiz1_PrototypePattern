package org.CS5800;

import java.util.ArrayList;
import java.util.List;

public class BookCopyDriver {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Demonstrate shallow copy behavior
        System.out.println("=== Shallow Copy Demo ===");
        List<Chapter> shallowChapters = new ArrayList<>();
        shallowChapters.add(new Chapter("Original Chapter 1"));
        shallowChapters.add(new Chapter("Original Chapter 2"));

        BookShallowCopy shallowOriginal = new BookShallowCopy("Shallow Original Book", shallowChapters);
        BookShallowCopy shallowClone = shallowOriginal.clone();

        // Modify the original book's chapters
        shallowOriginal.getChapters().get(0).setTitle("Modified Chapter 1");

        // Print both books to observe the effect
        System.out.println("Original Book (Shallow Copy): " + shallowOriginal);
        System.out.println("Cloned Book (Shallow Copy): " + shallowClone);

        // Demonstrate deep copy behavior
        System.out.println("\n=== Deep Copy Demo ===");
        List<Chapter> deepChapters = new ArrayList<>();
        deepChapters.add(new Chapter("Original Chapter 1"));
        deepChapters.add(new Chapter("Original Chapter 2"));

        BookDeepCopy deepOriginal = new BookDeepCopy("Deep Original Book", deepChapters);
        BookDeepCopy deepClone = deepOriginal.clone();

        // Modify the original book's chapters
        deepOriginal.getChapters().get(0).setTitle("Modified Chapter 1");

        // Print both books to observe the effect
        System.out.println("Original Book (Deep Copy): " + deepOriginal);
        System.out.println("Cloned Book (Deep Copy): " + deepClone);
    }
}
