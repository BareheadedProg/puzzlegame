package com.itheima.ui.ui;

import javax.swing.*;
import java.util.Random;

public class GameJFrame extends JFrame {
    //JFrame界面窗体
    //子类也是界面或者窗体
    //规定:gameJframe这个界面表示的就是游戏主界面


    //定义二维数组
    //目的:用来管理数据
    //加载图片的时候,会根据它来加载
    int [][] arr2 = new int[4][4];

    //无参构造初始化
    public GameJFrame() {
        //初始化界面
        initJFrame();

        //初始化菜单
        initJmenuBar();

        //初始化数据(打乱数据)
        initData();

        //初始化图片(根据打乱的数据/图片来加载)
        initImage();

        //让界面显示出来,建议写在最后
        this.setVisible(true);
    }

    //数据初始化
    //打乱二维数组的顺序
    private void initData() {
        //1.定义一个数组
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //2.打乱数组中的数据顺序
        //遍历数组,跟随己索引上的数据进行数据交换
        for (int i = 0; i < arr.length; i++) {
            //生成随机数
            Random r = new Random();
            int index = r.nextInt(arr.length);
            //交换数据
            int tempArr = arr[i];
            arr[i] = arr[index];
            arr[index] = tempArr;
        }
        //打印交换后的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        //4.遍历将一维数据添加到二维数组
        for (int i = 0; i < arr.length; i++) {
            arr2[i / 4][i % 4] = arr[i];
        }
    }


    //初始化图片
    //添加图片的时候,要按照二维数组的数据添加图片
    private void initImage() {
        //循环将所有图片添加到界面中
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //让index获取数组中的数据
                int index = arr2[i][j];
                //创建图片ImageIcon对象
                ImageIcon icon = new ImageIcon("D:\\develop\\project\\code17\\puzzlegame\\image\\animal\\animal3\\" + index + ".jpg");
                //创建JLabel对象(管理容器)
                JLabel jLabel = new JLabel(icon);
                //置顶图片位置
                jLabel.setBounds(j * 105, i * 105, 105, 105);
                //将jLabel添加到隐藏容器
                this.getContentPane().add(jLabel);
                //把管理容器添加到界面中
                this.add(jLabel);
                //表示加载下一张图片
                index++;
            }
        }
    }


    //界面初始化
    private void initJFrame() {
        //设置界面宽高
        this.setSize(603, 680);
        //设置界面标题
        this.setTitle("拼图游戏单机版");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //点击关闭游戏后,停止虚拟机工作状态
        //关闭模式,3代表关掉一个窗口就结束虚拟机运行
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //取消默认居中放置
        this.setLayout(null);
    }

    //菜单栏初始化
    private void initJmenuBar() {
        //初始化菜单
        //创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建jmenu对象
        JMenu functionJmenu = new JMenu("功能");
        JMenu aboutJmenu = new JMenu("关于我们");

        //创建下面的条目对象
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");

        //将每一个条目添加到jmenu选项中
        functionJmenu.add(replayItem);
        functionJmenu.add(reLoginItem);
        functionJmenu.add(closeItem);

        aboutJmenu.add(accountItem);

        //将jmenu条目添加到菜单对象中
        jMenuBar.add(functionJmenu);
        jMenuBar.add(aboutJmenu);

        //将菜单添加到JFrame界面中
        this.setJMenuBar(jMenuBar);
    }
}
