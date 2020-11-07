package gui;

import java.awt.*;

/**
 * @author BerINs
 * @date 2020/11/7 下午10:21
 */


public class ExamplePanel extends Frame {
    Panel panBig, panSmall;

    public ExamplePanel(String title) {
        super(title);
        setSize(300, 300);
        setBackground(Color.red);
        setLayout(null);
        panBig = new Panel();
        panSmall = new Panel();
        panBig.setSize(200, 200);
        panBig.setBackground(Color.green);
        panBig.setLayout(null);
        panSmall.setSize(100, 100);
        panSmall.setBackground(Color.blue);
        panBig.add(panSmall);
        add(panBig);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ExamplePanel("Panel面板的演示");
    }
}
