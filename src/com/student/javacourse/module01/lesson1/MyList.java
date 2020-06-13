package com.student.javacourse.module01.lesson1;

public interface MyList {
    void add(int v);
    void remove(int i);
    int getByValue(int v);
    int getByIndex(int i);
    int max();
    int min();
    int average();
    int size();
    void foreach();
}
