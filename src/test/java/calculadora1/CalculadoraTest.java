/*Autor: Camilo Lavado
Fecha: 04/01/2022
Versión: 1.0*/
package calculadora1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class CalculadoraTest {


	 //Regla de jUnit que guarda el nombre del test actual.
	public @Rule
	TestName name = new TestName();
	
	 //Método que será invocado antes de ejecutar los test. 
	@BeforeClass
	public static void setUpClass() throws InterruptedException{
		System.out.println("[ TESTS START ] - Se comienzan a ejecutar los Test Unitarios.");
		Thread.sleep(700);
	}

	/**
	 * Método que será invocado después de ejecutar los test.
	 * @throws InterruptedException 
	 */
	@AfterClass
	public static void tearDownClass() throws InterruptedException{
		System.out.println("[ TESTS FINISH ] -  Terminan de ejecutarse Test Unitarios.");
		Thread.sleep(700);
		System.out.println("Pruebas terminadas de manera satisfactoria");
		System.out.println("Saliendo del programa");
		Thread.sleep(1200);
		System.out.println("Limpiando pantalla  \n" + "..................................");
		Thread.sleep(3200);
		System.out.println("Ha salido con exito");
		Thread.sleep(5000);
		limpiezadePantalla();
	}

	/**
	 * Método que será invocados antes de cada test
	 */
	@Before
	public void setUp(){
		System.out.print("*********************************\n");
		System.out.println("[ EJECUTANDO ] " + name.getMethodName() + "\n");
	}

	/**
	 * Método que será invocados después de cada test
	 */
	@After
	public void tearDown(){
		System.out.println("[ TERMINADO ] " + name.getMethodName());
		System.out.print("*********************************\n");
	}
//SUMA -------------------------------------------
	//Test para sumar dos números
	@Test
	public void testSumar() throws InterruptedException {
		//Definimos los números a sumar
				int num1 = 1;
				int num2 = 2;
				//Definimos el resultado de la suma
				int resultado = 3;
				//Llamamos al método a testear
				int operacion1 = Calculadora.sumar(num1, num2);
				//Comprobamos que el resultado es correcto.
				Assert.assertEquals(operacion1, resultado);
				Thread.sleep(700);
				System.out.println("No se encontraron errores");
	}

	//RESTA --------------------------
	@Test
	public void testResta() throws InterruptedException {
		//Definimos los números a restar
		int num1 = 10;
		int num2 = 2;
		//Definimos el resultado de la resta
		int resultado = 8;
		//Llamamos al método a testear
		int operacion1 = Calculadora.resta(num1, num2);
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(operacion1, resultado);
		Thread.sleep(700);
		System.out.println("No se encontraron errores");
	}


	@Test
	public void testMultiplicar() throws InterruptedException {	
		//Definimos los números a multiplicar
		int num1 = 10;
		int num2 = 2;
		//Definimos el resultado de la multiplicación
		int resultado = 20;
		//Llamamos al método a testear
		int operacion1 = Calculadora.multiplicar(num1, num2);
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(operacion1, resultado);
		Thread.sleep(700);
		System.out.println("No se encontraron errores");
	}

	@Test
	public void testDividir() throws InterruptedException {
		//Definimos los números a dividir
		int num1 = 10;
		int num2 = 2;
		//Definimos el resultado de la multiplicación
		int resultado = 5;
		//Llamamos al método a testear
		int operacion1 = Calculadora.dividir(num1, num2);
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(operacion1, resultado);
		Thread.sleep(700);
		System.out.println("No se encontraron errores");
	}
	//Metodo para dejar la pantalla en blanco
		private static void limpiezadePantalla() {
			for (int i = 0; i < 50; i++) {
				System.out.println("        ");
			}
			System.out.println();
			System.out.flush();
			
	}}
