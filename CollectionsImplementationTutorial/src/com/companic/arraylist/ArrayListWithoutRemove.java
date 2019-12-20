package com.companic.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithoutRemove<E> extends ArrayList {

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayListWithoutRemove<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);
        list.remove(1);
        list.remove(2);
        System.out.println(list);

        list.clear();

        System.out.println(list);
    }

}
