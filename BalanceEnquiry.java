package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {
    String pin;
    JLabel label2;
    JButton b1;
    BalanceEnquiry(String pin){
        this.pin=pin;
        setLayout(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        ImageIcon i1 = new ImageIcon(
                ClassLoader.getSystemResource("icon/atm2.png")
        );
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Insets insets = Toolkit.getDefaultToolkit()
                .getScreenInsets(getGraphicsConfiguration());
        int width = screenSize.width;
        int height = screenSize.height - insets.bottom-40;
        Image i2 = i1.getImage().getScaledInstance(
                width,
                height,
                Image.SCALE_SMOOTH
        );
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, width, height);
        add(l3);

        JLabel label1=new JLabel("YOUR CURRENT BALANCE IS RS. ");
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(390,160,700,35);
        label1.setForeground(Color.WHITE);
        l3.add(label1);

        label2=new JLabel();
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(390,200,700,35);
        label2.setForeground(Color.WHITE);
        l3.add(label2);

        b1=new JButton("BACK");
        b1.setBounds(630,340,120,35);
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(65,125,128));
        b1.addActionListener(this);
        l3.add(b1);

        int balance=0;
        try{
            Con c=new Con();
            ResultSet resultSet=c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            while (resultSet.next()){
                if(resultSet.getString("type").equals("Deposit")){
                    balance+=Integer.parseInt(resultSet.getString("amount"));

                }else{
                    balance-=Integer.parseInt(resultSet.getString("amount"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        label2.setText(""+balance);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new main_Class(pin);
    }

    public static void main(String[] args){
        new BalanceEnquiry("");
    }
}
