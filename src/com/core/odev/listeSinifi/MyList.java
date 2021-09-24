package com.core.odev.listeSinifi;

public class MyList<T> {
    private int capacity = 10;
    private int size = 0;
    private T[] arr;

    public MyList(){
        this.arr = (T[]) new Object[this.capacity];
    }

    public MyList(int capacity){
        this.arr = (T[]) new Object[capacity];
    }

    public void add(T value) {
        if (this.size == this.capacity) {
            this.capacity *= 2;
            T[] newArr = (T[]) new Object[this.capacity];
            for (int i = 0; i < this.arr.length; i++){
                newArr[i] = this.arr[i];
            }
            newArr[this.arr.length] = value;
            size++;
        } else {
            for (int i = 0; i < this.arr.length; i++){
                if (this.arr[i] == null){
                    this.arr[i] = value;
                    this.size++;
                    return;
                }
            }
        }
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int size(){
        return this.size;
    }

    public void listTheElements(){
        for (T value: this.arr
             ) {
            System.out.println(value);
        }
    }

}
