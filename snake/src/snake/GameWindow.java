package snake;

import javax.swing.JFrame;
import java.awt.*;

public class GameWindow extends JFrame {

    public GameWindow() {
        setSize(900, 800);
        setResizable(false);
        setTitle("Snake Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);


    }

    @Override
    public void paint(Graphics g) {
       g.setColor(Color.BLACK);
      g.fillRect(100,100, 250,100);
    }
}