/*Autor: Camilo Lavado
Fecha: 04/01/2022
Versión: 1.0*/

package calculadora1;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) throws InterruptedException {
		
		//definimos los parametros a utilizar y agregamos la instancia de scanner para tomar datos del teclado.-
		
		Scanner teclado = new Scanner (System.in);
		int n1, n2, resultado, opcion;
		boolean opera = true;
		
		//Creamos el menú por pantalla
		while (opera) {
			System.out.println("----------------------");
			Thread.sleep(600);
			System.out.println("Menu Principal\n");
			Thread.sleep(600);
			System.out.println("1.- Restar");
			System.out.println("2.- Sumar");
			System.out.println("3.- Multiplicar");
			System.out.println("4.- Dividir");
			System.out.println("5.- Salir\n");
			Thread.sleep(600);
			System.out.println("Seleccione la opción deseada: \n");
			opcion = teclado.nextInt();
			Thread.sleep(500);
			
			//Agregamos una opción para salir del sistema.-
			
			if (opcion == 5) {
				System.out.println("Saliendo del programa");
				Thread.sleep(1000);
				System.out.println("Limpiando pantalla  \n" + "..................................");
				Thread.sleep(2000);
				System.out.println("Ha salido con exito");
				Thread.sleep(1000);
				limpiezadePantalla();
				break;
				//Añadimos las operaciones a realizar
			} else {
				switch (opcion) {
				
				//Resta---------------
				case 1:
					System.out.println("Ingrese el 1er. valor: \n");
					n1 = teclado.nextInt();
					Thread.sleep(500);
					System.out.println("Ingrese el 2do. valor: \n");
					n2 = teclado.nextInt();
					Thread.sleep(500);
					resultado = resta(n1, n2);
					System.out.println("El resulado de la operación solicitada es: \n" + resultado + "\n");
					Thread.sleep(4000);
					System.out.println("Volviendo al menú principal");
					Thread.sleep(1000);
					break;
					
					//Suma--------------
				case 2:
					System.out.println("Ingrese el 1er. valor: \n");
					n1 = teclado.nextInt();
					Thread.sleep(500);
					System.out.println("Ingrese el 2do. valor: \n");
					n2 = teclado.nextInt();
					Thread.sleep(500);
					resultado = sumar(n1, n2);
					System.out.println("El resulado de la operación solicitada es: \n" + resultado + "\n");
					Thread.sleep(4000);
					System.out.println("Volviendo al menú principal");
					Thread.sleep(1000);
					break;
					
					//Multiplicación
				case 3:
					System.out.println("Ingrese el 1er. valor: \n");
					n1 = teclado.nextInt();
					Thread.sleep(500);
					System.out.println("Ingrese el 2do. valor: \n");
					n2 = teclado.nextInt();
					Thread.sleep(500);
					resultado = multiplicar(n1, n2);
					System.out.println("El resulado de la operación solicitada es: \n" + resultado + "\n");
					Thread.sleep(4000);
					System.out.println("Volviendo al menú principal");
					Thread.sleep(1000);
					break;
					
					//División
				case 4:
					System.out.println("Ingrese el 1er. valor: \n");
					n1 = teclado.nextInt();
					Thread.sleep(500);
					System.out.println("Ingrese el 2do. valor: \n");
					n2 = teclado.nextInt();
					Thread.sleep(500);
					resultado = dividir(n1, n2);
					System.out.println("El resulado de la operación solicitada es: \n" + resultado + "\n");
					Thread.sleep(4000);
					System.out.println("Volviendo al menú principal");
					Thread.sleep(1000);
					break;
						
				}
			}
			}
		}
			//Metodos a utilizar para las distintas operaciones:
	
	//Resta
		public static int resta (int n1, int n2) {
			int resultado = 0;
			resultado = n1 - n2;
			return resultado;
		}
		//Suma
	  public static int sumar  (int n1, int n2) {
		  int resultado = 0 ;
		  resultado = n1 + n2 ;
		  return resultado ;
	  }     
	  //Multiplicación
	  public static int multiplicar (int n1, int n2) {
		  int resultado = 0;
		  resultado = n1*n2;
		  return resultado;
	  }
	  //División
	public static int dividir (int n1, int n2) {
			  int resultado = 0;
			  resultado = n1/n2;
			  return resultado;
		  
	  }
		
	//Metodo para dejar la pantalla en blanco
	private static void limpiezadePantalla() {
		for (int i = 0; i < 50; i++) {
			System.out.println("        ");
		}
		System.out.println();
		System.out.flush();
	}}
