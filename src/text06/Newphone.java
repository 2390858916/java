package text06;

public class Newphone extends Phone{
    @Override
    //重写父类说明
    //重写不能用父类的私有函数
    public void call(String name){
        System.out.println("link video");
//        System.out.println("np" + name);
        super.call(name);
    }
}
