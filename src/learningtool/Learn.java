
package learningtool;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Learn extends JPanel {

    JButton shoreo, shorea, shorte, longe, shortu, longu, hrii, ae, oii, oo, oou;
    ImageIcon img, img1, img2, img3, img4, img5,img6;
    ImageIcon img7, img8, img9, img10, img11;
    
    JButton goback;

    public Learn() {
        super(new BorderLayout());
        /*Initialize Components*/
        goback = new JButton("Go Back");
       // goback.setBounds(50, 100, 95, 30);
        goback.setPreferredSize(new Dimension(100, 100));
        ///Alphabet 
        
        img = new ImageIcon(new ImageIcon("shoreo.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        shoreo = new JButton();
        shoreo.setBounds(50, 50, 100, 100);
        shoreo.setIcon(img);
        shoreo.setBorderPainted(false);
        shoreo.setOpaque(true);
        shoreo.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("shoreo");
            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(shoreo);

        img1 = new ImageIcon(new ImageIcon("shorea.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        shorea = new JButton();
        shorea.setBounds(50, 50, 100, 100);
        shorea.setIcon(img1);
        shorea.setBorderPainted(false);
        shorea.setOpaque(true);
        shorea.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("shorea");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(shorea);

        img2 = new ImageIcon(new ImageIcon("shorte.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        shorte = new JButton();
        shorte.setBounds(50, 50, 100, 100);
        shorte.setIcon(img2);
        shorte.setBorderPainted(false);
        shorte.setOpaque(true);
        shorte.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("shorte");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(shorte);

        img3 = new ImageIcon(new ImageIcon("longe.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        longe = new JButton();
        longe.setBounds(50, 50, 100, 100);
        longe.setIcon(img3);
        longe.setBorderPainted(false);
        longe.setOpaque(true);
        longe.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("longe");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(longe);

        img4 = new ImageIcon(new ImageIcon("shortu.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        shortu = new JButton();
        shortu.setBounds(50, 50, 100, 100);
        shortu.setIcon(img4);
        shortu.setBorderPainted(false);
        shortu.setOpaque(true);
        shortu.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("shortu");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(shortu);

        img5 = new ImageIcon(new ImageIcon("longu.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        longu = new JButton();
        longu.setBounds(50, 50, 100, 100);
        longu.setIcon(img5);
        longu.setBorderPainted(false);
        longu.setOpaque(true);
        longu.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("longu");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(longu);

        img6 = new ImageIcon(new ImageIcon("hrii.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        hrii = new JButton();
        hrii.setBounds(50, 50, 100, 100);
        hrii.setIcon(img6);
        hrii.setBorderPainted(false);
        hrii.setOpaque(true);
        hrii.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("hrii");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(hrii);

        img7 = new ImageIcon(new ImageIcon("ae.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        ae = new JButton();
        ae.setBounds(50, 50, 100, 100);
        ae.setIcon(img7);
        ae.setBorderPainted(false);
        ae.setOpaque(true);
        ae.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("ae");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(ae);

        img8 = new ImageIcon(new ImageIcon("oii.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        oii = new JButton();
        oii.setBounds(50, 50, 100, 100);
        oii.setIcon(img8);
        oii.setBorderPainted(false);
        oii.setOpaque(true);
        oii.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("oii");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(oii);

        img9 = new ImageIcon(new ImageIcon("oo.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        oo = new JButton();
        oo.setBounds(50, 50, 100, 100);
        oo.setIcon(img9);
        oo.setBorderPainted(false);
        oo.setOpaque(true);
        oo.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("oo");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(oo);

        img10 = new ImageIcon(new ImageIcon("oou.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        oou = new JButton();
        oou.setBounds(50, 50, 100, 100);
        oou.setIcon(img10);
        oou.setBorderPainted(false);
        oou.setOpaque(true);
        oou.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("oou");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(oou);
                
        //goback.setLocation(0,0);
        add(goback, BorderLayout.SOUTH);
        /* Setting Layout JPanel*/
        //setLayout(null);
        setLocation(0, 0);
        setVisible(true);
        setSize(1000, 1000);
        setLayout(new FlowLayout());
        setBackground(Color.decode("#DBEA97"));
        

        goback.addActionListener((ActionEvent e) -> {
            LearningTool.main.learn1JPanel = new Learn1();
            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.learn1JPanel);
            LearningTool.main.learn1JPanel.setVisible(true);
        });

    }
}
