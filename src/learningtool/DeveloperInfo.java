/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningtool;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author mariumbinteibrahim
 */
public class DeveloperInfo extends JPanel{
    
    JButton ema, taani, shahed, abdullah, rafi, molla, goback;
    ImageIcon img, img1, img2, img3, img4, img5,img11;
    JPanel container;
    JLabel newLine,name;
  
    public DeveloperInfo(String letter){
        super(new BorderLayout());
        
        
        goback = new JButton("Go Back");
        goback.setBounds(50, 100, 95, 30);

        img11 = new ImageIcon("back2.jpg");
       
        newLine = new JLabel("Test");
        newLine.setText("<html><br><br></html>");
        
        name = new JLabel("Test");
        
        
       
        //label1.setText("");
        
        if(letter.equals("ema")){
             img = new ImageIcon(new ImageIcon("ema.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
             name.setText("<html><center><br><font size='6'><b>Marium Binte Ibrahim</b></font<br><br><font size='4'>Currently studying in MIST, CSE, level 4<br>Contact: marium_ema@yahoo.com</font><br></center></html>");
        }
           
        else if(letter.equals("taani")){
           img = new ImageIcon(new ImageIcon("taani.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)); 
           name.setText("<html><center><br><font size='6'><b>Taani Hossain</b></font<br><br><font size='4'>Currently studying in MIST, CSE, level 4<br>Contact: </font><br></center></html>");
        }
       
        else if(letter.equals("shahed")){
           img = new ImageIcon(new ImageIcon("shahed.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)); 
           name.setText("<html><center><br><font size='6'><b>A M Shahed Hasan</b></font<br><br><font size='4'>Currently studying in MIST, CSE, level 4<br>Contact: </font><br></center></html>");
        }
            
        else if(letter.equals("abdullah")){
           img = new ImageIcon(new ImageIcon("abdullah.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)); 
           name.setText("<html><center><br><font size='6'><b>Syed Abdullah</b></font<br><br><font size='4'>Currently studying in MIST, CSE, level 4<br>Contact: syedabdullahrahman@gmail.com</font><br></center></html>");
        }
            
        else if(letter.equals("molla")){
           img = new ImageIcon(new ImageIcon("molla.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
           name.setText("<html><center><br><font size='6'><b>Shoab Ur Rashid Mollah</b></font<br><br><font size='4'>Currently studying in MIST, CSE, level 4<br>Contact: </font><br></center></html>");
        }
            
        else if(letter.equals("rafi")){
           img = new ImageIcon(new ImageIcon("rafi.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)); 
           name.setText("<html><center><br><font size='6'><b>Muhammad Bin Faruk</b></font<br><br><font size='4'>Currently studying in MIST, CSE, level 4<br>Contact: </font><br></center></html>");
        }
            
        
        
        ema = new JButton();
        ema.setBounds(50, 50, 100, 100);
        ema.setIcon(img);
        ema.setBorderPainted(false);
        ema.setOpaque(true);
        /*Adding Components*/
        
        container = new JPanel();
        container.setLayout(new GridBagLayout());
        container.setBackground(Color.decode("#DBEA97"));
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        container.add(newLine, c);
        c.gridx = 0;
        c.gridy = 1;
        container.add(ema, c);
        c.gridx = 0;
        c.gridy = 2;
        container.add(newLine, c);
        c.gridx = 0;
        c.gridy = 3;
        container.add(name, c);
        c.gridx = 0;
        c.gridy = 4;
        container.add(newLine, c);
        c.gridx = 0;
        c.gridy = 5;
        container.add(goback, c); 
        
        add(container);
       
     

        //goback.setLocation(0,0);
       // add(goback, BorderLayout.SOUTH);

        /* Setting Layout JPanel*/
        //setLayout(null);
        setLocation(0, 0);
        setVisible(true);
        setSize(600, 500);
        setLayout(new FlowLayout());
        setBackground(Color.decode("#DBEA97"));

        goback.addActionListener((ActionEvent e) -> {
            LearningTool.main.devInfo.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.infoJPanel);
            LearningTool.main.infoJPanel.setVisible(true);
        });

    }    
    
    
}
    
    
   
