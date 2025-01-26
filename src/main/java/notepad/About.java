package notepad;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class About extends JFrame implements ActionListener{

    About(){
        setBounds(400, 100, 600, 500);
        setLayout(null);

        ImageIcon il = new ImageIcon(getClass().getResource("/icons/windows.png"));
        Image i2 = il.getImage().getScaledInstance(300, 60, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel headerIcon = new JLabel(i3);
        headerIcon.setBounds(70, 40, 400, 80);
        add(headerIcon);

        ImageIcon i4 = new ImageIcon(getClass().getResource("/icons/notes.png"));
        Image i5 = i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel Icon = new JLabel(i6);
        Icon.setBounds(50, 180, 70, 70);
        add(Icon);

        JLabel text = new JLabel( "<html> NotePad Clone <br> Version 0.1.0 (OS Build Java) <br> Code for Interview. All rights reserved </html>");
        text.setBounds(140, 180, 500, 70);
        text.setFont(new Font("SAN SERIF", Font.PLAIN, 16));
        add(text);

        JButton b1 = new JButton("OK");
        b1.setBounds(150, 350, 120, 25);
        b1.addActionListener(this);
        add(b1);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }
    
    // public static void main(String[] args){
    //     new About();
    // }
    
}
