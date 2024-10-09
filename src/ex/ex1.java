package ex;


import java.util.Scanner;


public class ex1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("lungime:");
        int lung=scanner.nextInt();
        System.out.print("latime:");
        int lat=scanner.nextInt();
        dreptunghi d=new dreptunghi(lung,lat);
        System.out.println("perimetru="+d.Perimetru());
        System.out.println("arie="+d.Arie());
        scanner.close();
    }
}
