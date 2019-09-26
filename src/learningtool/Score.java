/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningtool;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Taani
 */

public class Score extends JPanel {

    JButton next,quit,goback;
    JLabel l,l1,l2;
    String result,date1;
    JTextField jt;
    int a,b;
   
    String name;

    public Score(int scr) {
        
        DateFormat df=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date=new Date();
        date1=df.format(date);
        
        goback=new JButton("Go To Main Menu");
        goback.setBounds(50, 50, 200, 50);
        
        
        l2=new JLabel("\nHI");
        l1=new JLabel();
        jt= new JTextField(30);
       
        jt.setPreferredSize(new Dimension(500, 80));
        add(jt);
        jt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name=jt.getText();
                System.out.println(name);
                l1.setText(name);
                jt.setVisible(false);
                  Connection myconobj=null;
        String sql = "INSERT INTO TAANI.SCORET(NAME,SCORE,DATE) VALUES (?,?,?)";
        String sql1 = "SELECT * FROM SCORET";

        try{
         //   Class.forName("org.apache.derby.jdbc.ClientDriver");

             myconobj=DriverManager.getConnection("jdbc:derby://localhost:1527/MyDataBse", "taani","123456");
             
             PreparedStatement statement = myconobj.prepareStatement(sql);
                   statement.setString(1,name);
                       
                       statement.setInt(2, scr);
                       statement.setString(3, date1);
                        
                  int rowsInserted = statement.executeUpdate();
                  if (rowsInserted > 0) {
                   System.out.println("A new record inserted successfully!");               
                 } 
                  
    }
        catch (Exception ee) {
            // TODO Auto-generated catch block
            ee.printStackTrace();
        }
                
            }
        });
        
          goback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LearningTool.main.scoreJPanel.setVisible(false);
                LearningTool.main.jf.setContentPane(LearningTool.main.mainJPanel);
                LearningTool.main.mainJPanel.setVisible(true);
            }
        });        
        
        l2.setBounds(300, 500, 300,500);
        //l2.setSize(300, 100);
        l2.setFont(new Font("Monospaced", Font.BOLD, 30));
        add(l2);
        
        l1.setBounds(400, 500, 300,500);
       // l1.setSize(300, 100);
        l1.setFont(new Font("Monospaced", Font.BOLD, 30));
        add(l1);
        l=new JLabel(" ,Score= "+ scr);
        l.setBounds(500, 500, 300,500);
       // l.setSize(300, 100);
        l.setFont(new Font("Monospaced", Font.BOLD, 30));
        
        add(l);
        add(goback);
       
      
    }
}