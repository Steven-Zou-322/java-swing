import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
 
public class Library extends JFrame{
    Library(){
        setTitle("图书馆办理");
        JLabel label0=new JLabel("图书证注册");
        JLabel label1=new JLabel("姓名：");
        JLabel label2=new JLabel("性别：");
        JLabel label3=new JLabel("身份：");
        JLabel label4=new JLabel("单位：");
        JLabel label5=new JLabel("证件号码：");
        JLabel label6=new JLabel("注册日期：");
        JLabel label7=new JLabel("有效日期：");
        JTextField ja1=new JTextField();
        JTextArea ja2=new JTextArea(1,1);
        JTextArea ja3=new JTextArea(1,1);
        JTextArea ja4=new JTextArea(1,1);
        JComboBox jm1=new JComboBox();
        JComboBox jm2=new JComboBox();
        JComboBox jm3=new JComboBox();
 
        jm1.addItem("男");
        jm1.addItem("女");
        jm2.addItem("学生");
        jm2.addItem("老师");
        jm3.addItem("计算机系");
        jm3.addItem("英语系");
        jm3.addItem("国交系");
        JPanel jp1=new JPanel();
        JPanel jp2=new JPanel();
 
        JButton jb1=new JButton("添加");
        JButton jb2=new JButton("删除");
        JButton jb3=new JButton("撤销");
        JButton jb4=new JButton("退出");
        Box basebox,box1,box2;
 
        //上部
        jp1.add(label0);
 
        //中部
        box1=Box.createVerticalBox();
        box1.add(label1);
        box1.add(Box.createVerticalStrut(15));
        box1.add(label2);
        box1.add(Box.createVerticalStrut(15));
        box1.add(label3);
        box1.add(Box.createVerticalStrut(15));
        box1.add(label4);
        box1.add(Box.createVerticalStrut(15));
        box1.add(label5);
        box1.add(Box.createVerticalStrut(15));
        box1.add(label6);
        box1.add(Box.createVerticalStrut(15));
        box1.add(label7);
        box2=Box.createVerticalBox();
        box2.add(ja1);
        box2.add(Box.createVerticalStrut(8));
        box2.add(jm1);
        box2.add(Box.createVerticalStrut(8));
        box2.add(jm2);
        box2.add(Box.createVerticalStrut(8));
        box2.add(jm3);
        box2.add(Box.createVerticalStrut(8));
        box2.add(ja2);
        box2.add(Box.createVerticalStrut(8));
        box2.add(ja3);
        box2.add(Box.createVerticalStrut(8));
        box2.add(ja4);
        basebox=Box.createHorizontalBox();
        basebox.add(box1);
        basebox.add(Box.createHorizontalStrut(200));
        basebox.add(box2);
 
     
        jp2.add(jb1);
        jp2.add(jb2);
        jp2.add(jb3);
        jp2.add(jb4);
 
        setLayout(new BorderLayout());
        add(jp1,BorderLayout.NORTH);
 
        add(basebox);
        add(jp2,BorderLayout.SOUTH);
        setBounds(600,600,500,400);
        setVisible(true);
        validate();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
