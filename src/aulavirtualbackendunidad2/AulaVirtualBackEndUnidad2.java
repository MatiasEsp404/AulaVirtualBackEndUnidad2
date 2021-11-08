/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulavirtualbackendunidad2;

import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author unity
 */
public class AulaVirtualBackEndUnidad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
	/**
	 * Crear un programa en java en el cual se pida al usuario ingresar su
	 * nombre, apellido, edad, hobbie, editor de código preferido, sistema
	 * operativo que utiliza, luego deberá mostrarse por consola los datos
	 * ingresados. El programa deber ser subido a un repositorio de GitHub,
	 * pegar el link del ejercicio resuelto en el siguiente recuadro
	 */

	HashMap<String, String> datos2 = new HashMap<>();
	datos2.put("nombre", JOptionPane.showInputDialog("Ingrese su nombre"));
	datos2.put("apellido", JOptionPane.showInputDialog("Ingrese su apellido"));
	datos2.put("edad", JOptionPane.showInputDialog("Ingrese su edad"));
	datos2.put("hobbies", JOptionPane.showInputDialog("¿Cuales son tus hobbies?"));
	datos2.put("ide", JOptionPane.showInputDialog("¿Cuales son tu IDE favorito?"));
	datos2.put("so", JOptionPane.showInputDialog("¿Que sistema operativo usas?"));

	datos2.entrySet().forEach(entry -> {
	    System.out.println(entry.getKey() + ": " + entry.getValue());
	});

    }
    
}
