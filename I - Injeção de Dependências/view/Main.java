package view;

import services.AtivacaoClienteService;
import services.EmissaoNotaFiscalService;
import services.NotificacaoEmail;
import services.NotificacaoSMS;
import services.Notificador;

public class Main {

	public static void main(String[] args) {
		Cliente joao = new Cliente("João", "joao123@xyz.com", "12345678789", 48);
		Produto bolo = new Produto("Bolo", 25.5f);
		Notificador n = new NotificacaoSMS();
		AtivacaoClienteService acs = new AtivacaoClienteService(n);
		EmissaoNotaFiscalService enfs = new EmissaoNotaFiscalService();
		acs.ativar(joao);
		enfs.emitir(joao, bolo);
		
	}

}
