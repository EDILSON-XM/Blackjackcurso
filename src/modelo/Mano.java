package modelo;

import java.util.ArrayList;

public class Mano extends Mazo {

	public Mano() {
	//creamos una lista de cartas vacías
		/**• Constructor de la clase. Define una lista de caratas vacía, no invoca
		al método de la superclase**/
		
		this.cartas= new  ArrayList<Carta>();
		
		
	}
		/**Método valorMano sin parámetros. Calcula cual es valor que
tenemos en la mano de cartas. Para hacerlo recorreremos la lista de
cartas sumando los puntos de cada una.**/

	
	public int valorMano() {
		int valor=0;
		for(Carta c:this.cartas){
			valor=valor+c.getValor();
			
		}
		return valor;
	}
	
}
