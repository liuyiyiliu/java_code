package com.lyi.d2_polymorphic_test;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月25日 10:55
 */
public class Computer  {
    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public void start(){
        System.out.println(name + "电脑启动了");
    }

    public void installUSB(USB usb){
        usb.connect();
        if(usb instanceof KeyBoard){
            KeyBoard keyBoard = (KeyBoard) usb;
            keyBoard.print();
        }else if(usb instanceof  Mouse){
            Mouse mouse = (Mouse)usb;
            mouse.move();
        }
        usb.disconnect();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
