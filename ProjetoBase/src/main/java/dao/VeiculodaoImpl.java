package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidade.Veiculo;
import util.JpaUtil;

public class VeiculodaoImpl implements Veiculodao {

	
		


public void inserir(Veiculo veiculo) {
		
		String sql = "insert into TBVEICULO (placauf, chassi , tipo, combustivel, marcamodelo, anofab, anomod, cor) values(?,?,?,?,?,?,?,?)";

		Connection conexao;
		try {
			conexao = JpaUtil.getConexao();
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			
			
			
			ps.setString(1, veiculo.getPlacauf());
			ps.setString(2, veiculo.getChassi());
			ps.setString(3, veiculo.getTipo());
			ps.setString(4, veiculo.getCombustivel());
			ps.setString(5, veiculo.getMarcamodelo());
			ps.setString(6, veiculo.getAnofab());
			ps.setString(7, veiculo.getAnomod());
			ps.setString(8, veiculo.getCor());
			
		
			
			
			ps.execute();
			
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
	

		
	}

	}

public void alterar (Veiculo veiculo) {
	
	String sql = "UPDATE TBVEICULO SET placauf = ? , chassi = ?  , tipo = ?, combustivel = ?, marcamodelo = ?, anofab = ?, anomod = ?, cor";


Connection conexao;

try { 
	
	conexao = JpaUtil.getConexao();
	
	PreparedStatement ps = conexao.prepareStatement(sql);
	
	
	ps.setString(1, veiculo.getPlacauf());
	ps.setString(2, veiculo.getChassi());
	ps.setString(3, veiculo.getTipo());
	ps.setString(4, veiculo.getCombustivel());
	ps.setString(5, veiculo.getMarcamodelo());
	ps.setString(6, veiculo.getAnofab());
	ps.setString(7, veiculo.getAnomod());
	ps.setString(8, veiculo.getCor());
	
	
	ps.execute();
	ps.close();
	
} catch (SQLException e){
	
	e.printStackTrace();
}
}	

public void remover(Veiculo veiculo) {
	

	String sql = "DELETE  FROM TBVEICULO WHERE placauf = ?";
	
	
	Connection conexao;
	
	try {
		
		conexao = JpaUtil.getConexao();
		
		PreparedStatement ps = conexao.prepareStatement(sql);
		
		ps.setString (1, veiculo.getPlacauf());
		
		
		
		
		ps.execute();
		ps.close();
		
		
	}catch (SQLException e) {
		e.printStackTrace();
	}
		
		
}	
		
//Pesquisar veiculos pela chave primaria		
		

public Veiculo pesquisar (String placauf) {
	
	String sql = "select  V.placauf , V.chassi  Vtipo , V.combustivel, V.marcamodelo, V.anofab, V.anomod, V.cor from  Veiculo where placauf = ?";
	
	
	Veiculo veiculo = null;
			
			
			Connection conexao;
	
	
	try {
		
		conexao = JpaUtil.getConexao();
		
		
		
		PreparedStatement ps = conexao.prepareStatement(sql);
		
	
		ps.setString(1, placauf);
		
		ResultSet res = ps.executeQuery();
		
		while (res.next()){
			
		veiculo = new Veiculo();
		veiculo.setPlacauf (res.getString("PLACAUF"));
		veiculo.setChassi (res.getString("CHASSI"));
		veiculo.setTipo (res.getString("TIPO"));
		veiculo.setCombustivel (res.getString("COMBUSTIVEL"));
		veiculo.setMarcamodelo(res.getString("MARCAMODELO"));
		veiculo.setAnomod (res.getString("ANOMOD"));
		veiculo.setAnofab (res.getString("ANOFAB"));
		veiculo.setCor (res.getString("COR"));
		}
		
	ps.close();
	
}catch(SQLException e){
 e.printStackTrace();
	
}

return veiculo;
	
}
	
public List<Veiculo> listarTodos(){
	
	String sql = "select  V.placauf , V.chassi  V.tipo , V.combustivel, V.marcamodelo, V.anofab, V.anomod, V.cor, from Veiculo V ";
	
	
       
          List<Veiculo> listaVeiculo = new ArrayList<Veiculo>();
  
 
			
			Connection conexao;
	
	
	try {
		
		conexao = JpaUtil.getConexao();
		
		
		
		PreparedStatement ps = conexao.prepareStatement(sql);
		
		ResultSet res =ps.executeQuery();
		
		while (res.next()) {
		
		Veiculo veiculo = new Veiculo ();
		veiculo.setPlacauf (res.getString("PLACAUF"));
		veiculo.setChassi (res.getString("CHASSI"));
		veiculo.setTipo (res.getString("TIPO"));
		veiculo.setCombustivel (res.getString("COMBUSTIVEL"));
		veiculo.setMarcamodelo(res.getString("MARCAMODELO"));
		veiculo.setAnomod (res.getString("ANOMOD"));
		veiculo.setAnofab (res.getString("ANOFAB"));
		veiculo.setCor (res.getString("COR"));
		
		
		listaVeiculo.add(veiculo);
		}
		
	ps.close();
	
		}catch(SQLException e) {
 e.printStackTrace();
	
}

return listaVeiculo;


}


}
		
		

		
		

	
					









	
	
	
	
	
