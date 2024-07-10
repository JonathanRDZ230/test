package mv.com.empresa.test;

import java.util.ArrayList;
import java.util.List;

import mx.com.empresa.ControladorPrincipal;
import mx.com.empresa.dto.AlumnoDto;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ControladorPrincipal objeto = new ControladorPrincipal();
    	
    	AlumnoDto entrada = new AlumnoDto();
    	
		/* Creacion de listas*/
		List<String>  colores = new ArrayList<>();
    	
    	List<AlumnoDto> alumnos = new ArrayList<>();
    	   	
    	try {
    		entrada.setNombre("Jonathan");
        	entrada.setApellido("Rodriguez");
        	entrada.setDireccion("Rio atoyac");
        	entrada.setEdad(23);
        	entrada.setNumeroControl(19670015l);
        	entrada.setSexo("Masculino");
        	
        	colores.add("rojo");
        	colores.add("verde");
        	colores.add("azul");
        	
        	for(String color : colores) {
        		System.out.println(color);
        	}
        	
        	alumnos.add(entrada);
        	
        	for(AlumnoDto alumno : alumnos) {
        		
        		System.out.println("\n Nombre: " + alumno.getNombre() +
 					   "\n Apellido: " + alumno.getApellido() +
 					   "\n Edad: " + alumno.getEdad() + " años" +
 					   "\n Direcciono: " + alumno.getDireccion() +
 					   "\n No. de control del alumno: " + alumno.getNumeroControl() +
 					   "\n Sexo: " + alumno.getSexo() + 
 					   "\n");
        	}
        	
    		objeto.imprimirVariable();

		} catch (NullPointerException e) {
			System.out.println("Favor de inicializar variables y objetos " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Sucedio una excepcion " + e.getMessage());
			e.printStackTrace();
		}
    }
}
