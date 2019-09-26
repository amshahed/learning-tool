
package learningtool;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class Learn1 extends JPanel {
    
    
    JButton goback,easy,hard;
    ImageIcon img,img1;

    public Learn1() {
        super(new BorderLayout());
        
        /*Initialize Components*/
       img = new ImageIcon(new ImageIcon("vowel1.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
       img1 = new ImageIcon(new ImageIcon("cons1.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

        easy = new JButton("ShoroBorno");
        hard = new JButton("BanjonBorno");
        goback = new JButton("Go Back");
        goback.setBounds(50, 100, 95, 30);

        //easy.setIcon(img);
        easy.setBounds(200, 100, 200, 50);
        easy.setBackground(Color.red.darker());
        easy.setFont(new Font("Monospaced", Font.BOLD, 20));
        easy.setForeground(Color.white);
        easy.setBorderPainted(false);
        easy.setOpaque(true);
        
        hard.setBounds(200, 200, 200, 50);
        hard.setBackground(Color.red.darker());
        hard.setFont(new Font("Monospaced", Font.BOLD, 20));
       // hard.setIcon(img1);
        hard.setForeground(Color.white);
        hard.setBorderPainted(false);
        hard.setOpaque(true);
        /* Setting Layout JPanel*/
        setLayout(null);
        setLocation(0, 0);
        setVisible(true);
        setSize(600, 500);
        setBackground(Color.decode("#DBEA97"));
        
        /*Adding Components*/
        add(goback, BorderLayout.SOUTH);
        add(easy);
        add(hard);
        easy.addActionListener((ActionEvent ae) -> {
            LearningTool.main.learnJPanel = new Learn();
            LearningTool.main.learn1JPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.learnJPanel);
            LearningTool.main.learnJPanel.setVisible(true);
        });
        
        hard.addActionListener((ActionEvent ae) -> {
            LearningTool.main.learnbJPanel = new Learnb();
            LearningTool.main.learn1JPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.learnbJPanel);
            LearningTool.main.learnbJPanel.setVisible(true);
        });
        goback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LearningTool.main.learn1JPanel.setVisible(false);
                LearningTool.main.jf.setContentPane(LearningTool.main.mainJPanel);
                LearningTool.main.mainJPanel.setVisible(true);
            }
        });
    }

}

    

