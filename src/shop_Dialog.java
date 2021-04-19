import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;

/**
 * Created by lenovo on 09/12/2020.
 */
    public class shop_Dialog extends JDialog implements ActionListener {

    private JButton ok;
    private JButton cancel;
    private JTextField number;
    private JTextField cost;
    private JTextField tittle;
    private JTextField auther;
    private JTextField type;
    private Book thebook;
    private JTextField theAge2;

    public shop_Dialog(String sTitle, JFrame owner) {
            super(owner, sTitle, true);
            this.setLayout(new FlowLayout());
            this.setBounds(360, 180, 550, 200);
            this.add(new JLabel("Enter number:"));
            this.number = new JTextField(25);
            this.add(this.number);
            this.add(new JLabel("Enter cost:"));
            this.cost = new JTextField(25);
            this.add(this.cost);
            this.add(new JLabel("Enter tittle:"));
            this.tittle = new JTextField(25);
            this.add(this.tittle);
            this.add(new JLabel("Enter Auther:"));
            this.auther = new JTextField(25);
            this.add(this.auther);
            this.add(new JLabel("Enter 1 fiction or 2 non fiction :\t\t"));
            this.type = new JTextField(30);
            this.add(this.type);
            this.ok = new JButton("OK");
            this.ok.addActionListener(this);
            this.add(this.ok);
            this.cancel = new JButton("Cancel");
            this.cancel.addActionListener(this);
            this.add(this.cancel);
        }

        public Book getbook() {
            return this.thebook;
        }

        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == this.ok) {
                int theAge = Integer.parseInt(this.number.getText());
                int theAge1 = Integer.parseInt(this.type.getText());
                double theAge2 = (double)Integer.parseInt(this.cost.getText());
                this.thebook = new Book(theAge, theAge2, this.tittle.getText(), this.auther.getText(), theAge1);
            } else if(e.getSource() == this.cancel) {
                this.thebook = null;
            }

            this.dispose();
        }
    }
