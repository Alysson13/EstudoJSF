package com.adal.financeiro.service;

import java.util.Date;

import com.adal.financeiro.exception.NegocioException;
import com.adal.financeiro.model.Lancamento;
import com.adal.financeiro.repository.Lancamentos;

public class CadastroLancamentos {

	private Lancamentos lancamentos;
	
	public CadastroLancamentos(Lancamentos lancamentos) {
		this.lancamentos = lancamentos;
	}
	
	public void salvar(Lancamento lancamento) throws NegocioException{
		if (lancamento.getDataPagamento() != null && lancamento.getDataPagamento().after(new Date())) {
			throw new NegocioException(
					"Data de pagamento não pode ser uma data futura.");
		}
		
		this.lancamentos.adicionar(lancamento);
	}
}
