package singleton.hungry;

public class TestHungrySingleton {
    public static void main(String[] args) {
        //测试普通写法
        HungrySingleton singleton1  = HungrySingleton.getInstance();
        HungrySingleton singleton2  = HungrySingleton.getInstance();
        System.out.println(singleton1 == singleton2);//输出:true

        //测试静态类写法
        HungryStaticSingleton singleton3 = HungryStaticSingleton.getInstance();
        HungryStaticSingleton singleton4 = HungryStaticSingleton.getInstance();
        System.out.println(singleton3 == singleton4);//输出:true
    }
}