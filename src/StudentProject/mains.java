package StudentProject;
import java.util.ArrayList;
public class mains {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        Student s1 = new Student("ni",30);
        Student s2 = new Student("ch",20);

        array.add(s1);
        array.add(s2);

        for(int i = 0;i< array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getName()+","+ s.getAge());
        }
    }
}
