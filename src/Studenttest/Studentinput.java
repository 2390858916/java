package Studenttest;
import java.util.Scanner;
import java.util.ArrayList;
public class Studentinput {
    public static void main(String[] args) {
        while(true) {
            ArrayList<Student> array = new ArrayList<Student>();
            Scanner sc = new Scanner(System.in);
            System.out.println("welcome to Student manage System");
            System.out.println("input 1 add student");
            System.out.println("input 2 remove student");
            System.out.println("input 3 change student");
            System.out.println("input 4 select student");
            System.out.println("input 5 exit student");

            int count = sc.nextInt();
            switch (count) {
                case 1:
                    addstudent(array);
                    break;
                case 2:
                    removestudent(array);
                    break;
                case 3:
                    changestudent(array);
                    break;
                case 4:
                    selectstudent(array);
                    break;
                case 5:
                    System.exit(0);
            }
        }

    }

    public static void addstudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("input you name");
        String name = sc.nextLine();
        System.out.println("input you age");
        String age = sc.nextLine();
        System.out.println("input you sid");
        String sid = sc.nextLine();
        System.out.println("input you address");
        String address = sc.nextLine();

        Student s = new Student();
        s.setName(name);
        s.setAge(age);
        s.setSid(sid);
        s.setAddress(address);
        array.add(s);
        System.out.println("success");
    }
    public static void removestudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("input the student sid");
        String sid = sc.nextLine();
    }
    public static void changestudent(ArrayList<Student> array){

    }
    public static void selectstudent(ArrayList<Student> array){
        System.out.println("name\tage\tsid\taddress");
        for (Student s : array) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
