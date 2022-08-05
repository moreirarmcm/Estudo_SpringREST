package com.estudandospring.di.services;

import org.springframework.stereotype.Component;

import com.estudandospring.di.modelo.Cliente;
import com.estudandospring.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		super();
		this.notificador = notificador;
		System.out.println("AtivacaoClienteService: " + notificador);
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "seu cadastro no sistema está ativo!!");
	}
}
