package com.lyi.d3_innerclass_anonymous;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月25日 12:54
 */
public class Test2 {
    public static void main(String[] args) {
        USB usb = new USB() {
            @Override
            public void connect() {
                System.out.println("鼠标插入电脑");
            }
        };
        installUSB(usb);
    }

    public static void installUSB(USB usb){
        System.out.println("电脑启动了");
        usb.connect();
        System.out.println("电脑关机了");
    }


}

 interface USB{
    void connect();
}
