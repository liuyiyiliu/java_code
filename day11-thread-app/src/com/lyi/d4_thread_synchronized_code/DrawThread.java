package com.lyi.d4_thread_synchronized_code;


public class DrawThread extends Thread{

    private Account account;

    public DrawThread(Account account, String name){
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        double money = 10000.0;
        account.saveMoney (money);
    }
}
