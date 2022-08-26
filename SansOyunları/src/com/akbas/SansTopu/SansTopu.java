package com.akbas.SansTopu;

import java.util.Random; //ÞANS TOPU
import java.util.Scanner;

public class SansTopu {

	public static int kontrol(int[] dizi) { /*
											 * buradaki dizi parametresine 1 den 34 e kadar olan 5 tane sayý atandý 1 ve
											 * 34 dahil ama tekrar eden sayý olmamasý gerek, bunun kontrolü yapýlýyor.
											 */

		int temp;

		for (int i = 0; i < 4; i++) {
			for (int j = i + 1; j < 5; j++) {

				temp = dizi[i];

				if (dizi[j] == temp) {

					return -1;
				}

			}

		}
		return 1;
	}

	public static void sirala(int[] dizi) { /* küçükten büyüðe sýralýyoruz */

		Random r = new Random();
		int temp1;

		for (int i = 0; i < 4; i++) {

			for (int j = i + 1; j < 5; j++) {

				if (dizi[i] > dizi[j]) {

					temp1 = dizi[i];
					dizi[i] = dizi[j];
					dizi[j] = temp1;

				}
			}

		}

		int arti1 = r.nextInt(14) + 1;

		for (int i = 0; i < 5; i++) { // þanslý numaralarý ekrana bastýrýyoruz

			System.out.print(" " + dizi[i]);

			if (i + 1 < 5) {

				System.out.print(" " + "-");
			}

			/*
			 * try { Thread.sleep(1000); }
			 * 
			 * catch (InterruptedException e) { e.printStackTrace(); }
			 */

		}
		System.out.print(" " + " + " + arti1);
		System.out.println();

	}

	public static void main(String[] args) {

		Random r = new Random();

		int dizi[] = new int[5];

		Scanner s = new Scanner(System.in);

		int i = 1;
		System.out.println();
		System.out.println("        " + "ÞANS TOPU");
		System.out.println("*****************************");
		System.out.print("Kaç kolon oynanacak: ");

		int kolonSayisi = s.nextInt();

		System.out.println();
		System.out.println();

		if (kolonSayisi > 1) {
			while (i <= kolonSayisi) {

				for (int a = 0; a < 5; a++) {

					dizi[a] = r.nextInt(34) + 1;
				}

				if (kontrol(dizi) == -1) {
					continue;
				}

				else {
					System.out.println("        " + i + ". KOLON");
					System.out.println("*****************************");
					sirala(dizi);
					System.out.println();
					System.out.println();
					i++;

				}
			}

			System.out.println("Tutarsa alýrým yüzdemi ;)");

		}

		else if (kolonSayisi == 1) {

			while (true) {

				for (int a = 0; a < 5; a++) {

					dizi[a] = r.nextInt(34) + 1;
				}

				if (kontrol(dizi) == -1) {
					continue;
				}

				else {
					System.out.println("        " + i + ". KOLON");
					System.out.println("*****************************");
					sirala(dizi);
					System.out.println();
					System.out.println("Tutarsa alýrým yüzdemi ;)");
					return;

				}

			}

		}

		else {
			System.out.println("Hatalý giriþ yaptýn. Tekrar dene...");
		}
	}

}
