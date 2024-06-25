package com.cadastromais.model;

public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	// método construtor
	// o nome deverá ser igual ao nome da classe
	public Pessoa () {}
	
	public Pessoa (String cpf) {
		this.cpf = cpf;
	}
	
	public Pessoa (String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}

	public Pessoa (String cpf, String nome, String endereco) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	//...
	//getters
	//setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nEndereço: " + getEndereco() + ".";
	}
}