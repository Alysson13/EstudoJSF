package com.adal.financeiro.beans;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="meuBean")
@RequestScoped
public class MeuBean {
	
	private String nome;
	private int quantidadeCaracteres;
	
	public void transformar() {
		this.nome = this.nome.toUpperCase();
		this.quantidadeCaracteres = this.nome.length();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getQuantidadeCaracteres() {
		return quantidadeCaracteres;
	}

}
