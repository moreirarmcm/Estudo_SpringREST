package services;

import view.Cliente;

public class NotificacaoSMS implements Notificador {

	@Override
	public void notificar(Cliente cliente, String msg) {
		System.out.printf("Notificando %s por SMS através do telefone %s: %s%n",
				cliente.getNome(), cliente.getTelefone(), msg);
	}
}
