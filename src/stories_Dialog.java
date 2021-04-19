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
public class stories_Dialog extends JDialog implements ActionListener {
        private JButton ok;
        private JButton cancel;
        private JTextField number;
        private JTextField cost;
        private JTextField tittle;
        private JTextField artist;
        private JTextField genre;
        private stories thestores;


        public stories_Dialog(String sTitle, shop_Frame owner) {
            super(owner, sTitle, true);
            this.setLayout(new FlowLayout());
            this.setBounds(360, 180, 450, 200);
            this.add(new JLabel("Enter number:"));
            this.number = new JTextField(25);
            this.add(this.number);
            this.add(new JLabel("Enter cost:"));
            this.cost = new JTextField(25);
            this.add(this.cost);
            this.add(new JLabel("Enter tittle:"));
            this.tittle = new JTextField(25);
            this.add(this.tittle);
            this.add(new JLabel("Enter Artist:"));
            this.artist = new JTextField(25);
            this.add(this.artist);
            this.add(new JLabel("Enter  brorow Book"));
            this.genre = new JTextField(20);
            this.add(this.genre);
            this.ok = new JButton("OK");
            this.ok.addActionListener(this);
            this.add(this.ok);
            this.cancel = new JButton("Cancel");
            this.cancel.addActionListener(this);
            this.add(this.cancel);
        }

        public stories getstores() {
            return this.thestores;
        }

        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == this.ok) {
                int theAge = Integer.parseInt(this.number.getText());
                int theAge1 = Integer.parseInt(this.genre.getText());
                double theAge2 = (double)Integer.parseInt(this.cost.getText());
                this.thestores = new stories(theAge, theAge2, this.tittle.getText(), this.artist.getText(), theAge1);
            } else if(e.getSource() == this.cancel) {
                this.thestores = null;
            }

            this.dispose();
        }
    }


