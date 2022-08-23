package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class modificacion 
{
	
	
	public static void main(String args[]) throws FileNotFoundException, IOException
	{
	        
	        /**
	    	 * NOTA !!!!!
	    	 * No estaba muy seguro si se esperaba el mensaje de : 
	    	 * [basketball men's basketball (1992), judo men's extra-lightweight (2012), weightlifting women's super-heavyweight (2016)....
	    	 * Pero preferi no borrarlo ya que al seguir las instrucciones del PDF de copy + paste y hacer los Quick fix recomendados 
	    	 * este fue el resultado :) Gracias !!!!
	    	 */
	        CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv"); 
	        System.out.println("\n");
	        
	        System.out.println("El pais con mas medallistas es :" +"\n");
	        System.out.println(calc.paisConMasMedallistas());
	        System.out.println("\n");
	        
	        System.out.println("Hola, mundo!");
	        
	}
	

}
