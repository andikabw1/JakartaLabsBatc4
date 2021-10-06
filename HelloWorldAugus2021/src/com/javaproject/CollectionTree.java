package com.javaproject;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CollectionTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(200,"Success");    
	      map.put(201,"Created");    
	      map.put(404,"Not Found");    
	      map.put(203,"Redirected"); 
	      
	      map.remove(203);    
	        
	      for(Map.Entry m:map.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }    
	      
	      TreeSet<String> names=new TreeSet<String>();  
	      names.add("andika");  
	      names.add("bagus");  
	      names.add("wicaksono");  
	      
	      
	    for (String item : names) {
	    	System.out.println(item);
	    }
	      
	}

}
