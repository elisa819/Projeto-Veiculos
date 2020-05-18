
package controle;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.Pecdao;
import dao.PecdaoImpl;
import entidade.Peca_acessorio;

@ManagedBean(name= "PecBean")
@SessionScoped

public class PecBean {
	
	private Peca_acessorio peca_acessorio;
	
	private Pecdao pecdao;


	
	
	
	
	public PecBean() {

		this.pecdao = new PecdaoImpl();
		
		this.peca_acessorio = new Peca_acessorio();
		
	}

	
	public String fechar() {
		return "index.xhtml";
	}
	
	
	public void salvar() {

		this.pecdao.inserir(this.peca_acessorio);
		this.peca_acessorio = new Peca_acessorio();
		
	}





	public Peca_acessorio getPeca_acessorio() {
		return peca_acessorio;
	}





	public void setPeca_acessorio(Peca_acessorio peca_acessorio) {
		this.peca_acessorio = peca_acessorio;
	}





	public Pecdao getPecdao() {
		return pecdao;
	}





	public void setPecdao(Pecdao pecdao) {
		this.pecdao = pecdao;
	}


}
