import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {

        double a = 2.14, e = 3.67, d = 1.11, m = 0.95, p = 5.0;
        int ar, el, dom, mu, pa;
        double toplam;

        Scanner input = new Scanner(System.in);
        System.out.print("Kac Kilo Armut Aldiniz? : ");
        ar = input.nextInt();
        System.out.print("Kac Kilo Elma Aldiniz? : ");
        el = input.nextInt();
        System.out.print("Kac Kilo Domates Aldiniz? : ");
        dom = input.nextInt();
        System.out.print("Kac Kilo Muz Aldiniz? : ");
        mu = input.nextInt();
        System.out.print("Kac Kilo Patlican Aldiniz? : ");
        pa = input.nextInt();

        toplam = ((a * ar) + (e * el) + (d * dom) + (m * mu) + (p * pa));
        System.out.print("Toplam Odeyeceginiz Tutar : " + toplam + "TL");
    }
}
