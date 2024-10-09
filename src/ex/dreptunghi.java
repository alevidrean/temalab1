package ex;

import java.util.Scanner;

public class dreptunghi {
    private int lungime;
    private int latime;
    public dreptunghi(int lung,int lat)
    {
        this.lungime=lung;
        this.latime=lat;

    }
    public int Arie()
    {
        return lungime*latime;
    }
    public int Perimetru()
    {
        return (2*lungime+2*latime);
    }
}
