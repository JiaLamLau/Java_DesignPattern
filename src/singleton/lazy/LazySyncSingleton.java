package singleton.lazy;

public class LazySyncSingleton {
    private static LazySyncSingleton lazySingleton = null;

    private LazySyncSingleton() {
    }

    public synchronized static LazySyncSingleton getInstance(){
        if(null == lazySingleton){
            lazySingleton = new LazySyncSingleton();
        }
        return lazySingleton;
    }
}