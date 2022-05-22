package defindclass;

public class privateDemo {
    String name;
    private int age;
    public void setAge(int a){
        if (a<0||a>120){
            System.out.println("value error");
        }else {
            age = a;
        }
    }
    public int getAge(){
        return age;
    }
    public void show(){
        System.out.println(name + "," + age);
    }
}
