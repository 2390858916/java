package method;

public class methodDemo {
    public static void main(String[] args) {
//        调用方法
        int number1 = 1;
        int number2 = 2;
        isEvenNumber(number1,number2);
    }
//    定义方法/相当与函数
    public static void isEvenNumber(int number1,int number2){
        if(number1>number2){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
