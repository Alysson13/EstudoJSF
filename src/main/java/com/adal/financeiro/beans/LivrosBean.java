package com.adal.financeiro.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="livrosBean")
@ViewScoped
public class LivrosBean {

	private List<Livro> livros;
	private Livro novoLivro;
	
	public LivrosBean() {
		this.livros = new ArrayList<>();
		this.novoLivro = new Livro();
	}
	
	public void adicionar() {
		this.livros.add(this.novoLivro);
		this.novoLivro = new Livro();
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public Livro getNovoLivro() {
		return novoLivro;
	}
	
}
