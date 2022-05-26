package Arraylist;

import java.util.ArrayList;

public class ArraylistModo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("world");
        array.add("java");
        array.add("555");
        array.remove("world");
        array.remove(1);
        array.set(0,"fist");
        System.out.println(array.get(1));
        System.out.println(array);
    }
}
