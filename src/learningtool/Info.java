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
 * @author abdullah
 */
public class Info extends JPanel {

    JButton ema, taani, shahed, abdullah, rafi, molla;
    ImageIcon img, img1, img2, img3, img4, img5,img11;
    JPanel container;
    JLabel newLine,name;
    

    JButton goback;

    public Info() {
        super(new BorderLayout());
        
        goback = new JButton("Go Back");
        goback.setBounds(50, 100, 95, 30);

        img11 = new ImageIcon("back2.jpg");
        
        newLine = new JLabel("Test");
        newLine.setText("<html><br/></html>");
        
        name = new JLabel("");
        name.setText("<html><br><font size='5'><b>Alphabet Learning Tool Team</b></font><br><br></html>");

        img = new ImageIcon(new ImageIcon("ema.jpg").getImage().getScaledInstance(120, 150, Image.SCALE_DEFAULT));
        ema = new JButton();
        ema.setBounds(50, 50, 100, 100);
        ema.setIcon(img);
        ema.setBorderPainted(false);
        ema.setOpaque(true);
        ema.addActionListener((ActionEvent ae) -> {
            LearningTool.main.devInfo = new DeveloperInfo("ema");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.infoJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.devInfo);
            LearningTool.main.devInfo.setVisible(true);
        });

        /*Adding Components*/
       // add(ema);

        img1 = new ImageIcon(new ImageIcon("taani.jpg").getImage().getScaledInstance(120, 150,  Image.SCALE_DEFAULT));
        taani= new JButton();
        taani.setBounds(50, 50, 100, 100);
        taani.setIcon(img1);
        taani.setBorderPainted(false);
        taani.setOpaque(true);
        taani.addActionListener((ActionEvent ae) -> {
            LearningTool.main.devInfo = new DeveloperInfo("taani");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.infoJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.devInfo);
            LearningTool.main.devInfo.setVisible(true);
        });

        //Adding Components
      //  add(taani);

        img2 = new ImageIcon(new ImageIcon("shahed.jpg").getImage().getScaledInstance(120, 150, Image.SCALE_DEFAULT));
        shahed = new JButton();
        shahed.setBounds(50, 50, 100, 100);
        shahed.setIcon(img2);
        shahed.setBorderPainted(false);
        shahed.setOpaque(true);
        shahed.addActionListener((ActionEvent ae) -> {
            LearningTool.main.devInfo = new DeveloperInfo("shahed");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.infoJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.devInfo);
            LearningTool.main.devInfo.setVisible(true);
        });

        //Adding Components
       // add(shahed);

        img3 = new ImageIcon(new ImageIcon("abdullah.jpg").getImage().getScaledInstance(120, 150, Image.SCALE_DEFAULT));
        abdullah = new JButton();
        abdullah.setBounds(50, 50, 100, 100);
        abdullah.setIcon(img3);
        abdullah.setBorderPainted(false);
        abdullah.setOpaque(true);
       
        abdullah.addActionListener((ActionEvent ae) -> {
            LearningTool.main.devInfo = new DeveloperInfo("abdullah");
    
            LearningTool.main.infoJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.devInfo);
            LearningTool.main.devInfo.setVisible(true);
        });

        //Adding Components
     //   add(abdullah);

        img4 = new ImageIcon(new ImageIcon("rafi.jpg").getImage().getScaledInstance(120, 150, Image.SCALE_DEFAULT));
        rafi = new JButton();
        rafi.setBounds(50, 50, 100, 100);
        rafi.setIcon(img4);
        rafi.setBorderPainted(false);
        rafi.setOpaque(true);
       
        rafi.addActionListener((ActionEvent ae) -> {
            LearningTool.main.devInfo = new DeveloperInfo("rafi");
            LearningTool.main.infoJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.devInfo);
            LearningTool.main.devInfo.setVisible(true);
        });

        //Adding Components
       // add(rafi);

        img5 = new ImageIcon(new ImageIcon("molla.jpg").getImage().getScaledInstance(120, 150, Image.SCALE_DEFAULT));
        molla = new JButton();
        molla.setBounds(50, 50, 100, 100);
        molla.setIcon(img5);
        molla.setBorderPainted(false);
        molla.setOpaque(true);
       
        molla.addActionListener((ActionEvent ae) -> {
             LearningTool.main.devInfo = new DeveloperInfo("molla");
            LearningTool.main.infoJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.devInfo);
            LearningTool.main.devInfo.setVisible(true);
        });

        //Adding Components
       // add(molla); 
       
        setLocation(0, 0);
        setVisible(true);
        setSize(600, 500);
        setLayout(new FlowLayout());
        setBackground(Color.decode("#DBEA97"));
       
        container = new JPanel();
        container.setLayout(new GridBagLayout());
        container.setBackground(Color.decode("#DBEA97"));
       
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 0;
        container.add(name, c);
        c.gridx = 0;
        c.gridy = 1;
        container.add(ema, c);
        c.gridx = 1;
        c.gridy = 1;
        container.add(taani, c);
        c.gridx = 2;
        c.gridy = 1;
        container.add(shahed, c);
        c.gridx = 0;
        c.gridy = 2;
        container.add(newLine, c);
        c.gridx = 0;
        c.gridy = 3;
        container.add(abdullah, c);
        c.gridx = 1;
        c.gridy = 3;
        container.add(rafi, c);
        c.gridx = 2;
        c.gridy = 3;
        container.add(molla, c);
        
        c.gridx = 1;
        c.gridy = 4;
        container.add(goback, c); 
        
        add(container);

        goback.addActionListener((ActionEvent e) -> {
            LearningTool.main.infoJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.mainJPanel);
            LearningTool.main.mainJPanel.setVisible(true);
        });

    }    
    
}
