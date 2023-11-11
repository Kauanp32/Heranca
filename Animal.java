package Heranca;

public  abstract class Animal {
	 private String nome;
	 private String genero;
	 private String peso;

     public String getnome() {
         return nome;
     }

     public void setnome(String nome) {
          this.nome = nome;
     }

     public String  getcgenero() {
	    return genero;
     }

     public void setcargo (String genero ) {
	      this.genero = genero;
     }

     public String genero () {
          return genero;
     }  

     public void setsalario(String genero ) {
          this.genero = genero;
     }
     
     public String getpeso() {
         return peso;
     }

     public void setpeso(String peso) {
          this.peso = peso;
     }
     
     public abstract void emitirSom();
     
     public abstract void dormir();
     
     public abstract void comer();

}
