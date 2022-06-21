/* Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
Meyveler ve KG Fiyatları = Armut : 2,14 TL , Elma : 3,67 TL , Domates : 1,11 TL , Muz: 0,95 TL , Patlıcan : 5,00 TL */

import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double p = 2.14, a = 3.67, t = 1.11, b = 0.95, e = 5.0;
        int pear, apple, tom, banana, eggp;
        double total;

        // Kullanıcıdan girişleri aldıktan sonra formül yazıp toplamı buluyoruz.

        System.out.println();
        System.out.print("Kac Kilo Armut Aldiniz? : ");
        pear = input.nextInt();
        System.out.print("Kac Kilo Elma Aldiniz? : ");
        apple = input.nextInt();
        System.out.print("Kac Kilo Domates Aldiniz? : ");
        tom = input.nextInt();
        System.out.print("Kac Kilo Muz Aldiniz? : ");
        banana = input.nextInt();
        System.out.print("Kac Kilo Patlican Aldiniz? : ");
        eggp = input.nextInt();
        System.out.println();

        total = ((p * pear) + (a * apple) + (t * tom) + (b * banana) + (e * eggp));
        System.out.println("Toplam Odeyeceginiz Tutar : " + total + " TL");
    }
}