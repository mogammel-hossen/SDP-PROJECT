
package com.mycompany.practise;
import java.awt.*;
import javax.swing.*;
public class SnakeGame extends JPanel{

    private class Scord{
        int a;
        int b;
        
        // scord means each house
        Scord(int a,int b){
            this.a = a;
            this.b = b;
        }
    }
    int hight;
    int width;
    int scordsize = 25;
    Scord food;
    Scord own;
    
    SnakeGame(int hight,int width){
        this.hight = hight;
        this.width = width;
        
        
        setPreferredSize(new Dimension(this.width,this.hight));
        setBackground(Color.ORANGE);
        
        own = new Scord(5,5);

	food = new Scord(10,10);
    }
    
    public void paintComponent(Graphics gp){
        super.paintComponent(gp);
        draw(gp);
    }
    
    public void draw(Graphics gp){
        gp.setColor(Color.red);
        gp.fillRect(own.a, own.b, scordsize, scordsize);

        gp.setColor(Color.red);
        gp.fill3DRect(food.x*titleSize, food.y*titleSize, titleSize, titleSize,true);
        
        gp.setColor(Color.green);
        gp.fill3DRect(snakeHead.x*titleSize, snakeHead.y*titleSize, titleSize, titleSize,true);
    }

    
}
