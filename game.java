import java.awt.Color;
import javax.swing.*;
public class Game {
    
    public static void main(String[] args) {
        int hight = 400, width = 400;
       JFrame frame = new JFrame("snake");
       frame.setVisible(true);
       frame.setSize(width, hight);
       frame.setLocationRelativeTo(null);
       frame.setResizable(false);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       SnakeGame game = new SnakeGame(width,hight);
       frame.add(game);
    }   
}

