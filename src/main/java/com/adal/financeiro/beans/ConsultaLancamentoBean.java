package com.adal.financeiro.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

import com.adal.financeiro.model.Lancamento;
import com.adal.financeiro.repository.Lancamentos;

@ManagedBean(name="consultaLancamentoBean")
@ViewScoped
public class ConsultaLancamentoBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Lancamentos lancamentosRepository;
	
	private List<Lancamento> lancamentos;
	
	public void consultar() {
		this.lancamentos = lancamentosRepository.todos();
	}

	public List<Lancamento> getLancamentos() {
		return lancamentos;
	}
	
}
