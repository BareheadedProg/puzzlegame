import com.itheima.ui.ui.GameJFrame;
import com.itheima.ui.ui.LoginJFrame;
import com.itheima.ui.ui.RegisterJFrame;

public class App {
    public static void main(String[] args) {
        //表示程序启动入口

        //如果想开启窗口,就创建谁的对象
        new LoginJFrame();



        new RegisterJFrame();



        new GameJFrame();
    }
}
