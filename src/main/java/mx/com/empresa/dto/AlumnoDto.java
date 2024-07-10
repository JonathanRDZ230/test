package mx.com.empresa.dto;

//Manipular informacion de forma temporal
public class AlumnoDto {
	
	private String nombre;
	private String apellido;
	private Integer edad;
	private String direccion;
	private Long numeroControl;
	private String sexo;
	
	//Getter y Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Long getNumeroControl() {
		return numeroControl;
	}
	public void setNumeroControl(Long numeroControl) {
		this.numeroControl = numeroControl;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	
}
