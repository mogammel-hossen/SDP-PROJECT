package com.mycompany.practise;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Speed{
    Speed(int hight, int width){
    JFrame frame = new JFrame("Spreed");
            frame.getContentPane().setBackground(Color.green);
            frame.setVisible(true);
            frame.setSize(width, hight);
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           
            JButton bton3=new JButton("High");
            bton3.setBounds(100,100,150,30);
            bton3.setBackground(Color.yellow);
            bton3.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
            int time = 200;
            SnakeGame game = new SnakeGame(width,hight,time);
            JFrame frame = new JFrame("snake");
            frame.setVisible(true);
            frame.setSize(width, hight);
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(game);                   
            }  
        });
            frame.add(bton3);
            frame.setSize(400,400);  
            frame.setLayout(null);frame.setVisible(true); 
            
            JButton bton4=new JButton("Medium");
            bton4.setBounds(100,150,150,30);
            bton4.setBackground(Color.yellow);
            bton4.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
            int time = 500;
            SnakeGame game = new SnakeGame(width,hight,time);
            JFrame frame = new JFrame("snake");
            frame.setVisible(true);
            frame.setSize(width, hight);
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(game);                   
            }  
        });
            frame.add(bton4);
            frame.setSize(400,400);  
            frame.setLayout(null);frame.setVisible(true);
            
            JButton bton5=new JButton("Low");
            bton5.setBounds(100,200,150,30);
            bton5.setBackground(Color.yellow);
            bton5.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
            int time = 1000;
            SnakeGame game = new SnakeGame(width,hight,time);
            JFrame frame = new JFrame("snake");
            frame.setVisible(true);
            frame.setSize(width, hight);
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(game);                    
            }  
        });
            frame.add(bton5);
            frame.setSize(400,400);  
            frame.setLayout(null);  
            frame.setVisible(true);
    }
}