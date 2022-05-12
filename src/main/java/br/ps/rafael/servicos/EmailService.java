package br.ps.rafael.servicos;

import br.ps.rafael.entidades.Usuario;

public interface EmailService {
	
	public void notificarAtraso(Usuario usuario);

}
