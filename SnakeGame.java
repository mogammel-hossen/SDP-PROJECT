
package com.mycompany.practise;
import java.awt.*;
import javax.swing.*;
import java.util.*;
public class SnakeGame extends JPanel{
    private class Tile{
        int a;
        int b;
        
        // tile means each house
        Tile(int a,int b){
            this.a = a;
            this.b = b;
        }
    }
    int hight;
    int width;
    int tilesize = 25;
    Tile food;
    Tile head;
    
    SnakeGame(int hight,int width){
        this.hight = hight;
        this.width = width;
        
        
        setPreferredSize(new Dimension(this.width,this.hight));
        setBackground(Color.ORANGE);
        
        head = new Tile(5,5);

	food = new Tile(10,10);
    }
    
    public void paintComponent(Graphics gp){
        super.paintComponent(gp);
        draw(gp);
    }
    
    public void draw(Graphics gp){
        for(int i=0;i<width/tilesize;i++){
            gp.drawLine(i*tilesize, 0, i*tilesize, hight);
            gp.drawLine(0, i*tilesize,width, i*tilesize);
        }
        // it is for food
        gp.setColor(Color.blue);
        gp.fillRect(food.a * tilesize, food.b * tilesize, tilesize, tilesize);
        // it is for snake
        gp.setColor(Color.red);
        gp.fillRect(head.a * tilesize, head.b * tilesize, tilesize, tilesize);
    }
}