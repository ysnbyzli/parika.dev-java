package com.core.odev.listeSinifi;

import java.util.Arrays;

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
            this.arr = newArr;
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

    public T get(int index){
        T item = this.arr[index];
        if (item == null) return null;
        return item;
    }

    public T remove(int index){
        if (index < 0 || index >= this.arr.length) return null;

        T valueToBeDeleted = this.arr[index];

        for (int i = index; i < this.arr.length - 1; i ++)
        {
            this.arr[index] = this.arr[index + 1];
        }

        this.arr[this.arr.length - 1] = null;
        this.size -= 1;
        return valueToBeDeleted;

    }

    public T set(int index, T data)
    {
        if (index >= this.arr.length || index < 0)
        {
            System.out.println("Invalid index");
            return null;
        }

        T returnValue = this.arr[index];

        this.arr[index] = data;

        return returnValue;

    }

    /* Parametrede verilen nesnenin listedeki indeksini verir. Nesne listede yoksa -1 değerini verir. */
    public int indexOf(T data) {
        int index = -1;
        for (int i = 0; i < this.arr.length; i++){
            if (this.arr[i] == data) {
                index = i;
                break;
            }
        }
        return index;
    }

    /* Belirtilen öğenin listedeki son indeksini söyler. Nesne listede yoksa -1 değerini verir. */
    public int lastIndexOf(T data){
        int index = -1;
        for (int i = 0; i < this.arr.length; i++){
            if (this.arr[i] == data) {
                index = i;
            }
        }
        return index;
    }

    /* Listenin boş olup olmadığını söyler. */
    public boolean isEmpty() {
        if (this.arr.length == 0 || this.arr[0] == null) return true;
        return false;
    }

    /* Parametrede verilen indeks aralığına ait bir liste döner. */
    public MyList<T> sublist(int start, int finish) {

        if (start > finish || finish > this.arr.length) return null;

        MyList<T> sublist = new MyList<>();

        for (int i = start; i < finish; i++){
            sublist.add(this.arr[i]);
        }
        return sublist;
    }

    /* Parametrede verilen değerin dizide olup olmadığını söyler. */
    public boolean contains(T data) {
        for (T value: this.arr
             ) {
            if (value == data) return true;
        }
        return false;
    }
    /* Listedeki bütün öğeleri siler, boş liste haline getirir. */
    public void clear() {
        this.arr = (T[]) new Object[this.capacity];
    }

    /* Sınıfa ait dizideki elemanları listeleyen bir metot. */
    @Override
    public String toString()
    {
        String list = "";

        list += "[";
        for (int i = 0; i < this.arr.length;i++)
        {
            if (this.arr[i] != null)
            {
                list += this.arr[i];

            }
            if (i != this.arr.length - 1 && this.arr[i+1] != null) list+=", ";
        }
        list += "]";

        return list;
    }
}
