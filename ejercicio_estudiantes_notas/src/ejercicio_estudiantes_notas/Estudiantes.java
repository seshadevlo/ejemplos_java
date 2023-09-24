package ejercicio_estudiantes_notas;

import java.util.Scanner;

public class Estudiantes {

	public static void main(String[] args) {
		
		/*solicitamos cantidad de estudiantes
		como entrada a traves de la instnacia scanner.*/ 
		
		int cantidadEstudiantes;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar un número de estudiantes: ");
		
		cantidadEstudiantes = sc.nextInt();
		
		/*creamos un array para alamacenar los nombre de los estudiantes
		 y uno para las calificaciones.*/
		
		String nombreEstudiantes [] = new String[cantidadEstudiantes];
		double calificaciones []= new double [cantidadEstudiantes];
	
		//algoritmo para ingresar los nombres y calificaciones al array
		
		for(int i=0; i < cantidadEstudiantes;i++) {
			
			//solicitamos el nombre del estudiante
			System.out.println("ingresa el nombre del estudiante "+(i+1)+" : ");
			nombreEstudiantes[i] = sc.next();
			
			//solicitamos la califiacion asociada al mismo estudiante
			System.out.println("ingresa la califiación del estudiante "+(i+1)+" : ");
			calificaciones[i] = sc.nextDouble();
		}
		
		//algoritmo para buscar la calificacion más alta
		double calificacionMaxima = calificaciones[0];
		int indiceMaximo = 0;
		
		for (int i=1; i < cantidadEstudiantes; i++) {
			
			if(calificaciones[i] > calificacionMaxima) {
				calificacionMaxima = calificaciones[i];
				indiceMaximo= i;
			}	
		}
		//mostramos en consola quien es el estudiante con la mejor calificacion
		System.out.println("El estudiante con calificacion mas alta es: "+nombreEstudiantes[indiceMaximo]+
				" con una calificacion de: "+calificacionMaxima);
		//cerramos la instancia de Scanner
		sc.close();
	}
}
