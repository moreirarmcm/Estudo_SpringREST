package services;

import view.Cliente;

public class AtivacaoClienteService {
	private Notificador notificador;

	
	public AtivacaoClienteService(Notificador notificador) {
		super();
		this.notificador = notificador;
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "seu cadastro no sistema está ativo!!");
	}
}
