import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g.create();

        int width = getWidth();
        int height = getHeight();

        int circleDiameter = Math.min(width, height) - 20; // Диаметр окружности
        int x = (width - circleDiameter) / 2; // X координата верхнего левого угла описывающего прямоугольника
        int y = (height - circleDiameter) / 2; // Y координата верхнего левого угла описывающего прямоугольника

        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, circleDiameter, circleDiameter);

        g2d.setColor(Color.BLACK);
        g2d.draw(circle);

        g2d.dispose();
    }
}
