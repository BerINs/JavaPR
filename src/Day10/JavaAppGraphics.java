package Day10;

import java.awt.*;
import java.awt.event.*;

public class JavaAppGraphics extends Frame implements ActionListener {
    Label prompt;
    Button btnExit;
    public JavaAppGraphics() {
        setTitle("图形界面事例");
        setLayout(new FlowLayout());                //定义布局
        prompt = new Label("祝你学习顺利!");
        prompt.setBackground(Color.yellow);
        add(prompt);

        btnExit = new Button("关闭");
        btnExit.addActionListener(this);
        add(btnExit);

        setSize(400, 150);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
    public static void main(String[] args) {
        new JavaAppGraphics();
    }

}
