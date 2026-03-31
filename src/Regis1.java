import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Regis1 extends JFrame {
    private JTextPane byUsingThisSystemTextPane;
    private JCheckBox YesBox;
    private JCheckBox NoBox;
    private JButton Pro;
    private JPanel RegPanel;
    public Regis1() {
        setTitle("Loan System Agreement");
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(RegPanel);
        setLocationRelativeTo(null);

        Pro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (YesBox.isSelected()) {
                    new Dash2().setVisible(true);
                    dispose();

                } else if (NoBox.isSelected()) {
                    JOptionPane.showMessageDialog(null,
                            "Thank you for visiting Loan System");
                    dispose();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Please select Yes or No first.");
                }
            }

        });

    }

  public  static void main(String[] args) {
        new Regis1().setVisible(true);

    }
    }