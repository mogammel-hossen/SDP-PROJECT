
package com.mycompany.main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class SnakeGame extends JPanel implements ActionListener, KeyListener{

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
    Random random;
    
    // it's for game logic
    Timer gameloop;
    
    int valocityX;
    int valocityY;
    boolean gameOver = false;

    
    SnakeGame(int hight,int width){
        this.hight = hight;
        this.width = width;
        
        
        setPreferredSize(new Dimension(this.width,this.hight));
        setBackground(Color.ORANGE);
        addKeyListener(this);
        setFocusable(true);
        
        
        head = new Tile(5,5);
	food = new Tile(5,5);
        
        random = new Random();
        Food();
        
        valocityX = 1;
        valocityY = 0;
        
        gameloop = new Timer(1000,this);
        gameloop.start();
    }
    
    public boolean collision(Tile taile1, Tile taile2){
        return taile1.a == taile2.a && taile1.b == taile2.b;
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

         //show scoring and game over 
        gp.setFont(new Font("Arial", Font.PLAIN,16));
        if(gameOver){
            gp.setColor(Color.black);
            gp.drawString("GameOver:" +  String.valueOf(snakeBody.size()), tilesize - 16, tilesize);
        }
        else{
            gp.drawString("Score:" +  String.valueOf(snakeBody.size()), tilesize - 16, tilesize);
        }
        

    }
    
    public void Food(){
        // here the food position wil be a random number
        food.a = random.nextInt(width/tilesize);
        food.b = random.nextInt(hight/tilesize);
    }
    
    public void move(){

        
        head.a += valocityX;
        head.b += valocityY;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
         repaint();
         move();
    }
    
     @Override
    public void keyPressed(KeyEvent e) {
        //here snake move only up
    if (e.getKeyCode()== KeyEvent.VK_UP && valocityY != 1 ){
        valocityX = 0;
        valocityY = -1;
    }
    
         //here snake move only down
    else if (e.getKeyCode()== KeyEvent.VK_DOWN && valocityY != -1){
        valocityX = 0;
        valocityY = 1;
    }
    
          //here snake move only left
     else if (e.getKeyCode()== KeyEvent.VK_LEFT && valocityX != 1){
        valocityX = -1;
        valocityY = 0;
    }
    
          //here snake move only right   
     else if (e.getKeyCode()== KeyEvent.VK_RIGHT && valocityX != -1){
        valocityX = 1;
        valocityY = 0;
    }
    
    }
    
     @Override
    public void keyTyped(KeyEvent e) {
    }


    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}