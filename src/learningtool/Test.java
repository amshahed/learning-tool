
package learningtool;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class Test extends JPanel{
    
    JButton shoreo, shorea, shorte, longe, shortu, longu, hrii, ae, oii, oo, oou;
    JButton ko,kho,go,gho,umo,cho,chho,jo,jho,neo,tto,ttho,ddo,ddho,mono,to,tho,doo,dho,no;
    JButton po,pho,bo,bho,mo,ojo,ro,lo,sho,ssho,sssho,ho,rro,rrro,oyo,khoto,onu,bindu;

    ImageIcon img, img1, img2, img3, img4, img5,img6;
    ImageIcon img7, img8, img9, img10, img11;
    ImageIcon img12,img13,img14,img15,img16,img17,img18,img19,img20,img21,img22,img23;
    ImageIcon img24,img25,img26,img27,img28,img29,img30,img31,img32,img33,img34,img35;
    ImageIcon img36,img37,img38,img39,img40,img41,img42,img43,img44,img45,img46,img47,img48,img49;

    JButton goback;

    public Test() {
        super(new BorderLayout());
        /*Initialize Components*/
        goback = new JButton("Go Back");
        goback.setBounds(50, 100, 95, 30);
       
        img = new ImageIcon(new ImageIcon("shoreo.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        shoreo = new JButton();
        shoreo.setBounds(50, 50, 100, 100);
        shoreo.setIcon(img);
        shoreo.setBorderPainted(false);
        shoreo.setOpaque(true);
        shoreo.addActionListener((ActionEvent ae) -> {
            LearningTool.main.match1JPanel = new Match1("shoreo");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
           LearningTool.main.match1JPanel = new Match1("shorea");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("shorte");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("longe");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
           LearningTool.main.match1JPanel = new Match1("shortu");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
           LearningTool.main.match1JPanel = new Match1("longu");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("hrii");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
           LearningTool.main.match1JPanel = new Match1("ae");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
           LearningTool.main.match1JPanel = new Match1("oii");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
           LearningTool.main.match1JPanel = new Match1("oo");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("oou");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
        });

        /*Adding Components*/
        add(oou);

        img12 = new ImageIcon(new ImageIcon("ko.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         ko = new JButton();
         ko.setBounds(50, 50, 100, 100);
         ko.setIcon(img12);
         ko.setBorderPainted(false);
         ko.setOpaque(true);
         ko.addActionListener((ActionEvent ae) -> {
            LearningTool.main.match1JPanel = new Match1("ko");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("kho");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("go");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
             LearningTool.main.match1JPanel = new Match1("gho");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("umo");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("cho");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("chho");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("jo");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("jho");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("neo");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("tto");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("ttho");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("ddo");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("ddho");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("mono");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("to");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("tho");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("doo");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(doo);
        
        img30 = new ImageIcon(new ImageIcon("dho.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         dho = new JButton();
         dho.setBounds(50, 50, 100, 100);
         dho.setIcon(img28);
         dho.setBorderPainted(false);
         dho.setOpaque(true);
         dho.addActionListener((ActionEvent ae) -> {
            LearningTool.main.match1JPanel = new Match1("dho");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("no");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
        });
         
        
        add(no);
        
        img32 = new ImageIcon(new ImageIcon("po.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         po = new JButton();
         po.setBounds(50, 50, 100, 100);
         po.setIcon(img32);
         po.setBorderPainted(false);
         po.setOpaque(true);
         po.addActionListener((ActionEvent ae) -> {
            LearningTool.main.match1JPanel = new Match1("po");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("pho");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("bo");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("bho");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("mo");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("ojo");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("ro");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("lo");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("sho");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
             LearningTool.main.match1JPanel = new Match1("ssho");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("sssho");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("ho");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("rro");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("rrro");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
           LearningTool.main.match1JPanel = new Match1("oyo");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("khoto");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("onu");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
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
            LearningTool.main.match1JPanel = new Match1("bindu");
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.match1JPanel);
            LearningTool.main.match1JPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(bindu);
        
        
        
        
        //goback.setLocation(0,0);
        add(goback, BorderLayout.SOUTH);

        /* Setting Layout JPanel*/
        //setLayout(null);
        setLocation(0, 0);
        setVisible(true);
        setSize(600, 500);
        setLayout(new FlowLayout());
        setBackground(Color.decode("#DBEA97"));

        goback.addActionListener((ActionEvent e) -> {
            LearningTool.main.testJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.test1JPanel);
            LearningTool.main.test1JPanel.setVisible(true);
        });

    }
}
