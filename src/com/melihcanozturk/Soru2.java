package com.melihcanozturk;

import java.util.Scanner;

public class Soru2 {

	public static void tekrarEden(int[] dizi) {
		int sayac = 1;
		int devam = 0;
		int devamEdenler = 1;

		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi.length; j++) {
				if (dizi[i] == dizi[j] && i != j) {
					sayac++;
					if (dizi[i] != 0) {
						devam = dizi[i];
					} else {
						devamEdenler = dizi[i];
					}
				}
			}
			if(devam !=0 || devamEdenler !=1) {
				break;
			}
		}
		if(sayac ==1) {
			System.out.println("Tekrar eden sayı bulunamamıştır.");
		} else if(devamEdenler !=1) {
			System.out.println(devamEdenler + " sayısı " + sayac + " kez tekrar ediyor.");
		} else {
			System.out.println(devam + " sayısı " + sayac + " kez tekrar ediyor.");
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("İstediğiniz dizi boyutunu giriniz : ");
		int[] dizi = new int[scanner.nextInt()];
		
		for (int i=0; i<dizi.length;i++) {
			dizi[i] = scanner.nextInt();
		}
		
		tekrarEden(dizi);
		
	}

}
