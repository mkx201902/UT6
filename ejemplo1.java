package paq;

public class ejemplo1 {

	public static void main(String[] args) {
	System.out.println("Ejemplo de cadena de caracteres");
	String cad="¡Bien"+"venido!";
	var cad5="¡Bien".concat("venido!");
	String cad2="Ejemplo de cadena 1";
	String cad3 = "Ejemplo de cadena 2";
	String cad4 = new String("Ejemplo de cadena 3");
	System.out.println(cad);
		System.out.println(cad2);
	System.out.println(cad3);
	System.out.println(cad4);
	System.out.printf(cad);
	@SuppressWarnings("deprecation")
	Integer i1=new Integer (1223); 
	System.out.println("\nNúmero: " + i1);
	System.out.println(4+1+"-"+4+1);
	char t = cad.charAt(0);
	System.out.println(t);
	int length=cad.length();
	System.out.println(length);
	int length1=cad3.length();
	System.out.println(length1);
	String subcadena=cad.substring( 5);
	System.out.println(subcadena);
	String subcaden =cad5.substring(6);
	System.out.println(subcaden);
	String subcade=cad.substring(11);
	System.out.println(subcade);
	String cad6="Número cinco: " + 5;
	System.out.println(cad6);
	System.out.println("A "+5f);
	String c="1234.5678";
	double n;
	String Unodosytres="123";
	Integer u;
	Integer g=Integer.valueOf(Unodosytres);
	System.out.println(g+g+g);
	u=Integer.parseInt(Unodosytres);
	n=Double.parseDouble(c);
	System.out.println(n+1111.1111);
	System.out.println(u+789);
	byte yt = Byte.parseByte(Unodosytres);
	long dos = Long.parseLong(Unodosytres);
	short od= Short.parseShort(Unodosytres);
	float on=Float.parseFloat(Unodosytres);
	System.out.println(yt);
	System.out.println(dos);
	System.out.println(od);
	System.out.println(on);
	System.out.printf("ZZZZZZZZZZZ".concat("ZZZZZZZZZZZZ\n"));
	System.out.println(Unodosytres+Unodosytres+Unodosytres+Unodosytres+Unodosytres+Unodosytres);
	String subcad=Unodosytres.substring(1,2);
	System.out.println(subcad+subcad+subcad.concat("222222222222222222"));
	String subca=c.substring(4,5);
	System.out.println(subca+subca+subca+subca.concat("........"));
	String subc=c.substring(5);
	System.out.println(subc+subc+subc.concat("5678")+"5678");
	char r=cad5.charAt(1);
	System.out.println(r);
	

	
	
	    }

	
	}
	

