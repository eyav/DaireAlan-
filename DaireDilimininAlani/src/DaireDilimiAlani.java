import java.util.Scanner;

public class DaireDilimiAlani {
    public static void main(String[] args) {
        int r;
        double pi=3.14;
        double alfa;
        Scanner inp= new Scanner(System.in);
        r=inp.nextInt();
        alfa=inp.nextDouble();
        double alan = pi*r*r*alfa/360;
        System.out.println("Dairenin Alanı =" + alan);



    }
}
