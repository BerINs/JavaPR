package shapesnew;

/**
 * @author BerINs
 * @date 2020/11/7 下午4:28
 */

import shapes.*;

import java.awt.*;

public class CircleNew extends Circle implements DrawShapes {
    int xCoord = 100;
    int yCoord = 300;

    public CircleNew(int r) {
        super(r);
    }

    public void draw(Graphics g) {
        g.drawOval(xCoord - radius, yCoord - radius, 2 * radius, 2 * radius);
    }

    public void fillcolor(Graphics g, Color c) {
        g.setColor(c);
        g.fillOval(xCoord - radius, yCoord - radius, 2 * radius, 2 * radius);
    }
}
