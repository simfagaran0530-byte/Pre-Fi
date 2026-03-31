import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Loan3 extends JFrame {
    private JTextField BN;
    private JTextField PA;
    private JTextField IR;
    private JTextField SD;
    private JTextField DD;
    private JTextField PT;
    private JButton Tobut;
    private JLabel Nadula;
    private JPanel LoanPanel;


    double interest;
    double total;
    double penalty;

    public Loan3() {
        setTitle("Loan Entry Form");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(LoanPanel);
        setVisible(true);

        Tobut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TotalLoan();

                String bn = BN.getText();
                String pa = PA.getText();
                String sd = SD.getText();
                String dd = DD.getText();


                JOptionPane.showMessageDialog(Loan3.this,
                 "Borrower Name: " + bn +
                         "\nPrincipal Amount: " + pa +
                         "\nInterest: " + interest +
                         "\nPenalty: " + penalty +
                         "\nStart Date: " + sd +
                         "\nDue Date: " + dd);

                        
             }
        });
    }

    void TotalLoan() {
        try {
            double pra = Double.parseDouble(PA.getText());
            double inr = Double.parseDouble(IR.getText());

            LocalDate startDate = LocalDate.parse(SD.getText());
            LocalDate dueDate = LocalDate.parse(DD.getText());

            long days = ChronoUnit.DAYS.between(startDate, dueDate);

            interest = pra * inr * (days / 365.0);
            total = pra + interest;

            penalty = 0;

            if (LocalDate.now().isAfter(dueDate)) {
                penalty = total * 0.05;
            }

            PT.setText(String.valueOf(penalty));
            Nadula.setText(String.valueOf(total));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Invalid Input! Use format YYYY-MM-DD");
            Nadula.setText("Error");
        }
    }

    public static void main(String[] args) {
        new Loan3();
    }
}