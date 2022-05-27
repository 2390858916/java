package Studenttest;

import java.util.Scanner;
import java.util.ArrayList;

public class Studentinput {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("welcome to Student manage System");
            System.out.println("input 1 add student");
            System.out.println("input 2 remove student");
            System.out.println("input 3 change student");
            System.out.println("input 4 select student");
            System.out.println("input 5 exit student");

            String line = sc.nextLine();
            switch (line) {
                case "1" -> addstudent(array);
                case "2" -> removestudent(array);
                case "3" -> changestudent(array);
                case "4" -> selectstudent(array);
                case "5" -> System.exit(0);
            }
        }

    }

    public static void addstudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        String sid;
        while (true){
            System.out.println("input you sid");
            sid = sc.nextLine();
            boolean flag = isUsee(array,sid);
            if(flag){
                System.out.println("sid respect");
            }else{
                break;
            }
        }
        System.out.println("input you name");
        String name = sc.nextLine();
        System.out.println("input you age");
        String age = sc.nextLine();
        System.out.println("input you address");
        String address = sc.nextLine();
        Student s = new Student();
        s.setName(name);
        s.setAge(age);
        s.setSid(sid);
        s.setAddress(address);
        array.add(s);
        if (array.size() == 0) {
            System.out.println("date none");
        } else {
            System.out.println("success");
            System.out.println(array.size());
        }
    }
    public static boolean isUsee(ArrayList<Student> array,String sid){
        boolean flag = false;
        for (Student s : array) {
            if (s.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void removestudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        if (array.size() == 0) {
            System.out.println("the array is employ");
        } else {
            System.out.println("input the student sid");
            String sid = sc.nextLine();
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                if (s.getSid().equals(sid)) {
                    array.remove(i);
                    System.out.println("detect done");
                    break;
                }else{
                    System.out.println("array have no this sid ");
                    break;
                }
            }
        }
    }

    public static void changestudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        if (array.size() == 0){
            System.out.println("array is employ");
        }else {
            System.out.println("input student sid");
            String sid = sc.nextLine();
            for (int i = 0;i<array.size();i++){
                Student s = array.get(i);
                if(s.getSid().equals(sid)){
                    System.out.println("input student new name");
                    String nname = sc.nextLine();
                    System.out.println("input student new age ");
                    String nage = sc.nextLine();
                    System.out.println("input student new address ");
                    String naddress = sc.nextLine();
                    Student change = new Student();
                    change.setSid(sid);
                    change.setName(nname);
                    change.setAge(nage);
                    change.setAddress(naddress);
                    array.set(i,change);
                    System.out.println("change success");
                    break;
                }else{
                    System.out.println("sid error");
                }
            }
        }
    }

    public static void selectstudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("date employ");
        } else {
            System.out.println("name\tage\tsid\taddress");
            for (Student s : array) {
                System.out.println(s.getName() + "\t\t" + s.getAge() + "\t" + s.getSid() + "\t" + s.getAddress());
            }
        }

    }
}
