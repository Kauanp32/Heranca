package Teste;

import Heranca.Cachorro;

import Heranca.Gato;

public class TesteAnimais {
	
	public static void main (String [] args) {
		
		Cachorro Mike = new Cachorro();
		
		Gato Mia = new Gato();
		
		Mike.emitirSom();
		Mia.emitirSom();
	}
	

}