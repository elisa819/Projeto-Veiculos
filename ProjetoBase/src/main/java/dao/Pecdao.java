package dao;

import java.util.List;

import entidade.Peca_acessorio;




public interface Pecdao {
	
	public void inserir(Peca_acessorio peca_acessorio);
	
	public void alterar(Peca_acessorio peca_acessorio);

	public void remover(Peca_acessorio peca_acessorio);

	public Peca_acessorio pesquisar(Long id);

	public List<Peca_acessorio> listarTodos();
	


}
