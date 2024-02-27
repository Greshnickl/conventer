import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Main {
    private static Point mouseDownCompCoords;

    public static void main(String[] args) {
        JFrame win = new JFrame();
        win.setSize(500, 500);
        win.setUndecorated(true);
        JPanel main_pan = new JPanel();
        JPanel nav = new JPanel();
        nav.setSize(500, 25);
        nav.setBackground(new Color(33, 33, 33));
        nav.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                mouseDownCompCoords = e.getPoint();
            }
        });
        nav.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                Point currCoords = e.getLocationOnScreen();
                win.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
            }
        });

        main_pan.setSize(500, 475);
        main_pan.setBackground(new Color(54, 54, 54));
        Circle circle = new Circle();
        main_pan.add(circle);


        win.add(nav);
        win.add(main_pan);


        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);

    }




}