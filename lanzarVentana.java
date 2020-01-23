package paq;

import javax.swing.*;

public class lanzarVentana {
/**	El siguiente ejemplo se trata de que el programa genera un número aleatorio y se lanza una ventana para que  la persona, que usa la aplicación, inserte un número con el fin de comprobar si acierta el número (establecido por la aplicación). He visualizado el número, que genera la aplicación, para que sepas cual es y compruebes si el programa funciona.

	El proyecto tiene dos clases:

	Una donde he codificado varios métodos, que lanzan una ventana, para pedir un número y cada uno lo convierte a un tipo numérico diferente, de los que tiene Java. He puesto los métodos estáticos, para que no haya que declarar un objeto, para usar los métodos.
	La clase Principal, para poder ejecutar el programa.
	Suerte, haber si aciertas el número.

	Clase LanzarVentana
	import javax.swing.JOptionPane;


	public class LanzarVentana {

	    /**
	     *
	     * Constructor de la clase.
	     *
	     */
	    public LanzarVentana() {

	    }

	    /**
	     *
	     * Método que pide al usuario que introduzca un número. El número esperado
	     *
	     * es un número de precisión doble, en cualquiera de sus formatos.
	     *
	     * @param titulo
	     *
	     * @param mensaje
	     *
	     * @return
	     *
	     */
	    public static double PedirNumeroDouble(String titulo, String mensaje) {

	        double d = 0;

	        boolean NumeroValido = false;

	        do {

	            String s = (String) JOptionPane.showInputDialog(null, mensaje,
	                    titulo, JOptionPane.PLAIN_MESSAGE, null, null, "");

	            if (s != null) {

	                try {

	                    d = Double.parseDouble(s);

	                    NumeroValido = true;

	                } catch (NumberFormatException e) {

	                    JOptionPane.showMessageDialog(null, "El número introducido no es válido.", "Error", JOptionPane.ERROR_MESSAGE);

	                }

	            } else {
	                JOptionPane.showMessageDialog(null, "Cerramos el juego ya que ha cancelado la inserción del´número", "CANCELADO EL JUEGO", JOptionPane.ERROR_MESSAGE);
	                System.exit(0);

	            }

	        } while (!NumeroValido);

	        return d;

	    }

	    /**
	     *
	     * Método que pide al usuario que introduzca un número. El número esperado
	     *
	     * es un número de precisión sencilla, en cualquiera de sus formatos.
	     *
	     * @param titulo
	     *
	     * @param mensaje
	     *
	     * @return
	     *
	     */
	    public static float PedirNumeroFloat(String titulo, String mensaje) {

	        float d = 0;

	        boolean NumeroValido = false;

	        do {

	            String s = (String) JOptionPane.showInputDialog(null, mensaje,
	                    titulo, JOptionPane.PLAIN_MESSAGE, null, null, "");

	            if (s != null) {

	                try {

	                    d = Float.parseFloat(s);

	                    NumeroValido = true;

	                } catch (NumberFormatException e) {

	                    JOptionPane.showMessageDialog(null, "El número introducido no es válido.", "Error", JOptionPane.ERROR_MESSAGE);

	                }

	            } else {
	                JOptionPane.showMessageDialog(null, "Cerramos el juego ya que ha cancelado la inserción del´número", "CANCELADO EL JUEGO", JOptionPane.ERROR_MESSAGE);
	                System.exit(0);

	            }

	        } while (!NumeroValido);

	        return d;

	    }

	    /**
	     *
	     * Clase que pide al usuario que introduzca un número. El número esperado
	     *
	     * es un número entero.
	     *
	     * @param titulo
	     *
	     * @param mensaje
	     *
	     * @return
	     *
	     */
	    public static int PedirNumeroInteger(String titulo, String mensaje) {

	        int d = 0;

	        boolean NumeroValido = false;

	        do {

	            String s = (String) JOptionPane.showInputDialog(null, mensaje,
	                    titulo, JOptionPane.PLAIN_MESSAGE, null, null, "");

	            if (s != null) {

	                try {

	                    d = Integer.parseInt(s);

	                    NumeroValido = true;

	                } catch (NumberFormatException e) {

	                    JOptionPane.showMessageDialog(null, "El número introducido no es válido.", "Error", JOptionPane.ERROR_MESSAGE);

	                }

	            } else {
	                JOptionPane.showMessageDialog(null, "Cerramos el juego ya que ha cancelado la inserción del´número", "CANCELADO EL JUEGO", JOptionPane.ERROR_MESSAGE);
	                System.exit(0);

	            }

	        } while (!NumeroValido);

	        return d;

	    }

	    /**
	     *
	     * Clase que pide al usuario que introduzca un número. El número esperado
	     *
	     * es un número entero (long).
	     *
	     * @param titulo
	     *
	     * @param mensaje
	     *
	     * @return
	     *
	     */
	    public static long PedirNumeroLong(String titulo, String mensaje) {

	        long d = 0;

	        boolean NumeroValido = false;

	        do {

	            String s = (String) JOptionPane.showInputDialog(null, mensaje,
	                    titulo, JOptionPane.PLAIN_MESSAGE, null, null, "");

	            if (s != null) {

	                try {

	                    d = Long.parseLong(s);

	                    NumeroValido = true;

	                } catch (NumberFormatException e) {

	                    JOptionPane.showMessageDialog(null, "El número introducido no es válido.", "Error", JOptionPane.ERROR_MESSAGE);

	                }

	            } else {
	                JOptionPane.showMessageDialog(null, "Cerramos el juego ya que ha cancelado la inserción del´número", "CANCELADO EL JUEGO", JOptionPane.ERROR_MESSAGE);
	                System.exit(0);

	            }

	        } while (!NumeroValido);

	        return d;
	    }

	    /**
	     *
	     * Clase que pide al usuario que introduzca un número. El número esperado
	     *
	     * es un número entero corto.
	     *
	     * @param titulo
	     *
	     * @param mensaje
	     *
	     * @return
	     *
	     */
	    public static short PedirNumeroShort(String titulo, String mensaje) {

	        short d = 0;

	        boolean NumeroValido = false;

	        do {

	            String s = (String) JOptionPane.showInputDialog(null, mensaje,
	                    titulo, JOptionPane.PLAIN_MESSAGE, null, null, "");

	            if (s != null) {

	                try {

	                    d = Short.parseShort(s);

	                    NumeroValido = true;

	                } catch (NumberFormatException e) {

	                    JOptionPane.showMessageDialog(null, "El número introducido no es válido.", "Error", JOptionPane.ERROR_MESSAGE);

	                }

	            } else {
	                JOptionPane.showMessageDialog(null, "Cerramos el juego ya que ha cancelado la inserción del´número", "CANCELADO EL JUEGO", JOptionPane.ERROR_MESSAGE);
	                System.exit(0);

	            }

	        } while (!NumeroValido);

	        return d;

	    }

	}
}
