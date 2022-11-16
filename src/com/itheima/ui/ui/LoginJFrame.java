package com.itheima.ui.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    //LoginJFrame表示登录界面的相关代码


    //构造方法初始化界面
    public LoginJFrame(){
        //创建登录界面时,直接给界面设置信息
        //比如宽 高,直接展示出来
        this.setSize(488, 430);
        //设置界面标题
        this.setTitle("登录界面");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //点击关闭游戏后,停止虚拟机工作状态
        //关闭模式,3代表关掉一个窗口就结束虚拟机运行
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //让界面显示出来,建议写在最后
        this.setVisible(true);
    }
}
