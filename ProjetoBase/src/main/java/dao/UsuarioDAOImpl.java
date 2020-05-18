package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidade.Usuario;
import util.JpaUtil;

/**
 * 
 * @author Cleiton
 *
 *         Essa classe implementa a interface, todos os metodos mostrados na
 *         interface. Lembrando de uma coisa, a implementação ela recebe no
 *         construtor o entityManager, a conexão com o banco de dados, deixando
 *         assim essa classe totalemnte independente
 *
 */

public class UsuarioDAOImpl implements UsuarioDAO {

	/**
	 * Metodo inserir, recebe o usuario todo preenchido, cria uma transição, inicia
	 * e executar a ação de persistir, tudo dando certo realiza o commit no final
	 */
	public void inserir(Usuario usuario) {

		String sql = "insert into USUARIO (cpf, nome, senha) values (?, ?, ?)";

		Connection conexao;
		try {
			conexao = JpaUtil.getConexao();
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setString(1, usuario.getCpf());
			ps.setString(2, usuario.getNome());
			ps.setString(3, usuario.getSenha());
			ps.setString(4, usuario.getEmail());

			ps.execute();
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Metodo alterar, recebe o usuario, criar uma transição, inicia e executa a
	 * ação de merger
	 */
	public void alterar(Usuario usuario) {

		String sql = "UPDATE USUARIO SET nome = ?, senha = ? where cpf = ?";

		Connection conexao;
		try {
			conexao = JpaUtil.getConexao();
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getSenha());
			ps.setString(3, usuario.getCpf());
			ps.setString(4, usuario.getEmail());

			ps.execute();
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void remover(Usuario usuario) {

		String sql = "DELETE FROM USUARIO WHERE cpf = ?";

		Connection conexao;
		try {
			conexao = JpaUtil.getConexao();
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setString(1, usuario.getCpf());

			ps.execute();
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Pesquisar, pesquisar pela chave primaria que seria o cpf
	 */
	public Usuario pesquisar(String cpf) {

		String sql = "select U.CPF, U.NOME, U.SENHA from USUARIO U where cpf = ?";
		
		Usuario usuario = null;
		
		Connection conexao;
		try {
			conexao = JpaUtil.getConexao();
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setString(1, cpf);

			ResultSet res = ps.executeQuery();

			while (res.next()) {
				usuario = new Usuario();
				usuario.setCpf(res.getString("CPF"));
				usuario.setNome(res.getString("NOME"));
				usuario.setSenha(res.getString("SENHA"));
				usuario.setSenha(res.getString("EMAIL"));
			 }
			
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return usuario;
	}

	/**
	 * O metodo listar todos, faz um select * from, porém com o JPA, vc faz a
	 * consulta pelo objeto direto assim from Usuario, que isso é o objeto usuario e
	 * não a tabela
	 */
	public List<Usuario> listarTodos() {

		String sql = "select U.CPF, U.NOME, U.SENHA from USUARIO U";
		
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		Connection conexao;
		try {
			conexao = JpaUtil.getConexao();
			
			PreparedStatement ps = conexao.prepareStatement(sql);

			ResultSet res = ps.executeQuery();

			while (res.next()) {
				
				Usuario usuario = new Usuario();
				usuario.setCpf(res.getString("CPF"));
				usuario.setNome(res.getString("NOME"));
				usuario.setSenha(res.getString("SENHA"));
				usuario.setSenha(res.getString("EMAIL"));
				
				listaUsuarios.add(usuario);
			 }
			
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaUsuarios;

	}

}