package com.lyi.d1_interface_jdk8;

public interface SportManInter {
    /**
     * 1.JDK1.8开始： 默认方法（实列清单）
     *  必须default修饰 默认public修饰
     *  默认方法，接口不能创建对象，这个方法只能过继给实现类，实现类调用
     */
    default  void run(){
//        go();
        System.out.println("跑的很快");
    }

    /**
     * 2.静态方法
     *   必须使用static修饰 默认public
     *   接口的静态方法，必须使用接口名自己调用
     */
    static void connect(){
        System.out.println("我可以作为连接接口");
    }

    /**
     * 3.jdk9开始：私有方法
     *   必须使用private
     *   必须在内部接口使用
     */
//    private void go(){
//        System.out.println("我们开始跑");
//    }



}
