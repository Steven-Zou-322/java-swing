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
        setTitle("ͼ��ݰ���");
        JLabel label0=new JLabel("ͼ��֤ע��");
        JLabel label1=new JLabel("������");
        JLabel label2=new JLabel("�Ա�");
        JLabel label3=new JLabel("��ݣ�");
        JLabel label4=new JLabel("��λ��");
        JLabel label5=new JLabel("֤�����룺");
        JLabel label6=new JLabel("ע�����ڣ�");
        JLabel label7=new JLabel("��Ч���ڣ�");
        JTextField ja1=new JTextField();
        JTextArea ja2=new JTextArea(1,1);
        JTextArea ja3=new JTextArea(1,1);
        JTextArea ja4=new JTextArea(1,1);
        JComboBox jm1=new JComboBox();
        JComboBox jm2=new JComboBox();
        JComboBox jm3=new JComboBox();
 
        jm1.addItem("��");
        jm1.addItem("Ů");
        jm2.addItem("ѧ��");
        jm2.addItem("��ʦ");
        jm3.addItem("�����ϵ");
        jm3.addItem("Ӣ��ϵ");
        jm3.addItem("����ϵ");
        JPanel jp1=new JPanel();
        JPanel jp2=new JPanel();
 
        JButton jb1=new JButton("���");
        JButton jb2=new JButton("ɾ��");
        JButton jb3=new JButton("����");
        JButton jb4=new JButton("�˳�");
        Box basebox,box1,box2;
 
        //�ϲ�
        jp1.add(label0);
 
        //�в�
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
