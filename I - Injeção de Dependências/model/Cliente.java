package view;

import services.AtivacaoClienteService;

public class Cliente {
	private String nome;
	private String email;
	private String telefone;
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	private int idade;
	//AtivacaoClienteService acs = new AtivacaoClienteService();
	
	
	public Cliente(String nome, String email, String telefone, int idade) {
		super();
		setNome(nome);
		setEmail(email);
		setTelefone(telefone);
		setIdade(idade);
	}
	public void ativar() {
		System.out.println("Ativando cliente...\n");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
