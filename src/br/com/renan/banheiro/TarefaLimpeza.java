package br.com.renan.banheiro;

public class TarefaLimpeza implements Runnable {

	private Banheiro banheiro;
	
	public TarefaLimpeza(Banheiro banheiro) {
		this.banheiro = banheiro;
	}

	@Override
	public void run() {
		this.banheiro.limpa();
	}

}
