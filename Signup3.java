package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6;
    JButton s, c;

    String formno;

    Signup3(String formno) {
        this.formno = formno;

        // Panel for scrolling
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(215, 252, 252));
        panel.setPreferredSize(new Dimension(850, 950));

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image1 = new JLabel(i3);
        image1.setBounds(100, 20, 100, 100);
        panel.add(image1);

        JLabel l1 = new JLabel("Page 3:");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(250, 70, 200, 40);
        panel.add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(250, 35, 300, 40);
        panel.add(l2);

        JLabel l3 = new JLabel("Account Type:");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100, 140, 200, 30);
        panel.add(l3);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBounds(100, 180, 200, 30);
        r1.setBackground(new Color(215, 252, 252));
        panel.add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBounds(400, 180, 250, 30);
        r2.setBackground(new Color(215, 252, 252));
        panel.add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBounds(100, 230, 200, 30);
        r3.setBackground(new Color(215, 252, 252));
        panel.add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBounds(400, 230, 280, 30);
        r4.setBackground(new Color(215, 252, 252));
        panel.add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4 = new JLabel("Card Number:");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(100, 300, 200, 30);
        panel.add(l4);

        JLabel l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Raleway", Font.BOLD, 12));
        l5.setBounds(100, 330, 220, 20);
        panel.add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raleway", Font.BOLD, 12));
        l6.setBounds(350, 300, 250, 30);
        panel.add(l6);

        JLabel l7 = new JLabel("(It would appear on ATM Card/Cheque Book and Statements)");
        l7.setFont(new Font("Raleway", Font.BOLD, 12));
        l7.setBounds(350, 330, 400, 20);
        panel.add(l7);

        JLabel l8 = new JLabel("PIN:");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(100, 380, 100, 30);
        panel.add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(350, 380, 100, 30);
        panel.add(l9);

        JLabel l10 = new JLabel("(4-digit Password)");
        l10.setFont(new Font("Raleway", Font.BOLD, 12));
        l10.setBounds(100, 410, 200, 20);
        panel.add(l10);

        JLabel l11 = new JLabel("Services Required:");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setBounds(100, 470, 250, 30);
        panel.add(l11);

        c1 = new JCheckBox("ATM Card");
        c1.setBounds(100, 510, 200, 30);
        c1.setBackground(new Color(215, 252, 252));
        panel.add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBounds(400, 510, 220, 30);
        c2.setBackground(new Color(215, 252, 252));
        panel.add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBounds(100, 550, 200, 30);
        c3.setBackground(new Color(215, 252, 252));
        panel.add(c3);

        c4 = new JCheckBox("Email Alerts");
        c4.setBounds(400, 550, 200, 30);
        c4.setBackground(new Color(215, 252, 252));
        panel.add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBounds(100, 590, 200, 30);
        c5.setBackground(new Color(215, 252, 252));
        panel.add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBounds(400, 590, 200, 30);
        c6.setBackground(new Color(215, 252, 252));
        panel.add(c6);

        JCheckBox c7 = new JCheckBox(
                "I hereby declare that the above entered details are correct to the best of my knowledge.",
                true);
        c7.setBounds(100, 640, 650, 20);
        c7.setBackground(new Color(215, 252, 252));
        panel.add(c7);

        JLabel l12 = new JLabel("Form No:");
        l12.setBounds(620, 30, 120, 14);
        panel.add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setBounds(730, 30, 100, 14);
        panel.add(l13);

        s = new JButton("Submit");
        s.setFont(new Font("Raleway",Font.BOLD,14));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.setBounds(240, 700, 120, 35);
        s.addActionListener(this);
        panel.add(s);

        c = new JButton("Cancel");
        c.setFont(new Font("Raleway",Font.BOLD,14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setBounds(400, 700, 120, 35);
        c.addActionListener(this);
        panel.add(c);

        // Scroll pane
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        setContentPane(scrollPane);

        setSize(850, 820);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype=null;
        if(r1.isSelected()){
            atype="Saving Account";
        }else if(r2.isSelected()){
            atype="Fixed Deposit Account";
        }else if(r3.isSelected()){
            atype="Current Account";
        }else if(r4.isSelected()){
            atype="Recurring Deposit Account";
        }
        Random ran=new Random();
        long first7=(ran.nextLong()%90000000L)+1409963000000000L;
        String cardno=""+Math.abs(first7);

        long first3=(ran.nextLong()%9000L)+1000L;
        String pin=""+Math.abs(first3);

        String fac="";
        if(c1.isSelected()){
            fac+="ATM Card";//kyuki  checkbox hain isliye user bohot saare bhi select kr sakta hai isliye '+' kr rhe hain
        }else if(c2.isSelected()){
            fac+="Internet Banking";
        }else if(c3.isSelected()){
            fac+="Mobile Banking";
        } else if (c4.isSelected()) {
            fac+="Email Alerts";
        } else if (c5.isSelected()) {
            fac+="Cheque Book";
        } else if (c6.isSelected()) {
            fac+="E-Statement";
        }

        try{
            if(e.getSource()==s){
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                }else{
                    Con c1=new Con();
                    String q1="insert into signup3 values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2="insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\n Pin : "+pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource()==c) {
                System.exit(0);
            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup3(" ");
    }
}