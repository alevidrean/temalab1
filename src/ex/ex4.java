package ex;

import java.util.Random;
import java.util.Scanner;

public class ex4
{
    public static void main(String[] args) {

        Random random=new Random();

        int a=random.nextInt(31);
        System.out.println("a="+a);
        int b=random.nextInt(31);
        System.out.println("b="+b);
//euclid cu scaderi
        while(a != b)
            if(a > b)
                a =a- b;
            else
                b =b- a;
        System.out.println("cmmdc="+a);


    }
}
