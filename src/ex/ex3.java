package ex;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        System.out.print("Introduceti n=");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
       int i,k=0;
       for(i=1;i<=n;i++) {
           if (n % i == 0) {
               System.out.println("divizorii=" + i);
               k++;
           }
       }
        if(k==2)
       {
           System.out.println("nr este prim");

       }
       else System.out.println("nr nu este prim");
scanner.close();

    }
    }

