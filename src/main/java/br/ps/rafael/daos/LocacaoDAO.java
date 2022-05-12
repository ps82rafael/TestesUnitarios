package br.ps.rafael.daos;

import java.util.List;

import br.ps.rafael.entidades.Locacao;

public interface LocacaoDAO {

	public void salvar(Locacao locacao);

	public List<Locacao> obterLocacoesPendentes();
}
