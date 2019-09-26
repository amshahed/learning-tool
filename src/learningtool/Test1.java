
package learningtool;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Test1 extends JPanel {

    JButton goback,easy,hard;

    public Test1() {
        super(new BorderLayout());
        
        /*Initialize Components*/
        easy = new JButton("Easy");
        hard = new JButton("Hard");
        goback = new JButton("Go Back");
        goback.setBounds(50, 100, 95, 30);

        easy.setBounds(200, 100, 200, 50);
        easy.setBackground(Color.red.darker());
        easy.setFont(new Font("Monospaced", Font.BOLD, 20));
        easy.setForeground(Color.white);
        easy.setBorderPainted(false);
        easy.setOpaque(true);
        
        hard.setBounds(200, 200, 200, 50);
        hard.setBackground(Color.red.darker());
        hard.setFont(new Font("Monospaced", Font.BOLD, 20));
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
           LearningTool.main.testJPanel = new Test();
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.test1JPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.testJPanel);
            LearningTool.main.testJPanel.setVisible(true);
        });
        
        hard.addActionListener((ActionEvent ae) -> {
           LearningTool.main.hardJPanel = new Hard(100,0);
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.test1JPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.hardJPanel);
            LearningTool.main.hardJPanel.setVisible(true);
        });
        goback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LearningTool.main.test1JPanel.setVisible(false);
                LearningTool.main.jf.setContentPane(LearningTool.main.mainJPanel);
                LearningTool.main.mainJPanel.setVisible(true);
            }
        });
    }

}
