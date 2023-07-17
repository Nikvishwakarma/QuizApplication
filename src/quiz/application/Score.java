
package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Score extends JFrame implements ActionListener {
     
       Score(String name,int score){
           setBounds(500,150,600,500);
        getContentPane().setBackground(Color. WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(this.getClass().getResource("score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
       image.setBounds(0,150,300,250);
       add(image); 
       
       JLabel heading = new JLabel("Thankyou " +name+ " for playing Simple Minds");
       heading.setBounds(45,30,600,30);
       heading.setFont(new Font("Tahoma",Font.PLAIN,22)); 
               add(heading);
               
                JLabel lblscore = new JLabel("Your score is " +score);
       lblscore.setBounds(350,150,180,30);
        lblscore.setForeground(Color.BLUE);
       lblscore.setFont(new Font("Viner hand ITC",Font.BOLD,22)); 
               add(lblscore);
               
            JButton submit = new JButton("Play Again");
         submit.setBounds(350,200,120,20);
         submit.setFont(new Font("Tahoma",Font.PLAIN,18));
         submit.setBackground(new Color(30,144,255));
         submit.setForeground(Color.WHITE); 
         submit.addActionListener(this); 
         add(submit);
         
               
               setVisible(true);
       }
       
       public void actionPerformed(ActionEvent ae){
           setVisible(false);
           new Login();
       }
    public static void main(String[] args){
        new Score("User",0);
    }
}
