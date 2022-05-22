package defindclass;

public class phoneDemo {
    public static void main(String[] args) {
        //引用已创建的类
        Phone p = new Phone();
        //使用类的变量
        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();
        p.sendMessage();
    }
}
