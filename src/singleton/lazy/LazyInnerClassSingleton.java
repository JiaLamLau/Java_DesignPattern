package singleton.lazy;

import java.io.Serializable;

public class LazyInnerClassSingleton implements Serializable {

    private LazyInnerClassSingleton(){
        //防止反射破坏单例
        if(null != InnerLazy.LAZY){
            throw new RuntimeException("不允许通过反射类构造单例对象");
        }
    }

    public static final LazyInnerClassSingleton getInstance(){
        return InnerLazy.LAZY;
    }

    private static class InnerLazy {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}