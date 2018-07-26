package com.adal.financeiro.service;

import java.util.Date;

import javax.inject.Inject;

import com.adal.financeiro.exception.NegocioException;
import com.adal.financeiro.model.Lancamento;
import com.adal.financeiro.repository.Lancamentos;
import com.adal.financeiro.repository.Transactional;

public class CadastroLancamentos {

	@Inject
	private Lancamentos lancamentos;
	
	@Transactional
	public void salvar(Lancamento lancamento) throws NegocioException{
		if (lancamento.getDataPagamento() != null && lancamento.getDataPagamento().after(new Date())) {
			throw new NegocioException(
					"Data de pagamento não pode ser uma data futura.");
		}
		
		this.lancamentos.adicionar(lancamento);
	}
}
