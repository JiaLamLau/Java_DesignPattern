package strategy;

public class TestPayStrategy {
    public static void main(String[] args) {
        String pay = "aliPay";//支付类型
        IPayStrategy payStrategy = null;
        //根据不同的支付类型，选择不同的支付种类
        if(pay.equals("aliPay")){
            payStrategy = new AliPayStrategy();
        }else if(pay.equals("wechatPay")){
            payStrategy = new WechatPayStrategy();
        }
        payStrategy.pay(10);
        payStrategy.queryBalance();
    }
}