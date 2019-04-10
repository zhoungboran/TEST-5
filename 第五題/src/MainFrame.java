import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JButton jbt=new JButton("評定");
    private JButton jbt1=new JButton("EXIT");
    private JLabel jbt2=new JLabel("成績");
    private TextField tf=new TextField();
    private JLabel jbt3=new JLabel("");
    private Container cp;
    public MainFrame(){Init();}
    private void Init(){
        cp=this.getContentPane();
        cp.setLayout(null);
        this.setSize(600,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jbt.setBounds(250,250,80,20);
        jbt1.setBounds(400,250,80,20);
        jbt2.setBounds(250,200,80,20);
        tf.setBounds(350,200,80,20);
        jbt3.setBounds(430,200,80,20);

        jbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int v1=Math.round(Float.parseFloat(tf.getText()));
                if (90<=v1&&v1<=100){
                    jbt3.setText("A");
                }else if (80<=v1&&v1<=89){
                    jbt3.setText("B");
                }else if (70<=v1&&v1<=79){
                    jbt3.setText("C");
                }else if (60<=v1&&v1<=69){
                    jbt3.setText("D");
                }else {
                    jbt3.setText("E");
                }

            }
        });
        jbt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        cp.add(jbt);
        cp.add(jbt1);
        cp.add(jbt2);
        cp.add(tf);
        cp.add(jbt3);
    }
    }

