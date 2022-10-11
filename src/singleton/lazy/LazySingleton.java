package singleton.lazy;

public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance(){
        if(null == lazySingleton){//为空则说明第一次获取单例对象，进行初始化
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;//不为空则说明已经初始化了，直接返回
    }
}