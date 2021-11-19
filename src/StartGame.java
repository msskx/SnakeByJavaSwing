import javax.swing.*;
import java.awt.*;

public class StartGame {
    public static void main(String[] args) {
        JFrame jf=new JFrame("贪吃蛇");
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
//        jf.setSize(800,800);
//        jf.setLocationRelativeTo(null);//无依赖居中
        jf.setBounds((width-800)/2,(height-800)/2,800,800);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        GamePane gamePane = new GamePane();
        jf.add(gamePane);
        jf.setVisible(true);
    }
}
