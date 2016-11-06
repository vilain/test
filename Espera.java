package dominio;

public class Espera {

	private int numeroDaSenhaDeEspera;
	private int horarioInicial;
	
	public Espera (int numero){
		this.numero = numero;
	}
	
	public int retornaNumero (){
		return this.numero;
	}
	
}
