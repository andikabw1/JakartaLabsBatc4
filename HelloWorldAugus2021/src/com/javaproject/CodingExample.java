package com.javaproject;

public class CodingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String kata = "Hello world";
		String kataBaru = "andika";
		System.out.println(kata);
		
		int i = 10;
		int j = 12;
		System.out.println(i+j);
		
		double hargaRonaldo = 10.5;
		System.out.println(hargaRonaldo + i);
		
		String gabunganKata= kata + " " + kataBaru;
		System.out.println(gabunganKata);
		System.out.println(gabunganKata.equalsIgnoreCase("hello world andika") );	
		System.out.println(gabunganKata.length());
		System.out.println(gabunganKata.substring(6,gabunganKata.length()));
		
		String checkRegex = "Pandemi2021";
		System.out.println(checkRegex.replaceAll("[a-zA-Z]", ""));
		
		String namaMakanan = "Mie NasiGoreng Bakso Cilok Batagor";
		String[] arrNamaMakanan=namaMakanan.split(" ");
		
//		System.out.println(arrNamaMakanan[0]);
//		System.out.println(arrNamaMakanan[1]);
//		System.out.println(arrNamaMakanan[2]);
//		System.out.println(arrNamaMakanan[3]);
//		System.out.println(arrNamaMakanan[4]);
//		
		
		for(int a = 0 ; a< arrNamaMakanan.length;a++) {
			System.out.println(arrNamaMakanan[a]);
		}		
		String menuItem = "//a[Contains(text(),%s)]";
		
		System.out.println(String.format(menuItem,"Log in"));
		System.out.println(String.format(menuItem,"Register"));

	}

}
