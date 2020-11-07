package gui;

import java.awt.*;

/**
 * @author BerINs
 * @date 2020/11/7 下午10:44
 */


public class ExampleLabel extends Frame {
    Label lb1, lb2 , lb3, lb4, lb5, lb6;
    Panel pan;

    public ExampleLabel(String title) {
        super(title);
        lb1 = new Label();
        lb1.setBackground(Color.red);
        lb1.setText("添加");
        lb2 = new Label("默认");
        lb2.setBackground(Color.red);
        lb3 = new Label("靠左", 0);
        lb3.setBackground(Color.red);
        lb6 = new Label("更改");
        lb6.setBackground(Color.red);
        lb6.setAlignment(Label.CENTER);

        pan = new Panel();
        pan.add(lb1);
        pan.add(lb2);
        pan.add(lb3);
        pan.add(lb6);
        add(pan);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new ExampleLabel("Label的演示");
    }
}
