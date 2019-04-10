import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JButton jbt=new JButton("Add");
    private JButton jbt1=new JButton("Sub");
    private JLabel jbt2=new JLabel("");
    private Container cp;
    private int count=0;
    private JLabel jlb= new JLabel();
    public MainFrame(){Init();}
    private void Init(){
        cp=this.getContentPane();
        cp.setLayout(null);
        this.setSize(600,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jbt.setBounds(220,250,80,25);
        jbt1.setBounds(300,250,80,25);
        jbt2.setBounds(260,225,80,25);
        jbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                MainFrame.this.jbt2.setText(Integer.toString(count));
            }
        });
        jbt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                MainFrame.this.jbt2.setText(Integer.toString(count));
            }
        });
        cp.add(jbt);
        cp.add(jbt1);
        cp.add(jbt2);
    }
}
