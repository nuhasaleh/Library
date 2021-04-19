/**
 * Created by lenovo on 09/12/2020.
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Book extends Item {
    private String Auther;
    private String type;


    public Book(int num, double c, String tittel, String auther, int typ) {
        super(num, c, tittel);
        this.Auther = auther;
        if(typ == 1) {
            this.type = "fiction";
        } else {
            this.type = "non fiction";
        }

        try {
            String e = this.disply1() + "\nThe Auther: " + this.Auther + "\nThe type:" + this.type;
            FileWriter x = new FileWriter("fileBook.txt");
            x.write(e);
            x.close();
        } catch (IOException var10) {
            var10.printStackTrace();
        }

        try {
            FileReader e1 = new FileReader("fileBook.txt");

            double x1;
            while((x1 = (double)e1.read()) != -1.0D) {
                System.out.print((char)((int)x1) + "");
            }
        } catch (IOException var11) {
            var11.printStackTrace();
        }

    }

    public void setAuther(String auther) {
        this.Auther = auther;
    }

    public String getAuther() {
        return this.Auther;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public String displaybook1() {
        try {
            FileReader d = new FileReader("fileBook.txt");

            double x;
            while((x = (double)d.read()) != -1.0D) {
                System.out.print((char)((int)x) + "");
            }
        } catch (IOException var4) {
            var4.printStackTrace();
        }

        String d1 = this.disply1() + "\nThe Auther: n " + this.Auther + "\nThe type:" + this.type;
        return d1;
    }
}
