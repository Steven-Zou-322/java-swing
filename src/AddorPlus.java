import java.awt.*;
import java.awt.event.*;
import java.math.BigInteger;
import javax.swing.*;
public class AddorPlus extends JFrame{
    JTextArea text1,text2;
    JButton bt1,bt2;
    JLabel label;
    AddorPlus(){
        text1=new JTextArea(2,4);
        text2=new JTextArea(2,4);
        bt1=new JButton("+");
        bt2=new JButton("*");
        label=new JLabel();
        JSplitPane p1;
        JPanel p2=new JPanel();
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n1=text1.getText();
                String n2=text2.getText();
                try {
                    BigInteger num1=new BigInteger(n1);
                    BigInteger num2=new BigInteger(n2);
                    label.setText((num1.add(num2)).toString());
                }catch (Exception ee) {
                    label.setText("请输入整数");
                    text1.setText(null);
                    text2.setText(null);
                }
            }
        });
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n1=text1.getText();
                String n2=text2.getText();
                try {
                    BigInteger num1=new BigInteger(n1);
                    BigInteger num2=new BigInteger(n2);
                    label.setText((num1.multiply(num2)).toString());
                }catch (Exception ee) {
                    label.setText("请输入整数");
                    text1.setText(null);
                    text2.setText(null);
                }
            }
        });
        setLayout(new GridLayout(3,1));
        p1=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,text1,text2);
        p1.setDividerLocation(117);
        add(p1);
        p2.setLayout(new GridLayout(1,2));
        p2.add(bt1);
        p2.add(bt2);
        add(p2);
        add(label);
        setBounds(200,200,300,200);
        setVisible(true);
        validate();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
 
}
