package ex;

import java.util.Random;

public class ex5 {
    public static void main(String[] args) {
        Random random=new Random();
    int n=random.nextInt(20);
        System.out.println("n="+n);
        if(n==1) {
            System.out.println("apartine sirului");
            return;
        }
        int i;
        int a=1,b=1;
        int c;
        boolean apart=false;

        for(i=1;i<=n;i++) {
            c = a+b;
            a=b;
            b=c;
            if(a==n)
                apart=true;


        }
        if(apart)
            System.out.println("apartine");
        else System.out.println("nu apartine");

    }
}
