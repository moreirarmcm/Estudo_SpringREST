package com.estudandospring.di.modelo;

public class Cliente {
	private String nome;
	private String email;
	private String telefone;
	
	public Cliente(String nome, String email, String telefone) {
		super();
		setNome(nome);
		setEmail(email);
		setTelefone(telefone);
		System.out.println("Cliente!");
	}
	
	public void ativar() {
		System.out.println("Ativando cliente...\n");
	}
	
	
//==============Getters n' Setters============
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
