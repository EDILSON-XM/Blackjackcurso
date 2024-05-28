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
cartas sumando los puntos de cada una.
		 * @throws Masde21Excetion **/

	
	public int valorMano()  {
		int valor=0;
		int numAses=0;
		for(Carta c:this.cartas){
			if(c.getNumero()==1) {
				numAses++;
			}
			valor=valor+c.getValor();
			
		}
		//comprobamos sihe pasado los 21
		
		while(numAses>0 && valor>21) {
		
		valor=valor-10;
		numAses--;
		}
		
		
		return valor;
	}
 
	
	public boolean finDeJuego() {
		
      if (valorMano()>=21) {
     return true;
      }return false;
     
	}
	
	/**método pedirCarta(Mazo m) al que se le pasa un mazo de cartas,
	deberá solicitar una carta al mazo e incluirla en la mano.**/
	
	@Override
	public String toString() {
		return "Mano [" + cartas + "] Valor de la mano:"+valorMano();
	}
	
	
	public void pedirCarta(Mazo baraja) throws NohayMasCartasException, Masde21Excetion, HayBlackjakeExcetion {
		//recoge la carta que se encuentra en el princiopio del mazo
		Carta c= baraja.solicitarCarta();
		this.cartas.add(c);
		if(valorMano()>21) {
			throw new Masde21Excetion();
		}
		if(valorMano()==21) {
			throw new HayBlackjakeExcetion();
		}
	}
	
}
