package singleton.lazy;

import java.lang.reflect.Constructor;

public class TestLazyInnerClassSingleton {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = LazyInnerClassSingleton.class;
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object o1 = constructor.newInstance();
        Object o2 = LazyInnerClassSingleton.getInstance();

        System.out.println(o1 == o2);
    }
}