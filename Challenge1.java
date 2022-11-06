package challenge1;

import java.util.*;

public class Challenge1 {
	
	static Scanner scanner = new Scanner(System.in);
	static String option;
	
	public static String randomNumber() {
		
		int i=0;
    	
    	do {
    		System.out.print("Digite una de las siguientes opciones: \n* Tipo A\n* Tipo B\n");
	    	option = scanner.nextLine().trim().toUpperCase();
	    	
	    	i = (option.equals("TIPO A") || option.equals("TIPO B") ? 1 : 0);	   	    	
    		
    	}while(i == 0);  
    	    	
    	String randomNumber = option.equals("TIPO A")? "54" : "08";
    	
    	for(i = 0; i < 8; i++) {
    		randomNumber = randomNumber + Integer.toString((int)Math.floor(Math.random()* 10));
    	}
    	
    	return randomNumber;
    	
	}
	
	public static boolean findString(String value, List<String> list)
    {	
    	boolean b = true;
    	
    	for(int j = 0; j < list.size(); j++ ) {	 
    		if(value.equals(list.get(j).toString().toUpperCase())) {
    			b = false;
    			break;
    		}	    		
    	}
    	return b;
    }
	
	
	public static void main(String[] args) {
		
		//Punto 2.a
		System.out.println(randomNumber());	
			
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
