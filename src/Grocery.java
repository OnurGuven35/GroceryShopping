/* Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
Meyveler ve KG Fiyatları = Armut : 2,14 TL , Elma : 3,67 TL , Domates : 1,11 TL , Muz: 0,95 TL , Patlıcan : 5,00 TL */

import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = 2.14, e = 3.67, d = 1.11, m = 0.95, p = 5.0;
        int ar, el, dom, mu, pa;
        double toplam;

        // Kullanıcıdan girişleri aldıktan sonra formül yazıp toplamı buluyoruz.

        System.out.println();
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
        System.out.println();

        toplam = ((a * ar) + (e * el) + (d * dom) + (m * mu) + (p * pa));
        System.out.println("Toplam Odeyeceginiz Tutar : " + toplam + "TL");
    }
}