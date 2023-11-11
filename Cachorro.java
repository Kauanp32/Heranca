package Heranca;

public class Cachorro extends Animal {

	@Override
	public void emitirSom() {
		System.out.println("O cachorro faz au au au \n" );		
	}

	@Override
	public void dormir() {
		System.out.println("O cachorro está dormindo na casinha \n" );		
		
	}

	@Override
	public void comer() {
		System.out.println("O cachorro está comendo sua ração \n" );			
	}

}
