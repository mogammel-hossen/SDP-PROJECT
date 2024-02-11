package com.mycompany.practise;
import java.awt.Color;
import javax.swing.*;
public class Practise {
    
    public static void main(String[] args) {
        int hight = 400, width = 400;
       JFrame frame = new JFrame("snake");
       frame.setVisible(true);
       frame.setSize(width, hight);
       frame.setLocationRelativeTo(null);
       frame.setResizable(false);
<<<<<<< HEAD
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
=======
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
>>>>>>> a9478edcf56d2bb477b947d08a870593c1b4b181
       SnakeGame game = new SnakeGame(width,hight);
       frame.add(game);
    }   
}
