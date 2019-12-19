package com.companic.hashset;

import java.util.HashMap;
import java.util.Iterator;

public class HashSet<E> {

    private HashMap<E, Object> map;

    private static final Object STUB = new Object();

    public HashSet() {
        map = new HashMap<>();
    }

    public HashSet(int initialCapacity, float loadFactor) {
        map = new HashMap<>(initialCapacity, loadFactor);
    }

    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    public int size() {
        return map.size();
    }

    public boolean add(E e) {
        return map.put(e, STUB) == null;
    }

    public boolean remove(Object o) {
        return map.remove(o) == STUB;
    }

    public void clear() {
        map.clear();
    }

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("One");

        hashSet.display();
    }

    public void display() {
        map.keySet().forEach(System.out::println);
    }
}
