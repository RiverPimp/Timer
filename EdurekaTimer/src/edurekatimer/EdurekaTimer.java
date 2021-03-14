package edurekatimer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;




public class EdurekaTimer implements ActionListener{
    
    static JTextField timerText;
    static int textCount = 0;
    
    public EdurekaTimer(){
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);

        panel.setLayout(null);

        JLabel label = new JLabel("Time (in seconds)");
        label.setBounds(30, 20, 165, 25);
        panel.add(label);

        timerText = new JTextField(20);
        timerText.setEditable(false);
        timerText.setBounds(150, 20, 100, 25);
        panel.add(timerText);

        JButton buttonStart = new JButton("Start Timer");
        buttonStart.setBounds(40, 50, 100, 25);
        panel.add(buttonStart);
        buttonStart.addActionListener(this);

        JButton buttonStop = new JButton("Stop Timer");
        buttonStop.setBounds(145, 50, 100, 25);
        panel.add(buttonStop);

        frame.setVisible(true);
    }
    


    public static void main(String[] args) {


        new EdurekaTimer();
        

        
        
        

        ThreadT threadT = new ThreadT();
        Thread threadTimer = new Thread();
        threadTimer.start();
        try {
            threadTimer.join();
            textCount = threadT.getCount();
        } catch (InterruptedException ex) {
            System.out.println("Tread retrieval broke");
        }
        
        


        //threadTimer.start();


    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        timerText.setText(""+textCount);
    }

}
