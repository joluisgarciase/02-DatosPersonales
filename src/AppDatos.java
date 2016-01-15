
import javax.swing.JOptionPane;

/**
 * 
 * @author Luis Garcia
 * @version 0.1
 * Clase pirncipal de la aplicación donde se encuentran los datos que la Clase Alumno mostrará
 *
 */

public class AppDatos {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno al = new Alumno("Juanito","55","7894563265","abc","qwe","Tecamac","554878","Mexico","qwe@hotmail.com","Perez");
		JOptionPane.showMessageDialog(null, String.format("Hola: %s\n tu edad es %s \n tu telefono es %s \ntu calle es %s \ncolonia %s\n municipio %s\n codigo postal %s\n tu estado es %s\n correo %s \ny tu apellido es %s", al.getNombre(), al.getEdad(), al.getTelefono(), al.getCalle(), al.getColonia(), al.getMunicipio(), al.getCp(), al.getEstado(), al.getCorreo(), al.getApellidos()));

	}

}
