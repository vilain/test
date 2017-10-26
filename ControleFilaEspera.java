package dominio;
import java.util.*;

public class ControleFilaEspera {
	
	private Vector<EsperaPrioridade> filaPrioridade;
	private Vector<EsperaNormal> filaNormal;
	private int numeroFila;
	
	public ControleFilaEspera(){
		this.filaPrioridade = new Vector<EsperaPrioridade>();
		this.filaNormal = new Vector<EsperaNormal>();
	}
	
	public Espera proximoDaFilaDeEspera(){
		if (!this.filaPrioridade.isEmpty())
			return this.filaPrioridade.remove(0);
		else	if (!this.filaNormal.isEmpty())
					return this.filaNormal.remove(0);
				else
					return null;
	}
	
	public void pegaFichaNormal(){
		this.numeroFila++;
		this.filaNormal.add(new EsperaNormal(this.numeroFila));
	}

	
	public void pegaFichaPrioridade(){
		this.numeroFila++;
		this.filaPrioridade.add(new EsperaPrioridade(this.numeroFila));
		
		
	}


}
