package Arraylist;

import java.util.ArrayList;

public class ArraylistModo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("world");
        array.remove("world");
        System.out.println(array);
    }
}
