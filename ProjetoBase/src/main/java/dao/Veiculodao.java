package dao;

import java.util.List;

import entidade.Veiculo;




//Interface para compartilhar chamadas */

public interface Veiculodao {
	
	public void inserir(Veiculo veiculo);
	
	public void alterar (Veiculo veiculo);
	
	public void remover (Veiculo veiculo);
	
    public Veiculo pesquisar(String placauf);
	
	
    public List<Veiculo> listarTodos();

}


