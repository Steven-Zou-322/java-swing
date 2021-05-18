//package 简单数字对应窗体;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Compare extends JFrame{
    JTextField text;
    JLabel label;
    Compare(){
        setTitle("Number change");
        text=new JTextField(10);
        label=new JLabel();
        label.setText("输入数字");
        text.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            String getstr=text.getText();    
            String showstr=null;
            switch (getstr) {
                case "0":
                    showstr="zero";
                    break;
                case "1":
                    showstr="one";
                    break;
                case "2":
                    showstr="two";
                    break;
                case "3":
                    showstr="three";
                    break;
                case "4":
                    showstr="four";
                    break;
                case "5":
                    showstr="five";
                    break;
                case "6":
                    showstr="six";
                    break;
                case "7":
                    showstr="seven";
                    break;
                case "8":
                    showstr="eight";
                    break;
                case "9":
                    showstr="nine";
                    break;
                default:
                    showstr=("输入数字");
                    break;
                }
            label.setText(showstr);
            text.setText(null);
            }
        });
        setLayout(new FlowLayout());
        add(text);
        add(label);
        setBounds(200,200,400,200);
        setVisible(true);
        validate();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);;    
    }
}
// 实现类（注：以下省略实现类--实例化自定义窗体）

//package 简单数字对应窗体;
