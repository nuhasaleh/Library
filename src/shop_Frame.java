
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
/**
 * Created by lenovo on 09/12/2020.
 */
    public class shop_Frame extends JFrame implements ActionListener {
        private JButton listnovels;
        private JButton liststoreis;
        private JButton listbook;
        private JButton addnovels;
        private JButton addstories;
        private JButton addBook;
        private JTextArea ShopArea;
        private JLabel aabel;
        private shop rovers = new shop (20, 30, 20);
        private Object liststories;

        public shop_Frame() {
            this.setTitle("Librery");
            this.setBounds(0, 1, 600, 400);
            this.getContentPane().setLayout(new FlowLayout(1));
            this.aabel = new JLabel(" Our  Librarys                 ");
            this.listnovels= new JButton(" " +
                    "Display Novels ");
            this.listnovels.addActionListener(this);
            this.addnovels= new JButton("" +
                    "Add Novels");
            this.addnovels.addActionListener(this);
            this.addstories = new JButton("" +
                    "Add stories");
            this.addstories.addActionListener(this);
            this.addBook = new JButton(" " +
                    "Add Book          \n\t");
            this.addBook.addActionListener(this);
            this.liststoreis = new JButton("Display Stories");
            this.liststoreis.addActionListener(this);
            this.listbook = new JButton("Display Books");
            this.listbook.addActionListener(this);
            this.addnovels.setForeground(Color.black);
            this.addnovels.setBackground(Color.white);
            this.addstories.setForeground(Color.black);
            this.addstories.setBackground(Color.white);
            this.addBook.setForeground(Color.black);
            this.addBook.setBackground(Color.white);
            this.listbook.setForeground(Color.black);
            this.listbook.setBackground(Color.white);
            this.liststoreis.setForeground(Color.black);
            this.liststoreis.setBackground(Color.white);
            this.listnovels.setForeground(Color.black);
            this.listnovels.setBackground(Color.white);
            this.setBounds (360, 170, 600, 900);
            Font newFont = new Font ("Serif", 3, 36);
            JPanel s4 = new JPanel ();
            JPanel s = new JPanel ();
            JPanel s1 = new JPanel ();
            JPanel s2 = new JPanel ();
            new JPanel ();
            s1.setBackground (Color.black);
            s.setBackground (Color.black);
            s4.add (this.aabel);
            s.add (this.listbook);
            s.add (this.liststoreis);
            s.add (this.listnovels);
            s1.add (this.addBook);
            s1.add (this.addstories);
            s1.add (this.addnovels);
            this.aabel.setFont (newFont);
            this.getContentPane ().add (s4);
            this.getContentPane ().add (s1);
            this.getContentPane ().add (s2);
            this.getContentPane ().add (s);
            JPanel n = new JPanel ();
            this.ShopArea = new JTextArea ("\t\tChoose Button\n\t\t\t\t\t\n\n\n\n\n\n");
            JScrollPane a = new JScrollPane (this.ShopArea);
            n.add (a);
            this.getContentPane ().add ("Center", n);
            this.setDefaultCloseOperation (3);
            this.setVisible (true);
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getSource () == this.listnovels) {
                this.rovers.listNovels (this.ShopArea);
            } else if (e.getSource () == this.listbook) {
                this.rovers.listbook (this.ShopArea);
            } else if (e.getSource () == this.liststories) {
                this.rovers.listShop (this.ShopArea);
            } else {
                if (e.getSource() == this.addBook) {
                    shop_Dialog go1 = new shop_Dialog( "Add a new Player  Dialog", this );
                    go1.setVisible( true );
                    Book play1 = go1.getbook();
                    if (play1 != null) {
                        this.ShopArea.setText( play1.toString() );
                        this.rovers.addbook( play1 );
                        this.ShopArea.setText( "Book added" );
                    } else {
                        this.ShopArea.setText( "Book not added" );
                    }
                } else
                    if (e.getSource() == this.addstories) {
                    stories_Dialog go11 = new stories_Dialog( "Add a new Player  Dialog", this );
                    go11.setVisible( true );
                    stories play11 = go11.getstores();
                    if (play11 != null) {
                        this.ShopArea.setText( play11.toString() );
                        this.rovers.addstories( play11 );
                        this.ShopArea.setText( "stories added" );
                    } else {
                        this.ShopArea.setText( "Stories not added" );
                    }
                } else if (e.getSource() == this.addnovels) {
                    Novels_Dialog go12 = new Novels_Dialog( "Add a new Player  Dialog", this );
                    go12.setVisible( true );
                    Novels play12 = go12.getNov();
                    if (play12 != null) {
                        this.ShopArea.setText( play12.toString() );
                        this.rovers.addNovels( play12 );
                        this.ShopArea.setText( "Novels added" );
                    } else {
                        this.ShopArea.setText( "Novels not added" );
                    }
                }
            }

        }
}
