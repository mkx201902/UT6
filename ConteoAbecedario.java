package paq;
import java.util.*;
class ConteoAbecedario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tamanio inicial 27 caracteres x 2 (mayus+minus) 
		HashMap<Character, Integer> Contador = new HashMap<>(27 * 2);
		Scanner sc= new Scanner(System.in);
	System.out.println("mete la frase");			
		String cadena = sc.nextLine();
		if (cadena != null && !cadena.trim().isEmpty()) {
		    for (char current : cadena.toCharArray()) {
		        if (Character.isLetter(current) && ((current >= 'a' && current <= 'z') || (current >= 'A' && current <= 'Z'))) {
		            //agrega o actualiza el valor en el Map si el valor no existe use 0
		            Contador.put(current, Contador.getOrDefault(current, 0) + 1);
		        }
		    }
		} else {
		    System.out.println("No hay informacion!");
		}
		System.out.println("La frase tiene el siguiente número de letras");
		Contador.forEach( (key, value)->{System.out.println(String.format("La letra '%s' aparece %d veses en el texto",key,value));});
	}

}
