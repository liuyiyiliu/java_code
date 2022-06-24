package com.ly.practise;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月21日 21:38
 */
public class ATMSystem {
    public static void main(String[] args) {
        // 1.定义账号类
//        2.定义一个集合容器，负责以后存储全部的账户对象 进行相关的业务操作
        ArrayList<Account> accounts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
//        3.展示系统的首页  ctrl+alter + T
        while (true) {
            System.out.println("=============黑马ATM系统================");
            System.out.println("1. 账户登录");
            System.out.println("2. 账户开户");
            
            System.out.println("请选择操作：");

            int command = scanner.nextInt();
            switch (command){
                case 1:

                    login(accounts,scanner);
                    break;
                case 2:
//                    用户开户(Alter+Enter)
                    register(accounts,scanner);
                    break;

                default:
                    System.out.println("您输入的操作命令不存在---");
            }
        }

    }

    private static void login(ArrayList<Account> accounts, Scanner scanner) {
        System.out.println("=============黑马ATM登录操作================");
        if(accounts.size() == 0){
            System.out.println("当前没有账户，请先去开户！！！");
            return;
        }
        while (true) {
            System.out.println("请输入的你卡号:");
            String cardId = scanner.next();
            Account acc = getAccountByCardId(cardId, accounts);
            if(acc == null){
                System.out.println("该账号不存在，请重新输入");
            }else{
                while (true) {
                    System.out.println("请输入密码:");
                    String passWord = scanner.next();
                    if(acc.getPassWord().equals(passWord)){
                        System.out.println("欢迎您" + acc.getUserName()+"先生/女士,您的卡号是" + acc.getCardId());
//                        查询 转账 取款
                        showUserCommand(scanner,acc,accounts);
                        return;
                    }else{
                        System.out.println("密码错误 请重新输入");
                    }
                }

            }
        }


    }

    private static void showUserCommand(Scanner scanner,Account acc,ArrayList<Account> accounts) {

        while (true) {
            System.out.println("=========用户操作页========");
            System.out.println("1. 查询账户");
            System.out.println("2. 存款");
            System.out.println("3. 取款");
            System.out.println("4. 转账");
            System.out.println("5. 修改密码");
            System.out.println("6. 退出");
            System.out.println("7. 注销账户");

            System.out.println("请输入");
            int command = scanner.nextInt();
            switch (command){
                case 1 :
    //                查询
                    showAccount(acc);
                    break;
                case 2 :
    //                存款
                    depositMoney(acc,scanner);
                    break;
                case 3 :
    //                取款
                    drawMoney(acc,scanner);
                    break;
                case 4 :
    //                转账
                    transferMoney(acc,scanner,accounts);
                    break;
                case 5 :
    //               修改密码
                    updatePassWord(acc,scanner);
                    return;
                case 6:
    //               退出
                    System.out.println("退出");
                    return;
                case 7:
    //               注销账户
                    if(deleteAccount(acc,scanner,accounts)){
                        return;
                    }else{
                        break;
                    }
                default:
            }
        }

    }

    /**
     * 销户功能
     * @param acc
     * @param scanner
     * @param accounts
     */
    private static Boolean deleteAccount(Account acc, Scanner scanner, ArrayList<Account> accounts) {
        System.out.println("================销户界面==================");
        System.out.println("确认销除这个账户？y/n");
        String command = scanner.next();
        switch (command){
            case "y":
                if(acc.getLeftMoney()>0){
                    System.out.println("您的余额大于0，不可以删除");
                }else{
                    accounts.remove(acc);
                    System.out.println("删除成功！！！");
                    return  true;
                }
                break;
            default:
                System.out.println("继续保留账号！！！");
        }
  return  false;
    }

    /**
     * 修改密码
     * @param acc
     * @param scanner
     */
    private static void updatePassWord(Account acc, Scanner scanner) {
        System.out.println("==========修改密码页面==========");
        while (true) {
            System.out.println("请输入新密码");
            String newPassWord = scanner.next();
            if(newPassWord.equals(acc.getPassWord())){
                System.out.println("你输入的密码和原密码一致，请重新输入！！！");
            }else{
                while (true) {
                    System.out.println("请再次输入你的密码:");
                    String okPassWord = scanner.next();
                    if(newPassWord.equals(okPassWord)){
                        acc.setPassWord(newPassWord);
                        System.out.println("密码修改成功，您的新密码是" + acc.getPassWord()+",请妥善保管!!");
                        return;
                    }else {
                        System.out.println("你两次的密码输入不一致，请重新输入!!");
                    }
                }
            }

        }

    }

    /**
     * 转账功能
     * @param acc
     * @param scanner
     * @param accounts
     */
    private static void transferMoney(Account acc, Scanner scanner,ArrayList<Account> accounts) {
        System.out.println("=============转账页面================");
//        1.转账功能需要判断系统中是否有2个账户对象及以上
        if(accounts.size() < 2){
            System.out.println("当前系统中，不足2个账户，不能进行转账，请去开户吧！");
            return;
        }

//        2.判断自己的账户是否有钱
        if(acc.getLeftMoney() == 0){
            System.out.println("账户不足，请存款");
            return; //结束当前方法
        }else{
            while (true) {
                System.out.println("请输入对方卡号");
                String cardId = scanner.next();

                if(cardId.equals(acc.getCardId())){
                    System.out.println("自己不可以给自己转账");
                    continue;  //防止陷入死循环 结束当次执行
                }

//                3.判断输入的卡号 是否存在账户
                Account acc2 = getAccountByCardId(cardId, accounts);
                if (acc2 == null){
                    System.out.println("卡号不存在");
                    break;
                }else{
//                    这个账户存在：继续验证他的姓氏
                    String userName = acc2.getUserName();
                    String tip = "*" + userName.substring(1);
                    while (true) {
                        System.out.println("请输入用户名【" + tip+"]的姓氏");
                        String preName = scanner.next();
                        if(userName.startsWith(preName)){
//                            认证通过 进行转账
                            System.out.println("请输入转账金额");
                            double money = scanner.nextDouble();
                            if(money>acc.getLeftMoney()){
                                System.out.println("余额不足");
                            }else {
                                acc.setLeftMoney(acc.getLeftMoney() - money);
                                acc2.setLeftMoney(acc2.getLeftMoney() + money);
                                showAccount(acc);
                                showAccount(acc2);
                                return;
                            }
                        }else{
                            System.out.println("你输入的信息有误");
                        }
                    }

                }
            }


        }
    }

    /**
     *
     * @param acc
     * @param scanner
     */
    private static void drawMoney(Account acc, Scanner scanner) {
        System.out.println("===============欢迎您进入**银行用户取款界面===============");
        if(acc.getLeftMoney()<=100){
            System.out.println("您的账户余额不足100元，先去存钱吧！");
            return;
        }else{
            while (true) {
                System.out.println("请输入您的取款金额:");
                double getMoney = scanner.nextDouble();
                if(acc.getQuotaMoney()< getMoney){
                    System.out.println("你当前取款超过当次限额,你的限额是" + acc.getQuotaMoney() );
                    break;
                }else{
                    if(acc.getLeftMoney()< getMoney){
                        System.out.println("您的账户余额不足,余额是" + acc.getLeftMoney());
                    }else {
                        acc.setLeftMoney(acc.getLeftMoney() - getMoney);
                        System.out.println("您已经取款成功");
                        showAccount(acc);
                        return;
                    }
                }
            }
        }
    }

    /**
     * 存款功能
     * @param acc
     * @param scanner
     */
    private static void depositMoney(Account acc, Scanner scanner) {
        System.out.println("===========账户存款操作============");
        System.out.println("请输入存款金额");
        double money = scanner.nextDouble();
//        更新账户余额： 原来的钱 + 新存入的钱
        acc.setLeftMoney(acc.getLeftMoney()+money);
        showAccount(acc);
    }

    /**
     * 展示账户信息
     * @param acc
     */
    private static void showAccount(Account acc) {
        System.out.println("===========账户信息============");
        System.out.println("卡号：" + acc.getCardId());
        System.out.println("用户名：" + acc.getUserName());
        System.out.println("余额:" + acc.getLeftMoney());
        System.out.println("提现额度:"+ acc.getQuotaMoney());
    }


    /**
     * 用户开户功能
     * @param accounts 接收账户的余额
     */
    private static void register(ArrayList<Account> accounts,Scanner scanner) {
        System.out.println("=============黑马ATM开户操作================");
//    接收用户输入的信息
        Account account = new Account();
        System.out.println("请输入你的账号名称:");
        String userName = scanner.next();
        account.setUserName(userName);

        System.out.println("请输入的余额");
        Double leftMoney =  scanner.nextDouble();
        account.setLeftMoney(leftMoney);

        while (true) {
//1.键盘输入姓名、密码、确认密码（两次密码要保持一致）
            System.out.println("请输入你的账号密码:");
            String passWord = scanner.next();
            System.out.println("请再次输入你的账号密码:");
            String okPassWord = scanner.next();

            if(okPassWord.equals(passWord)){
                account.setPassWord(okPassWord);
                break; //密码登录成功 死循环没必要继续了！
            }else {
                System.out.println("您两次输入的密码不一致");

            }
        }

        System.out.println("请输入您的当日取现额度:");
        double quotaMoney = scanner.nextDouble();
        account.setQuotaMoney(quotaMoney);

        // （独立功能 独立开发）
        String cardId = getRandomByCardId(accounts);
        account.setCardId(cardId);



        // 把账户对象添加到账号集合中去
        accounts.add(account);
        System.out.println("恭喜你，"+userName+"先生/女士 ，开户成功！您的卡号是"+ cardId);

    }

    /**
     * 为账户生成8位与其他账户不同的号码
     * @param accounts
     * @return
     */
    private  static String getRandomByCardId(ArrayList<Account> accounts){
        Random random = new Random();
        while (true) {
//        1.随机生成8位数字
            String cardId = "";
            for (int i = 0; i <8 ; i++) {
                int code = random.nextInt(10);
                cardId += code;
            }
//        2.判断这8位数字是否与其他账户的卡号重复
            Account acc = getAccountByCardId(cardId, accounts);
            if(acc == null){
                return cardId;
            }
        }
    }

    /**
     * 根据账号查询出一个账户对象出来
     * @param cardId 账号
     * @param accounts 全部账户对象的集合
     * @return 账户对象 | null
     */
    private static Account getAccountByCardId(String cardId, ArrayList<Account> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if(acc.getCardId().equals(cardId)){
//                System.out.println("该卡号已经存在");
                return acc;
            }
        }
        return  null;
    }

}

