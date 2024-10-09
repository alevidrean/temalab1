package ex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import java.lang.Math;

public class ex2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/ex/in.txt"));

        int k=0,n,s=0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        PrintStream out=new PrintStream("src/ex/out.txt");
while(scanner.hasNext()==true)
{
    k++;
    n = scanner.nextInt();
    s=s+n;
if(n<min)
    min=n;
if(n>max)
    max=n;


}

        out.println("suma="+s);
        out.println("media="+(s/k));
        out.println("min="+min);
        out.println("max="+max);

        System.out.println("suma="+s);
        System.out.println("media="+(float)s/k);
        System.out.println("min="+min);
        System.out.println("max="+max);
        scanner.close();
    }
}
