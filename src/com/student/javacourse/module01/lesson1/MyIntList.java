package com.student.javacourse.module01.lesson1;

import java.util.ArrayList;

public class MyIntList implements MyList{
    private ArrayList<Integer> arr;
    private int capacity;
    private int size;

    public MyIntList() {
        capacity = 16;
        arr = new ArrayList<>(capacity);
    }

    public MyIntList(int capacity) {
        this.capacity = capacity;
        arr = new ArrayList<>(capacity);
    }

    @Override
    public void add(int v) {
        size++;
        if (!arr.isEmpty()) {
            for (int i = 0; i < arr.size(); i++) {
                arr.set(i, arr.get(i) + v);
            }
        }
        arr.add(v);
    }

    @Override
    public void remove(int o) {
        int tmp;
        if (!arr.isEmpty()) {
            tmp = arr.get(o);
            arr.remove(o);
            for (int i = 0; i < arr.size(); i++) {
                arr.set(i, arr.get(i) - tmp);
            }
        }
    }

    @Override
    public int getByValue(int v) {
        if (!arr.isEmpty()) {
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) == v)
                    return i;
            }
        }
        return 0;
    }

    @Override
    public int getByIndex(int i) {
        return arr.get(i);
    }

    @Override
    public int max() {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (max < arr.get(i)) max = arr.get(i);
        }
        return max;
    }

    @Override
    public int min() {
        int min = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (min > arr.get(i)) min = arr.get(i);
        }
        return min;
    }

    @Override
    public int average() {
        int sum = 0;
        for (Integer integer : arr) {
            sum += integer;
        }
        return sum / arr.size();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void foreach() {
        arr.forEach(System.out::println);
    }
}
