package modelo;

public class Carta {
	/**Número de la carta. Es un numero del 1 al 12
• Palo. De tipo Palo (el tipo enumerado)**/


	public enum Palo{
		TREBOLES,DIAMANTES,CORAZONES,PICAS
	};
	
	// ATRIBUTOS
	private int numero;
	private Palo palo;
	
	// source constructor using fields, para crear los objetos
	
	/**Constructor parametrizado al que le pases el numero y el palo, y
asigne los valores. El número deberá estar entre 1 y 13.**/
	
	public Carta(int numero, Palo palo) {
		if(numero>0 && numero<=13) {
		this.numero = numero;
		this.palo = palo;
		}
	}

	
	
	//  source  constructor setter para ver los datos
	
	/**Métodos getters de los atributos de las cartas. No crear lo setters**/
	
	public int getNumero() {
		return numero;
	}

	public Palo getPalo() {
		return palo;
	}
	
	
	//para devolver el valor de  la carta en el juego
	
	/**Método getValor que devuelve el valor que tiene cada carta en el
BlackJack. Los valores serán: 11 para el AS (1), 10 para las figuras
(J,Q,K o 11, 12 y 13) y el valor correspondiente para el resto de las
cartas (2, 3, 4, 5, 6, 7, 8, 9)**/
	
	
	public int getValor() {
		if(this.numero==1) {
			return 11;
		}else if(this.numero>=10) {
			return 10;
			}else {
				return this.numero;
			}
	}
/**Método mostrarNumero sin parámetros que devuelve un String con
la representación de cada número. Para el 1 habrá que mostrar
“AS”, para la 11 habrá que mostrar “J”, para la 12 habrá que
mostrar “Q”, para la 13 “K” y para el resto su correspondiente valor.**/
	
	public String monstrarNumero(){
	switch (this.numero){
		case 1:return"AS";
		case 11:return"J";
		case 12:return"Q";	
		case 13:return"K";
		default:return  "" + this.numero;
	}
		
	}
	
	
	/**Sobreescribe el método toString para que muestre la carta de la
siguiente manera [ numero – Palo]. Por ejemplo, [3 – CORAZONES]**/


@Override
public String toString() {
	return " [" + monstrarNumero() + "=" + palo + "]";
}
	
	
	
}
