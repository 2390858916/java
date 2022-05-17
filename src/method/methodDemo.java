package method;

public class methodDemo {
    public static void main(String[] args) {
//        调用方法
        int number1 = 1;
        int number2 = 2;
        int flag = isEvenNumber(number1,number2);
        System.out.println(flag);
    }
//    定义方法/相当与函数
    public static int isEvenNumber(int number1,int number2){
        if(number1>number2){
            System.out.println(true);
            return number1;
        }else {
            System.out.println(false);
            return number2;
            
        }
    }
}
