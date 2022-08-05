package com.estudandospring.di.notificacao;

import org.springframework.stereotype.Component;
import com.estudandospring.di.modelo.*;

@Component
public class NotificadorEmail implements Notificador {
	
	public NotificadorEmail() {
		System.out.println("NotificadorEmail.");

	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Nofiticando %s através do email %s: %s%n", 
				cliente.getNome(), 
				cliente.getEmail(), 
				mensagem);
	}
	
}
