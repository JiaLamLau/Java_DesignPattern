package AbstractHomeWork;

public class TestAbstractFactory {
    public static void main(String[] args) {
        IFactory northFarmFactory = new NorthFarmFactory();
        IApple apple = northFarmFactory.createApple();
        apple.growApple();//输出：种植北方苹果

        IOrange orange = northFarmFactory.createOrange();
        orange.growOrange();//输出：种植北方桔子
    }
}