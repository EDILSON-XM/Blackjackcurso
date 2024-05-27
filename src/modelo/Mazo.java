package modelo;

import java.util.ArrayList;
import java.util.Collections;

import modelo.Carta.Palo;

	public class Mazo {
	/**• Cartas. Contendrá las 52 cartas de la baraja en una estructura de
	tipo ArrayList<Carta>**/
	
	protected ArrayList<Carta> cartas ;	
		//creamos cartas vacias
	public Mazo() {
		this.cartas=new ArrayList<Carta>();
		//recorre la lista de palos
		for(Palo p: Palo.values()) {
			//recorre todos los valores de la carta
			for(int i=1; i<=13; i++){
			Carta carta = new Carta(i,p);
			this.cartas.add(carta);                                    
				
			}
		}
		
		
		
	}
	@Override
	public String toString() {
		return "Mazo [cartas=" + cartas + "]";
	}
	
	/**Método barajar() sin parámetros. Se encargará de barajar el mazo
	de cartas. Lo único que hace es utilizar el método shuffle de la clase
	Collecction:
	Collections.shuffle(cartas);**/
	
	public void barajar() {
		Collections.shuffle(cartas);
	}
	
	/**solicitarCarta. Método sin parámetros que devuelve la primera carta
	del mazo eliminándola de la lista.**/


	public Carta solicitarCarta() throws NohayMasCartasException {
		if(this.cartas.size()==0) {
			throw new NohayMasCartasException();
			
		}
		
		// recogemos la primera carta del maso de cartas
		
		Carta c= this.cartas.get(0);
		//eliminamos la carta recogida del mazo
		
		this.cartas.remove(0);
		return c;
	}
}
