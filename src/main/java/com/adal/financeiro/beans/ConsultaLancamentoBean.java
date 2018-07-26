package com.adal.financeiro.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;

import com.adal.financeiro.model.Lancamento;
import com.adal.financeiro.repository.Lancamentos;
import com.adal.financeiro.util.JpaUtil;

@ManagedBean(name="consultaLancamentosBean")
@ViewScoped
public class ConsultaLancamentoBean {

	private List<Lancamento> lancamentos;
	
	public void consultar() {
		EntityManager manager = JpaUtil.getEntityManager();
		Lancamentos lancamentos = new Lancamentos(manager);
		
		this.lancamentos = lancamentos.todos();
		
		manager.close();
	}

	public List<Lancamento> getLancamentos() {
		return lancamentos;
	}
	
}
