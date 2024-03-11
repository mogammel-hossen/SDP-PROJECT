
package com.mycompany.java;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GameFrame extends JFrame{

	private static final long serialVersionUID = 1L;

       GameFrame(){
       JFrame frame = new JFrame("Home page");
       frame.setVisible(true);
       frame.setSize(400, 400);
       frame.setLocationRelativeTo(null);
       frame.setResizable(false);
       frame.getContentPane().setBackground(Color.green);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        JButton bton=new JButton("New_Game");  
        bton.setBounds(100,100,150,30); 
        bton.setBackground(Color.orange);
        bton.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){ 
            int time = 500;
            GamePanel panel = new GamePanel(time);
            JFrame frame = new JFrame("snake");
            frame.setVisible(true);
            frame.setSize(400, 400);
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(panel);
            }  
        });
        frame.add(bton);  
        frame.setSize(400,400);  
        frame.setLayout(null);  
        frame.setVisible(true);
        
        JButton bton2=new JButton("Speed");
        bton2.setBounds(100,150,150,30);        
        bton2.setBackground(Color.orange);
        bton2.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){ 
              Speed sp = new Speed(400,400);

            }  
        }); 
        frame.add(bton2);
        frame.setSize(400,400);  
        frame.setLayout(null);  
        frame.setVisible(true); 
        
            JButton bton7=new JButton("History");
            bton7.setBounds(100,200,150,30);
            bton7.setBackground(Color.orange);
            bton7.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
            
            try  
            {  
            //constructor of file class having file as argument  
            File file = new File("C:\\Users\\HP\\Documents\\NetBeansProjects\\Practise\\Game.txt");   
            if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not  
            {  
            System.out.println("not supported");  
            return;  
            }  
            Desktop desktop = Desktop.getDesktop();  
            if(file.exists())         //checks file exists or not  
            desktop.open(file);              //opens the specified file  
            }  
            catch(Exception ee)  
            {  
            ee.printStackTrace();  
            }  
                    
            }  
        });
            frame.add(bton7);
            frame.setSize(400,400);  
            frame.setLayout(null);  
            frame.setVisible(true);
        
            JButton bton6=new JButton("Exit");
            bton6.setBounds(100,250,150,30);
            bton6.setBackground(Color.orange);
            bton6.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
            
            System.exit(0);
                    
            }  
        });
            frame.add(bton6);
            frame.setSize(400,400);  
            frame.setLayout(null);  
            frame.setVisible(true);
        
        }
                	
}