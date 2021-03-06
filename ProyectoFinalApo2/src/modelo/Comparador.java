package modelo;

import java.util.Comparator;
/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 * Universidad Icesi (Cali - Colombia)    ~ 
 * Autores: Juan Sebastian Puerta Ordo�es ~ 
 * 			Jeiner Alexis Bonilla Chavez  ~ 
 * 			Sergio Andres Lozada Sanchez  ~      
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
public class Comparador implements Comparator<Jugador> {
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// 								METODOS
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// METODO: CONSTRUCTOR
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * Crea un comparador de jugadores. <br>
	 */
	public Comparador() {
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// METODO: COMPARE
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * Comparar a dos jugadores por el puntaje. <br>
	 * @param pJugador1 jugador con el que se compara el pJugador2.
	 * @param pJugador2 jugador con el que se compara el pJugador1.
	 * @return numero<0 si pJugador1 es menor, numero>0 si pJugador1 es mayor o numero==0 si pJugador1 es igual a pJugador2.
	 */
	@Override
	public int compare(Jugador pJugador1, Jugador pJugador2) {
	 
		return pJugador1.darPuntaje()-pJugador2.darPuntaje();
	}

}
