package dip;

public class Cabbage implements IGoods{
    @Override
    public void sale() {
        System.out.println("我有蔬菜可以卖");
    }
    public void count(){
        System.out.println("卖出了五件");
    }
}