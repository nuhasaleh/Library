/**
 * Created by lenovo on 09/12/2020.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JTextArea;

public class shop {
    private LinkedList<Item> theprodects;
    private int numbook;
    private int numnNovels;
    private int numstories;
    private int maxbook;
    private int maxNovels;
    private int maxstories;

    public shop(int bmax, int nmax, int smax) {
        this.maxbook = bmax;
        this.maxNovels = nmax;
        this.maxstories = smax;
        this.numbook = 0;
        this.numnNovels = 0;
        this.numstories = 0;
        this.theprodects = new LinkedList<>();
    }

    public boolean addbook(Book newbook) {
        if(this.numbook >= this.maxbook && this.numbook <= 0) {
            return false;
        } else {
            this.theprodects.add(newbook);
            ++this.numbook;
            return true;
        }
    }

    public boolean addstories(stories newstores) {
        if(this.numstories >= this.maxstories && this.numstories <= 0) {
            return false;
        } else {
            this.theprodects.add(newstores);
            ++this.numstories;
            return true;
        }
    }

    public boolean addNovels(Novels newNovels) {
        if(this.numnNovels >= this.maxNovels && this.numnNovels <= 0) {
            return false;
        } else {
            this.theprodects.add(newNovels);
            ++this.numnNovels;
            return true;
        }
    }

    public void listbook(JTextArea g) {
        g.setText("\t\t**The Book** \t \n");

        for(int i = 0; i < this.theprodects.size(); ++i) {
            if(this.theprodects.get(i) instanceof Book) {
                Book bo = (Book)this.theprodects.get(i);
                g.append(bo.displaybook1());
            }
        }

    }

    public void listShop(JTextArea n) {
        n.setText("\t\tThe shop \t\n ");

        for(int i = 0; i < this.theprodects.size(); ++i) {
            if(this.theprodects.get(i) instanceof stories) {
                stories stories = (stories) this.theprodects.get(i);
                System.out.print(stories.displaystories());
                n.append(stories.displaystories());
            }
        }

    }

    public void listNovels(JTextArea m) {
        m.setText("\n\t\tThe novels\n");

        for(int i = 0; i < this.theprodects.size(); ++i) {
            if(this.theprodects.get(i) instanceof Novels) {
                Novels NOV = (Novels) this.theprodects.get(i);
                m.append(NOV.displaydvNovels());
            }
        }

    }
}
