package be.david.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by stannisbaratheon on 07/07/16.
 */
public class MyFrame extends JFrame {

    public MyFrame() throws HeadlessException {
        setTitle("");
        JPanel pane = new JPanel();
        pane.setLayout(new FlowLayout());

        JButton b = new JButton("Click ME");


        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MyFrame.this,"This button has been clicked");
            }
        });

        pane.add(b);

        setSize(640,480);

        setContentPane(pane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


    }
}
