package com.melihcanozturk;

public class Soru3 {
	
	public static int karakterSayici(String cumle, char harf) {
		
		int sayac=0;
		for(int i=0;i<cumle.length();i++) {
			if(cumle.charAt(i) == harf) {
				sayac++;
			}
		} 
		return sayac;
			
		
	}

	public static void main(String[] args) {
		
		System.out.println(karakterSayici("Hava bugün kapalı.", 'a'));
		System.out.println(karakterSayici("Bugün güzel bir gün", 'g'));
	}

}
