package com.student.javacourse.module01.lesson1;

public class Main {
    public static void main(String[] args) {
        MyIntList intList = new MyIntList();
        intList.add(10);
        intList.add(11);
        intList.add(12);
        intList.add(13);
        intList.add(14);
        intList.remove(4);

        intList.foreach();
        System.out.println("indexByValue: " + intList.getByValue(46));
        System.out.println("valueByIndex: " + intList.getByIndex(0));
        System.out.println("min = " + intList.min());
        System.out.println("max = " + intList.max());
        System.out.println("average = " + intList.average());
    }
}
