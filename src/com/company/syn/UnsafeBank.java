package com.company.syn;
//不安全的取钱
//两个人去银行取钱，账户
public class UnsafeBank {
    public static void main(String[] args) {
        //创建银行账户
        Account account=new Account(1000,"棺材本");
        //创建取钱的对象
        Drawing you=new Drawing(account,50,"你");
        Drawing girlfriend=new Drawing(account,100,"丑八怪");
        you.start();
        girlfriend.start();
    }
}
//账户
class Account{
    int money;//金额
    String name;

    public Account(int money, String name ) {
        this.money = money;
        this.name = name;
    }
}
//银行：模拟取款
class Drawing extends Thread {
    Account account;//账户
    //要取多少钱
    int drawingMoney;
    //现在手里有多少钱
    int nowMoney;

    //构造取钱方法
    public Drawing(Account account, int drawingMoney, String name) {
        super(name);
        this.account=account;
       this.drawingMoney=drawingMoney;
    }
    //取钱
    //synchronized默认锁的是this
    @Override
    public void run() {
        //锁的对象是变化的量，需要增删改查的量
        synchronized (account){
            //判断有没有钱
            if (account.money - drawingMoney < 0) {
                System.out.println(Thread.currentThread().getName()+"钱不够取不了");
                return;
            }
            //sleep可以放大问题的发生性
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //卡内余额=余额-你取的钱
            account.money=account.money-drawingMoney;
            //你手里的钱
            nowMoney=nowMoney+drawingMoney;
            System.out.println(account.name+"余额为："+account.money);
            //Thread.currentThread().getName()
            System.out.println(this.getName()+"手里的钱"+nowMoney);
        }
        }

}