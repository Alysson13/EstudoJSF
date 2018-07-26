package com.adal.financeiro.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.adal.financeiro.model.Lancamento;

public class Lancamentos {

	private EntityManager manager;
	
	@Inject
	public Lancamentos(EntityManager manager) {
		this.manager = manager;
	}
	
	public List<Lancamento> todos(){
		TypedQuery<Lancamento> query = manager.createQuery("select * from Lancamento", Lancamento.class);
		return query.getResultList();
	}
	
	public void adicionar(Lancamento lancamento) {
		this.manager.persist(lancamento);
	}
	
	public List<String> descricoesQueContem(String descricao){
		TypedQuery<String> query = manager.createQuery(
				"select distinct descricao from Lancamento "
				+ "where upper(descricao) like upper(:descricao)",
				String.class);
		query.setParameter("descricao", "%" + descricao + "%");
		return query.getResultList();
	}
}
