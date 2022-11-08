package challenge1;

import java.util.*;
import java.util.stream.Collectors;


public class Challenge1 {
	
	static Scanner scanner = new Scanner(System.in);
	static String option;
	static int i;
	
	public static String randomNumber(String option) {		
    	    	
    	String randomNumber = option.equals("TIPO A")? "54" : "08";
    	
    	for(i = 0; i < 8; i++) {
    		randomNumber = randomNumber + Integer.toString((int)Math.floor(Math.random()* 10));
    	}
    	
    	return randomNumber;
    	
	}
	
	public static boolean findString(String value, List<String> list)
    {	    	
    	list = list.stream().map(String::toUpperCase).collect(Collectors.toList());
    	
    	return list.contains(value) ? false : true; 
    }
	
	
	public static void main(String[] args) {
		
    	do {
    		System.out.print("Digite una de las siguientes opciones: \n* Tipo A\n* Tipo B\n");
	    	option = scanner.nextLine().trim().toUpperCase();
	    	
	    	i = (option.equals("TIPO A") || option.equals("TIPO B") ? 1 : 0);	   	    	
    		
    	}while(i == 0);  

		//Punto 2.a		
		System.out.println(randomNumber(option));	

		//Punto 2.b

		System.out.print("Digite el nombre de una fruta: ");
		option = scanner.nextLine().trim().toUpperCase();

		List<String> list = new ArrayList<String>();
    	
    	list.add("Mango");  
    	list.add("Manzana");  
    	list.add("Pera");  
    	list.add("Papaya");  
    	list.add("Aguacate");  
    	list.add("Fresa");  
    	list.add("Coco");  
    	list.add("Papaya"); 
		
		System.out.println(findString(option, list));		  
		System.exit(0);
	}
	
}
