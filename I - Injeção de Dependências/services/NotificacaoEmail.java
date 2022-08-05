package services;

import view.Cliente;

public class NotificacaoEmail implements Notificador{
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Nofiticando %s através do email %s: %s%n", 
				cliente.getNome(), 
				cliente.getEmail(), 
				mensagem);
	}
}
