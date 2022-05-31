package text06;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call("6666");
        System.out.println("--------------------");
        Newphone np = new Newphone();
        np.call("7777");
    }
}
