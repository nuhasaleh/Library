/**
 * Created by lenovo on 09/12/2020.
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class stories extends Item {
    private String artist;
    private String genre;


    public stories(int un_num, double co, String titt, String theartist, int thegenre) {
        super(un_num, co, titt);
        this.artist = theartist;
        if(thegenre == 1) {
            this.genre = "  borrow Book";
        }

        try {
            String e = this.disply1() + "\nThe artist: " + this.artist + "\nThe genre:" + this.genre;
            FileWriter x = new FileWriter("file.txt");
            x.write(e);
            x.close();
        } catch (IOException var10) {
            var10.printStackTrace();
        }

        try {
            FileReader e1 = new FileReader("file.txt");

            double x1;
            while((x1 = (double)e1.read()) != -1.0D) {
                System.out.print((char)((int)x1));
            }
        } catch (IOException var11) {
            var11.printStackTrace();
        }

    }

    public String getArtist() {
        return this.artist;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return this.genre;
    }

    public void displayNovels() {
        super.disply1();
        System.out.println("The Artist: " + this.artist + "\n The genre: " + this.genre);
    }

    public String displaystories() {
        String a = this.disply1() + "\nThe Artist: " + this.artist + "\n The genre: " + this.genre;
        return a;
    }


        }
