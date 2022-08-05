package com.estudandospring.di.notificacao;

import com.estudandospring.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}