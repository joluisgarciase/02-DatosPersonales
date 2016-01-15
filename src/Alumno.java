/**
 * 
 * @author Luis Garcia
 * @version 0.1
 * Clase donde se encuentran los geters y setrs de los datos que se mostraran
 *
 */

public class Alumno {

	private String nombre;
	private String edad;
	private String telefono;
	private String calle;
	private String colonia;
	private String municipio;
	private String cp;
	private String estado;
	private String correo;
	private String apellidos;
	
	public Alumno(){}
	
	/**
	 * 
	 * @param nombre
	 * @param edad
	 * @param telefono
	 * @param calle
	 * @param colonia
	 * @param municipio
	 * @param cp
	 * @param estado
	 * @param correo
	 * @param apellidos
	 */
	
	public Alumno(String nombre, String edad, String telefono, String calle, String colonia, String municipio,
			String cp, String estado, String correo, String apellidos) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
		this.calle = calle;
		this.colonia = colonia;
		this.municipio = municipio;
		this.cp = cp;
		this.estado = estado;
		this.correo = correo;
		this.apellidos = apellidos;
	}

	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @return
	 */
	public String getCalle() {
		return calle;
	}
	
	/**
	 * 
	 * @param calle
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}

	/**
	 * 
	 * @return
	 */
	
	public String getColonia() {
		return colonia;
	}

	/**
	 * 
	 * @param colonia
	 */
	
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	/**
	 * 
	 * @return
	 */
	public String getMunicipio() {
		return municipio;
	}

	/**
	 * 
	 * @param municipio
	 */
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	/**
	 * 
	 * @return
	 */
	public String getCp() {
		return cp;
	}

	/**
	 * 
	 * @param cp
	 */
	public void setCp(String cp) {
		this.cp = cp;
	}

	/**
	 * 
	 * @return
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * 
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * 
	 * @return
	 */
	
	public String getCorreo() {
		return correo;
	}

	/**
	 * 
	 * @param correo
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * 
	 * @return
	 */
	
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * 
	 * @param apellidos
	 */
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * 
	 * @param nombre
	 */
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return
	 */
	public String getEdad() {
		return edad;
	}
	
	/**
	 * 
	 * @param edad
	 */

	public void setEdad(String edad) {
		this.edad = edad;
	}

	/**
	 * 
	 * @return
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * 
	 * @param telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
}
