package AbstractHomeWork;

public class NorthFarmFactory implements IFactory {
    @Override
    public IApple createApple() {
        return new NorthApple();//北方农场生产北方苹果
    }

    @Override
    public IOrange createOrange() {
        return new NorthOrange();////北方农场生产北方桔子
    }
}