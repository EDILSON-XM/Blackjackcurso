package app;

import modelo.Carta;
import modelo.Mazo;
import modelo.NohayMasCartasException;

public class Prueba {

	public static void main(String[] args) {
		
	//creando baraja	
		Mazo baraja=new Mazo();
		
		baraja.barajar();
		
		System.out.println("La baraja es "+baraja);
		
		Carta c1;
		try {
		
		c1 =baraja.solicitarCarta();
		System.out.println(" La carta es "+ c1);
		System.out.println(" La carta es "+ baraja);
		}catch(NohayMasCartasException e) {
			e.printStackTrace();
		}
	
		

	}

}
