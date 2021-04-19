/**
 * Created by lenovo on 09/12/2020.
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Novels extends Item {
    private String novels;
    private String details_books;
    private String category;

    public Novels(int num, double co, String titt, String theaksosa, String thedetails_prodect, String thecategory) {
        super(num, co, titt);
        this.novels = theaksosa;
        this.details_books = thedetails_prodect;
        this.category = thecategory;

        try {
            String e = this.disply1() + "\nThe novel: " + this.novels + "\n The Details Prodect: " + this.details_books + "\n The Category: " + this.category;
            FileWriter x = new FileWriter("filenovel.txt");
            x.write(e);
            x.close();
        } catch (IOException var11) {
            var11.printStackTrace();
        }

        try {
            FileReader e1 = new FileReader("filenovel.txt");

            double x1;
            while((x1 = (double)e1.read()) != -1.0D) {
                System.out.print((char)((int)x1));
            }
        } catch (IOException var12) {
            var12.printStackTrace();
        }

    }

    public void setNovels(String novels) {
        this.novels = novels;
    }

    public String getNovels() {
        return this.novels;
    }

    public void setDetails_prodect(String details_books) {
        this.details_books = details_books;
    }

    public String getDetails_prodect() {
        return this.details_books;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }

    public String displaydvNovels() {
        String s = this.disply1() + "\nThe novel: " + this.novels + "\n The Details books: " + this.details_books + "\n The Category: " + this.category;
        return s;
    }
}
