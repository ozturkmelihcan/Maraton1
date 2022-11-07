package com.melihcanozturk;

public class Soru1 {

	public static void yildiz() {

		int sayac = 0;
		boolean kontrol = true;
		while (kontrol) {
			if (sayac < 4) {
				for (int i = 0; i < 7; i++) {
					System.out.print("* ");
				}
				sayac++;
				System.out.println();
				if (sayac == 4) {
					kontrol = false;
				}
			}
		}
		int sayac2=6;
		for(int a=0;a<6;a++) {
			for(int b=0;b<sayac2;b++) {
				System.out.print("* ");
			}
			System.out.println();
			sayac2--;
		}

	}

	public static void main(String[] args) {

		Soru1.yildiz();

	}

}
