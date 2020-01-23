package prog6;

import java.util.*;
import java.lang.*;


class contarVocales {

	  
	    public static void main(String args[])
	    {
	        int totalVocales=0;
	        
	        String helloWorld="Hello world áéíóÚ";
	        totalVocales=contarVocales(helloWorld);
	     //   System.out.println(totalVocales);
	        
	        String loremIpsum=
	            "Rocío GOnzÁlez";
	        totalVocales=contarVocales(loremIpsum);
	        System.out.println(totalVocales);  
	        totalVocales=contarVocalesFor(loremIpsum);
	//        System.out.println(totalVocales);         

	        HashMap<String,Integer> mapTotalVocales=contarVocalesMap(loremIpsum);
	  //      System.out.println(mapTotalVocales);  
	    
	    }
	    
	    public static int contarVocales(String s){
	        int totalVocales = s.replaceAll("[^AEIOUaeiouÁÉÍÓÚáéíóú]","").length();
	        int totalA = s.replaceAll("[^AÁá]","").length();
	        return totalVocales;
	    }
	    

	    public static HashMap<String,Integer> contarVocalesMap(String s){
	          HashMap<String,Integer> mapTotal=new HashMap<String,Integer>();  

	        int totalVocales = s.replaceAll("[^AEIOUaeiouÁÉÍÓÚáéíóú]","").length();
	        int totalA = s.replaceAll("[^AaÁá]","").length();
	        int totalE = s.replaceAll("[^EeÉé]","").length();
	        int totalI = s.replaceAll("[^IiÍí]","").length();
	        int totalO = s.replaceAll("[^OoÓó]","").length();
	        int totalU = s.replaceAll("[^UuÚú]","").length();
	        mapTotal.put("a",totalA);
	        mapTotal.put("e",totalE);
	        mapTotal.put("i",totalI);
	        mapTotal.put("o",totalO);
	        mapTotal.put("u",totalU);
	        mapTotal.put("all",totalVocales);
	        return mapTotal;
	    }
	    
	    
	    
	    
	    
	    public static int contarVocalesFor(String s){
	        int totalVocales = 0;

	        for (int i = 0; i < s.length(); i++) {
	          char c = s.charAt(i);
	          if ((c == 'A') || (c == 'a') || (c == 'E') || (c == 'e') || (c == 'I') || (c == 'i')
	          || (c == 'O') || (c == 'o') || (c == 'U') || (c == 'u'))
	            totalVocales++;
	        }
	        return totalVocales;
	    }
	
	}