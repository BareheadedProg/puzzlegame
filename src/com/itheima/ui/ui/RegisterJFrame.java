package com.itheima.ui.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    //代表RegisterJFrame注册界面相关的代码

    public RegisterJFrame(){
        //设置界面宽高
        this.setSize(488, 500);
        //设置界面标题
        this.setTitle("注册界面");
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
