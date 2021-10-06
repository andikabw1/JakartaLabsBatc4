package com.javaproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionExpamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Contoh arraylist  
		ArrayList<String> names= new ArrayList<>();
		names.add("Andika");
		names.add("bagus");
		names.add("dono");
		names.add("Ica");
		
		for(String item : names) {
			System.out.println(item);
		}
		System.out.println(names.size());
		
		// contoh set
		//hasset sifat datanya bersifat uniq
		
		HashSet<Integer> rollNumbers = new HashSet<>();
		rollNumbers.add(100);
		rollNumbers.add(101);
		rollNumbers.add(102);
		
		for (Integer item: rollNumbers) {
			System.out.println(item);
		}
		
		//Contoh Maps
		//digunakan untuk lebih specifik, dan bisa diasosiakan dengan data yang lain
		//keguanaan list yang dipanggil dengan key nya
		HashMap<Integer,String>studentId = new HashMap<>();
		studentId.put(8, "gesang");
		studentId.put(10, "dono");
		studentId.put(7, "adlan");
		studentId.put(1, "dono");
		
		for(Integer Key : studentId.keySet()) {
			System.out.println("Key is : " + Key + " and the name is " + studentId.get(Key));
		}
		
		HashMap<String, String> MenuMakanan = new HashMap<>();
		MenuMakanan.put("a", "Soto");
		MenuMakanan.put("b", "bakso");
		MenuMakanan.put("c", "mie kuah");
		
		System.out.println(MenuMakanan.get("a"));
		
		
		//treeSet
		//TreeMap
		//LinkedHashed
		//collectionTree.java
		//minimal 3 statement
		//simpan ke dalam bentuk zip
	//kirim ke andromeda.sidhik@gmail.com
	
	}
}
