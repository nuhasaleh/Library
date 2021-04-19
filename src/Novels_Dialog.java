import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

    /**
     * Created by lenovo on 09/12/2020.
     */
    public class Novels_Dialog extends JDialog implements ActionListener {
        private JButton ok;
        private JButton cancel;
        private JTextField number;
        private JTextField cost;
        private JTextField tittle;
        private JTextField type;
        private JTextField category;
        private JTextField details_books;
        private Novels theNov;

        public Novels_Dialog(String sTitle, shop_Frame owner) {
            super(owner, sTitle, true);
            this.setLayout(new FlowLayout());
            this.setBounds(360, 180, 450, 230);
            this.add(new JLabel("Enter number:"));
            this.number = new JTextField(25);
            this.add(this.number);
            this.add(new JLabel("Enter cost:"));
            this.cost = new JTextField(25);
            this.add(this.cost);
            this.add(new JLabel("Enter tittle:"));
            this.tittle = new JTextField(25);
            this.add(this.tittle);
            this.add(new JLabel("Enter type:"));
            this.type = new JTextField(25);
            this.add(this.type);
            this.add(new JLabel("Enter Details_books:"));
            this.details_books = new JTextField(23);
            this.add(this.details_books);
            this.add(new JLabel("Enter Category:"));
            this.category = new JTextField(22);
            this.add(this.category);
            this.ok = new JButton("OK");
            this.ok.addActionListener(this);
            this.add(this.ok);
            this.cancel = new JButton("Cancel");
            this.cancel.addActionListener(this);
            this.add(this.cancel);
        }

        public Novels getNov() {
            return this.theNov;
        }

        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == this.ok) {
                int theAge = Integer.parseInt(this.number.getText());
                double theAge2 = (double)Integer.parseInt(this.cost.getText());
                this.theNov = new Novels(theAge, theAge2, this.tittle.getText(), this.type.getText(), this.details_books.getText(), this.category.getText());
            } else if(e.getSource() == this.cancel) {
                this.theNov = null;
            }

            this.dispose();
        }


    }
