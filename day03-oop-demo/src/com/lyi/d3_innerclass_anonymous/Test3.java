package com.lyi.d3_innerclass_anonymous;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月25日 13:42
 */
public class Test3 {
    public static void main(String[] args) {
//        1.创建窗口
        JFrame  win = new JFrame("登录界面");
        JPanel panel = new JPanel();
        win.add(panel);

//        2.创建一个按钮对象
        JButton button = new JButton("登录");
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(win,"别说话，等我！！！");
            }
        });
//        3.把按钮对象添加到面板
        panel.add(button);
//        4.展示窗口
        win.setSize(400,300);
        win.setLocationRelativeTo(null);
        win.setVisible(true);

    }
}
