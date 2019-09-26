
package learningtool;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Learnb extends JPanel {

    JButton ko,kho,go,gho,umo,cho,chho,jo,jho,neo,tto,ttho,ddo,ddho,mono,to,tho,doo,dho,no;
    JButton po,pho,bo,bho,mo,ojo,ro,lo,sho,ssho,sssho,ho,rro,rrro,oyo,khoto,onu,bindu;
    ImageIcon img12,img13,img14,img15,img16,img17,img18,img19,img20,img21,img22,img23;
    ImageIcon img24,img25,img26,img27,img28,img29,img30,img31,img32,img33,img34,img35;
    ImageIcon img36,img37,img38,img39,img40,img41,img42,img43,img44,img45,img46,img47,img48,img49;
    


    JButton goback;

    public Learnb() {
        super(new BorderLayout());
        /*Initialize Components*/
        goback = new JButton("Go Back");
        goback.setBounds(50, 100, 95, 30);
        
        
         img12 = new ImageIcon(new ImageIcon("ko.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         ko = new JButton();
         ko.setBounds(50, 50, 100, 100);
         ko.setIcon(img12);
         ko.setBorderPainted(false);
         ko.setOpaque(true);
         ko.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("ko");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(ko);
        
        img13 = new ImageIcon(new ImageIcon("kho.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         kho = new JButton();
         kho.setBounds(50, 50, 100, 100);
         kho.setIcon(img13);
         kho.setBorderPainted(false);
         kho.setOpaque(true);
         kho.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("kho");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(kho);
        
        
         img14 = new ImageIcon(new ImageIcon("go.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         go = new JButton();
         go.setBounds(50, 50, 100, 100);
         go.setIcon(img14);
         go.setBorderPainted(false);
         go.setOpaque(true);
         go.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("go");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(go);
         img15 = new ImageIcon(new ImageIcon("gho.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         gho = new JButton();
         gho.setBounds(50, 50, 100, 100);
         gho.setIcon(img15);
         gho.setBorderPainted(false);
         gho.setOpaque(true);
         gho.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("gho");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(gho);
        
         img16 = new ImageIcon(new ImageIcon("umo.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         umo = new JButton();
         umo.setBounds(50, 50, 100, 100);
         umo.setIcon(img16);
         umo.setBorderPainted(false);
         umo.setOpaque(true);
         umo.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("umo");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(umo);
        
         img17 = new ImageIcon(new ImageIcon("cho.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         cho = new JButton();
         cho.setBounds(50, 50, 100, 100);
         cho.setIcon(img17);
         cho.setBorderPainted(false);
         cho.setOpaque(true);
         cho.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("cho");       
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(cho);
        
         img18 = new ImageIcon(new ImageIcon("chho.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         chho = new JButton();
         chho.setBounds(50, 50, 100, 100);
         chho.setIcon(img18);
         chho.setBorderPainted(false);
         chho.setOpaque(true);
         chho.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("chho");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(chho);

         img19 = new ImageIcon(new ImageIcon("jo.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         jo = new JButton();
         jo.setBounds(50, 50, 100, 100);
         jo.setIcon(img19);
         jo.setBorderPainted(false);
         jo.setOpaque(true);
         jo.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("jo");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(jo);
        
        img20 = new ImageIcon(new ImageIcon("jho.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         jho = new JButton();
         jho.setBounds(50, 50, 100, 100);
         jho.setIcon(img20);
         jho.setBorderPainted(false);
         jho.setOpaque(true);
         jho.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("jho");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(jho);
        
         img21 = new ImageIcon(new ImageIcon("neo.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         neo = new JButton();
         neo.setBounds(50, 50, 100, 100);
         neo.setIcon(img21);
         neo.setBorderPainted(false);
         neo.setOpaque(true);
         neo.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("neo");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(neo);
        
        img22 = new ImageIcon(new ImageIcon("tto.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         tto = new JButton();
         tto.setBounds(50, 50, 100, 100);
         tto.setIcon(img22);
         tto.setBorderPainted(false);
         tto.setOpaque(true);
         tto.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("tto");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(tto);
        
        img23 = new ImageIcon(new ImageIcon("ttho.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         ttho = new JButton();
         ttho.setBounds(50, 50, 100, 100);
         ttho.setIcon(img23);
         ttho.setBorderPainted(false);
         ttho.setOpaque(true);
         ttho.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("ttho");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(ttho);
        
        img24 = new ImageIcon(new ImageIcon("ddo.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         ddo = new JButton();
         ddo.setBounds(50, 50, 100, 100);
         ddo.setIcon(img24);
         ddo.setBorderPainted(false);
         ddo.setOpaque(true);
         ddo.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("ddo");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(ddo);
        
        img25 = new ImageIcon(new ImageIcon("ddho.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         ddho = new JButton();
         ddho.setBounds(50, 50, 100, 100);
         ddho.setIcon(img25);
         ddho.setBorderPainted(false);
         ddho.setOpaque(true);
         ddho.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("ddho");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(ddho);
        
        img26 = new ImageIcon(new ImageIcon("mono.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         mono = new JButton();
         mono.setBounds(50, 50, 100, 100);
         mono.setIcon(img26);
         mono.setBorderPainted(false);
         mono.setOpaque(true);
         mono.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("mono");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(mono);
        
        img27 = new ImageIcon(new ImageIcon("to.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         to = new JButton();
         to.setBounds(50, 50, 100, 100);
         to.setIcon(img27);
         to.setBorderPainted(false);
         to.setOpaque(true);
         to.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("to");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(to);
        
        img28 = new ImageIcon(new ImageIcon("tho.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         tho = new JButton();
         tho.setBounds(50, 50, 100, 100);
         tho.setIcon(img28);
         tho.setBorderPainted(false);
         tho.setOpaque(true);
         tho.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("tho");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(tho);
        
        img29 = new ImageIcon(new ImageIcon("doo.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         doo = new JButton();
         doo.setBounds(50, 50, 100, 100);
         doo.setIcon(img29);
         doo.setBorderPainted(false);
         doo.setOpaque(true);
         doo.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("doo");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(doo);
        
        img30 = new ImageIcon(new ImageIcon("dho.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         dho = new JButton();
         dho.setBounds(50, 50, 100, 100);
         dho.setIcon(img30);
         dho.setBorderPainted(false);
         dho.setOpaque(true);
         dho.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("dho");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(dho);
        
        img31 = new ImageIcon(new ImageIcon("no.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         no = new JButton();
         no.setBounds(50, 50, 100, 100);
         no.setIcon(img31);
         no.setBorderPainted(false);
         no.setOpaque(true);
         no.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("no");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(no);
        
        img32 = new ImageIcon(new ImageIcon("po.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         po = new JButton();
         po.setBounds(50, 50, 100, 100);
         po.setIcon(img32);
         po.setBorderPainted(false);
         po.setOpaque(true);
         po.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("po");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(po);
        
        img33 = new ImageIcon(new ImageIcon("pho.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         pho = new JButton();
         pho.setBounds(50, 50, 100, 100);
         pho.setIcon(img33);
         pho.setBorderPainted(false);
         pho.setOpaque(true);
         pho.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("pho");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(pho);
        
        img34 = new ImageIcon(new ImageIcon("bo.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         bo = new JButton();
         bo.setBounds(50, 50, 100, 100);
         bo.setIcon(img34);
         bo.setBorderPainted(false);
         bo.setOpaque(true);
         bo.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("bo");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(bo);
        
         img35 = new ImageIcon(new ImageIcon("bho.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         bho = new JButton();
         bho.setBounds(50, 50, 100, 100);
         bho.setIcon(img35);
         bho.setBorderPainted(false);
         bho.setOpaque(true);
         bho.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("bho");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(bho);
        
         img36 = new ImageIcon(new ImageIcon("mo.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         mo = new JButton();
         mo.setBounds(50, 50, 100, 100);
         mo.setIcon(img36);
         mo.setBorderPainted(false);
         mo.setOpaque(true);
         mo.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("mo");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(mo);
        
        img37 = new ImageIcon(new ImageIcon("ojo.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         ojo = new JButton();
         ojo.setBounds(50, 50, 100, 100);
         ojo.setIcon(img37);
         ojo.setBorderPainted(false);
         ojo.setOpaque(true);
         ojo.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("ojo");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(ojo);
        
        img38 = new ImageIcon(new ImageIcon("ro.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         ro = new JButton();
         ro.setBounds(50, 50, 100, 100);
         ro.setIcon(img38);
         ro.setBorderPainted(false);
         ro.setOpaque(true);
         ro.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("ro");        
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(ro);
        
        img39 = new ImageIcon(new ImageIcon("lo.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         lo = new JButton();
         lo.setBounds(50, 50, 100, 100);
         lo.setIcon(img39);
         lo.setBorderPainted(false);
         lo.setOpaque(true);
         lo.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("lo");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(lo);
        
        img40 = new ImageIcon(new ImageIcon("sho.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         sho = new JButton();
         sho.setBounds(50, 50, 100, 100);
         sho.setIcon(img40);
         sho.setBorderPainted(false);
         sho.setOpaque(true);
         sho.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("sho");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(sho);
        
        img41 = new ImageIcon(new ImageIcon("ssho.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         ssho = new JButton();
         ssho.setBounds(50, 50, 100, 100);
         ssho.setIcon(img41);
         ssho.setBorderPainted(false);
         ssho.setOpaque(true);
         ssho.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("ssho");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(ssho);
        
        img42 = new ImageIcon(new ImageIcon("sssho.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         sssho = new JButton();
         sssho.setBounds(50, 50, 100, 100);
         sssho.setIcon(img42);
         sssho.setBorderPainted(false);
         sssho.setOpaque(true);
         sssho.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("sssho");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(sssho);
        
        img43 = new ImageIcon(new ImageIcon("ho.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         ho = new JButton();
         ho.setBounds(50, 50, 100, 100);
         ho.setIcon(img43);
         ho.setBorderPainted(false);
         ho.setOpaque(true);
         ho.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("ho");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(ho);
        
        img44 = new ImageIcon(new ImageIcon("rro.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         rro = new JButton();
         rro.setBounds(50, 50, 100, 100);
         rro.setIcon(img44);
         rro.setBorderPainted(false);
         rro.setOpaque(true);
         rro.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("rro");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(rro);
        
        img45 = new ImageIcon(new ImageIcon("rrro.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         rrro = new JButton();
         rrro.setBounds(50, 50, 100, 100);
         rrro.setIcon(img45);
         rrro.setBorderPainted(false);
         rrro.setOpaque(true);
         rrro.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("rrro");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(rrro);
        
        img46 = new ImageIcon(new ImageIcon("oyo.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         oyo = new JButton();
         oyo.setBounds(50, 50, 100, 100);
         oyo.setIcon(img46);
         oyo.setBorderPainted(false);
         oyo.setOpaque(true);
         oyo.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("oyo");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(oyo);
        
        img47 = new ImageIcon(new ImageIcon("khoto.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         khoto = new JButton();
         khoto.setBounds(50, 50, 100, 100);
         khoto.setIcon(img47);
         khoto.setBorderPainted(false);
         khoto.setOpaque(true);
         khoto.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("khoto");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(khoto);
        
        img48 = new ImageIcon(new ImageIcon("onu.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         onu = new JButton();
         onu.setBounds(50, 50, 100, 100);
         onu.setIcon(img48);
         onu.setBorderPainted(false);
         onu.setOpaque(true);
         onu.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("onu");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(onu);
        
        img49 = new ImageIcon(new ImageIcon("bindu.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         bindu = new JButton();
         bindu.setBounds(50, 50, 100, 100);
         bindu.setIcon(img49);
         bindu.setBorderPainted(false);
         bindu.setOpaque(true);
         bindu.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("bindu");
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(bindu);
        
        
        
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
            LearningTool.main.learnbJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.learn1JPanel);
            LearningTool.main.learn1JPanel.setVisible(true);
        });

    }
}
