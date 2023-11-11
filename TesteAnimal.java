package Heranca;

import Heranca.Cachorro;

import Heranca.Gato;

public class TesteAnimal {
	
	public static void main (String [] args) {
		
		Cachorro Mike = new Cachorro();
		
		Gato Mia = new Gato();
		
		Mike.emitirSom();
		Mia.emitirSom();
	}
	

}