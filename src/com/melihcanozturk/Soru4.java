package com.melihcanozturk;

import java.util.Scanner;

public class Soru4 {

	public static void menu() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("******************************");
		System.out.println();
		System.out.println("*    Geometrik hesaplayıcı   *");
		System.out.println();
		System.out.println("******************************");
		System.out.println("1. Kare alan hesaplama");
		System.out.println("2- Kare çevre hesaplama");
		System.out.println("3- Dikdörtgen alan hesaplama");
		System.out.println("4- Dikdörtgen çevre hesaplama");
		System.out.println("5- Daire alan hesaplama ");
		System.out.println("6- Daire çevre hesaplama");
		System.out.println("7- Çıkış");
		System.out.println();
		System.out.println("Lütfen seçiminizi yapınız...");
		int secim = scanner.nextInt();

		if (secim > 6 && secim <= 7) {
			System.out.println("Programdan başarıyla çıktınız...");
		} else {

			switch (secim) {
			case 1:
				Soru4.kareninAlaniniHesapla();
				break;
			case 2:
				Soru4.kareninCevresiniHesapla();
				break;
			case 3:
				Soru4.dikdortgenAlaniHesapla();
				break;
			case 4:
				Soru4.dikdortgenCevresiHesapla();
				break;
			case 5:
				Soru4.daireninAlani();
				break;
			case 6:
				Soru4.daireninCevresi();
				break;

			}

			while (secim != 7) { // kullanıcı 7 den büyük bir değer tuşladığında tekrar program menüsü ile
									// karşılaşacak.
									// fakat 7 den küçük değer tuşladığında tuşladığı değerdeki işlemi yapacak.
									// 7'ye basması durumunda programdan çıkış sağlayacak.
				System.out.println("******************************");
				System.out.println();
				System.out.println("*    Geometrik hesaplayıcı   *");
				System.out.println();
				System.out.println("******************************");
				System.out.println("1. Kare alan hesaplama");
				System.out.println("2- Kare çevre hesaplama");
				System.out.println("3- Dikdörtgen alan hesaplama");
				System.out.println("4- Dikdörtgen çevre hesaplama");
				System.out.println("5- Daire alan hesaplama ");
				System.out.println("6- Daire çevre hesaplama");
				System.out.println("7- Çıkış");
				System.out.println();
				System.out.println("Lütfen seçiminizi yapınız...");
				secim = scanner.nextInt();

				if (secim > 6 && secim <= 7) {
					System.out.println("Programdan başarıyla çıktınız...");
				} else {

					switch (secim) {
					case 1:
						Soru4.kareninAlaniniHesapla();
						break;
					case 2:
						Soru4.kareninCevresiniHesapla();
						break;
					case 3:
						Soru4.dikdortgenAlaniHesapla();
						break;
					case 4:
						Soru4.dikdortgenCevresiHesapla();
						break;
					case 5:
						Soru4.daireninAlani();
						break;
					case 6:
						Soru4.daireninCevresi();
						break;
					}
				}
			}
		}
	}

	public static void kareninAlaniniHesapla() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kenar uzunluğu giriniz: ");
		int kenar = scanner.nextInt();
		int alan = kenar * kenar;
		System.out.println("kenar uzunluğu " + kenar + " olan karenin alanı: " + alan);
	}

	public static void kareninCevresiniHesapla() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kenar uzunluğu giriniz: ");
		int kenar = scanner.nextInt();
		int kareCevresi = kenar * 4;
		System.out.println("kenar uzunluğu " + kenar + " olan karenin çevresi: " + kareCevresi);
	}

	public static void dikdortgenAlaniHesapla() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("kısa kenarın uzunluğunu giriniz: ");
		int kisaKenar = scanner.nextInt();
		System.out.println("uzun kenarın uzunluğunu giriniz: ");
		int uzunKenar = scanner.nextInt();
		int alan = kisaKenar * uzunKenar;
		System.out.println(
				"kısa kenarı " + kisaKenar + " ve uzun kenarı " + uzunKenar + " olan dikdörtgenin alanı : " + alan);
	}

	public static void dikdortgenCevresiHesapla() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("kısa kenarın uzunluğunu giriniz: ");
		int kisaKenar = scanner.nextInt();
		System.out.println("uzun kenarın uzunluğunu giriniz: ");
		int uzunKenar = scanner.nextInt();
		int cevre = 2 * (kisaKenar + uzunKenar);
		System.out.println("kısa kenarı " + kisaKenar + " ve uzun kenarı " + uzunKenar
				+ "olan dikdörtgenin çevresi : " + cevre);

	}

	public static void daireninAlani() {
		float pi = 3.14f;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dairenin yarıçapını giriniz: ");
		int yariCap = scanner.nextInt();
		float alan = pi * yariCap * yariCap;
		System.out.println("Yarıçapı " + yariCap + " olan dairenin alanı : " + alan);
	}

	public static void daireninCevresi() {
		float pi = 3.14f;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dairenin yarıçapını giriniz: ");
		int yariCap = scanner.nextInt();
		float cevre = 2 * pi * yariCap;
		System.out.println("Yarıçapı " + yariCap + " olan dairenin çevresi : " + cevre);

	}

	public static void main(String[] args) {

		Soru4.menu();

	}

}
