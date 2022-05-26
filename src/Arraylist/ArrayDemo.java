package Arraylist;
import java.util.ArrayList;
public class ArrayDemo {
    public static void main(String[] args) {
        //空集合对象
        ArrayList<String> array = new ArrayList<String>();
        System.out.println("array" + array);
        array.add("hello");
        array.add("java");
        array.add(1,"niubi");
        System.out.println(array);
    }
}
