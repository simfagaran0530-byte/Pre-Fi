import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dash2 extends JFrame{
    private JButton LoanBut;
    private JButton Exit;
    private JPanel DashPanel;

    public Dash2() {
        setTitle("Loan Management Dashboard");
        setSize(260, 250 );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(DashPanel);
        setLocationRelativeTo(null);

        LoanBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Loan3().setVisible(true);

            }
        });

        Exit.addActionListener(e -> System.exit(0));
    }
}