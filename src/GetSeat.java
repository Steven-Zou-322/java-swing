import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
//import javax.swing.*;
import javax.swing.*;
public class GetSeat extends JFrame implements ActionListener{
    GetSeat(){
        JButton jb0=new JButton("��λ0");
        JButton jb1=new JButton("��λ1");
        JButton jb2=new JButton("��λ2");
        JButton jb3=new JButton("��λ3");
        JButton jb4=new JButton("��λ4");
        JButton jb5=new JButton("��λ5");
        jb0.addActionListener(this);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
        jb5.addActionListener(this);
        JLabel label=new JLabel("��̨",JLabel.CENTER);
        JPanel jp=new JPanel();
        jp.setLayout(new GridLayout(2,3));
        jp.add(jb0);
        jp.add(jb1);
        jp.add(jb2);
        jp.add(jb3);
        jp.add(jb4);
        jp.add(jb5);
        add(jp,BorderLayout.CENTER);
        add(label,BorderLayout.NORTH);
        
        //setBounds(100,100,400,200);
        setBounds(100,100,400,200);
        setVisible(true);
        validate();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand() + "��ѡ��");
    }
}