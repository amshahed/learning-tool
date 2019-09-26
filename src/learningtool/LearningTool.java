package learningtool;

import java.awt.Image;
import java.lang.reflect.Method;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class LearningTool {

    public static LearningTool main;
    public final int width = 1250, height = 650;
    JPanel mainJPanel;
    Learn learnJPanel;
    Learn1 learn1JPanel; 
    Learnb learnbJPanel; 
    Info infoJPanel;
    Match matchJPanel;
    Match1 match1JPanel; 
   // Match1 match1JPanel; 
    Test testJPanel;
    Test1 test1JPanel;
    Hard hardJPanel;
    HardMatch hardMJPanel; 
    Score scoreJPanel;
    Result resultJPanel;

    JFrame jf;
    JButton learn, match, info,test, result;
    JLabel menu,lt, l1;
    ImageIcon img;
    DeveloperInfo devInfo;
    

    public LearningTool() {
        fakeLearningTool();
    }

    public void fakeLearningTool() {
        manageJPanel();
        mangeJFrame(mainJPanel);
    }

    public static void main(String[] args) {
        LearningTool.main = new LearningTool();
    }
    
    public static void openURL(String url) {
        String osName = System.getProperty("os.name");
        try {
            if (osName.startsWith("Mac OS")) {
                Class fileMgr = Class.forName("com.apple.eio.FileManager");
                Method openURL = fileMgr.getDeclaredMethod("openURL",
                        new Class[]{String.class});
                openURL.invoke(null, new Object[]{url});
            } else if (osName.startsWith("Windows")) {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
            } else { //assume Unix or Linux
                String[] browsers = {
                    "firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape"};
                String browser = null;
                for (int count = 0; count < browsers.length && browser == null; count++) {
                    if (Runtime.getRuntime().exec(
                            new String[]{"which", browsers[count]}).waitFor() == 0) {
                        browser = browsers[count];
                    }
                }
                if (browser == null) {
                    throw new Exception("Could not find web browser");
                } else {
                    Runtime.getRuntime().exec(new String[]{browser, url});
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ":\n" + e.getLocalizedMessage());
        }
    }

    public void manageJPanel() {
        mainJPanel = new JPanel();
        img = new ImageIcon("back1.jpg");
        learn = new JButton("");
        match = new JButton("");
        info = new JButton("");
        test = new JButton("");
        result = new JButton("Results");
        l1=new JLabel("");
        l1.setIcon(new ImageIcon(new ImageIcon("lt1.png").getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT)));
        l1.setBounds(500, 80, 1500,100);
        l1.setFont(new Font("Monospaced", Font.BOLD, 50));
        l1.setForeground(Color.BLACK);
        
        mainJPanel.add(l1);
        
        menu = new JLabel("Menu", SwingConstants.CENTER);
        menu.setIcon(img);
        menu.setOpaque(true);
        menu.setBounds(0, 0, width, height);

        learn.setBounds(500, 200, 200, 50);
        learn.setIcon(new ImageIcon(new ImageIcon("learn.png").getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT)));
        learn.setContentAreaFilled(false);
        learn.setBorderPainted(false);
        learn.setOpaque(false);
        
        test.setBounds(500, 300, 200, 50);
        test.setIcon(new ImageIcon(new ImageIcon("test.png").getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT)));
        test.setContentAreaFilled(false);
        test.setBorderPainted(false);
        test.setOpaque(false);

        match.setBounds(20, 550, 50, 50);
        match.setIcon(new ImageIcon(new ImageIcon("help.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
        match.setContentAreaFilled(false);
        match.setBorderPainted(false);
        match.setOpaque(false);
        
        info.setBounds(80, 540, 130, 70);
        info.setIcon(new ImageIcon(new ImageIcon("info.png").getImage().getScaledInstance(130, 70, Image.SCALE_DEFAULT)));
        info.setContentAreaFilled(false);
        info.setOpaque(false);
        info.setBorderPainted(false);

        mainJPanel.add(learn);
        mainJPanel.add(test);
        mainJPanel.add(match);
        mainJPanel.add(info);
        mainJPanel.add(menu);

        learn.addActionListener((ActionEvent e) -> {
            mainJPanel.setVisible(false);
            learn1JPanel = new Learn1();
            learn1JPanel.setVisible(true);
            jf.setContentPane(learn1JPanel);
        });
        
        test.addActionListener((ActionEvent e)-> {
            mainJPanel.setVisible(false);
            test1JPanel = new Test1();
            test1JPanel.setVisible(true);
            jf.setContentPane(test1JPanel);
        });

        info.addActionListener((ActionEvent e) -> {
            mainJPanel.setVisible(false);
            infoJPanel = new Info();
            infoJPanel.setVisible(true);
            jf.setContentPane(new Info());
        });
        
        
        mainJPanel.setLayout(null);
        mainJPanel.setLocation(0, 0);
        mainJPanel.setVisible(true);
        mainJPanel.setSize(width, height);
    }

    public void mangeJFrame(JPanel jp) {
        jf = new JFrame();
        jf.setTitle("Learning Tool");
        jf.setLayout(null);
        jf.setLocation(50, 50);
        jf.setVisible(true);
        jf.setSize(1250, 650);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(jp);
        jf.setVisible(true);
    }
}
