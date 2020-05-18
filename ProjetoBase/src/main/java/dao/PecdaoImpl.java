package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import entidade.Peca_acessorio;
import util.JpaUtil;

public class PecdaoImpl implements Pecdao{
	
	
	public void inserir (Peca_acessorio peca_acessorio) {
		
	String sql = "insert into tbpecas (id, codigo, descricao, categoria, fabricante, placaveiculo) values (?,?,?,?,?,?) ";
	
	
	Connection conexao;
	
	try { 
		conexao= JpaUtil.getConexao();
		
		PreparedStatement ps = conexao.prepareStatement(sql);
		
	    ps.setLong(1, peca_acessorio.getId());
		ps.setString(2, peca_acessorio.getCodigo());
		ps.setString(3, peca_acessorio.getDescricao());
		ps.setString(4, peca_acessorio.getCategoria());
		ps.setString(5, peca_acessorio.getFabricante());
		ps.setString(6, peca_acessorio.getPlacaveiculo());
		
		ps.execute();
		ps.close();
		
	}catch (SQLException e) {
		e.printStackTrace();
		
		
		
	}
	
	
			
		
	}

	@Override
	public void alterar(Peca_acessorio peca_acessorio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Peca_acessorio peca_acessorio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Peca_acessorio pesquisar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Peca_acessorio> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
