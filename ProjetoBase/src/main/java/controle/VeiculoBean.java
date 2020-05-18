package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import dao.Veiculodao;
import dao.VeiculodaoImpl;
import entidade.Veiculo;

@ManagedBean(name = "VeiculoBean")
@SessionScoped
public class VeiculoBean {
	

	private String txtPlacauf;
	
	

private Veiculo veiculo;
private List<Veiculo> listaVeiculo;
private Veiculodao veiculodao;
private String msgcadastroveiculo;







		 
public VeiculoBean() {
	this.listaVeiculo = new ArrayList<Veiculo>();
	this.veiculo = new Veiculo();
	this.veiculodao = new VeiculodaoImpl();
	
}



//Metodo Pesquisar 



public void pesquisa() {
	
boolean cadastrou = false;

this.listaVeiculo = this.veiculodao.listarTodos();



for (Veiculo veiculoPesquisa : listaVeiculo) {

if(veiculoPesquisa.getPlacauf().equals(this.txtPlacauf)) {
	
	cadastrou = true;
}

if(cadastrou) {
}else {
	
}
	
	}

}


	// Metodo salvar
public void criarVeiculo() {



	Veiculo novo = new Veiculo(); 
	
	novo.setPlacauf(this.veiculo.getPlacauf());
	novo.setChassi(this.veiculo.getChassi());
	novo.setTipo(this.veiculo.getTipo());
	novo.setCombustivel(this.veiculo.getCombustivel());
	novo.setMarcamodelo(this.veiculo.getMarcamodelo());
	novo.setAnofab(this.veiculo.getAnofab());
	novo.setAnomod(this.veiculo.getAnomod());
	novo.setCor(this.veiculo.getCor());
	


	boolean cadastrado = false;
	
	this.listaVeiculo = this.veiculodao.listarTodos();
	
	for (Veiculo veiculoPesquisa : listaVeiculo) {
		if (veiculoPesquisa.getPlacauf().equals(this.veiculo.getPlacauf())) {
			cadastrado = true;
		}
	}

		
		
		if(cadastrado) {
			FacesContext.getCurrentInstance()
				.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!!!! Placauf Cadastrado!", "Placauf já existe!!!"));
		
	    cadastrado = true;
	    
	
	
	}else {
		

		this.veiculodao.inserir(novo);
		
		this.veiculo = new Veiculo();	
	}
}
	





public String getTxtPlacauf() {
	return txtPlacauf;
}



public void setTxtPlacauf(String txtPlacauf) {
	this.txtPlacauf = txtPlacauf;
}



public Veiculo getVeiculo() {
	return veiculo;
}



public void setVeiculo(Veiculo veiculo) {
	this.veiculo = veiculo;
}



public List<Veiculo> getListaVeiculo() {
	return listaVeiculo;
}



public void setListaVeiculo(List<Veiculo> listaVeiculo) {
	this.listaVeiculo = listaVeiculo;
}



public Veiculodao getVeiculodao() {
	return veiculodao;
}



public void setVeiculodao(Veiculodao veiculodao) {
	this.veiculodao = veiculodao;
}



public String getMsgcadastroveiculo() {
	return msgcadastroveiculo;
}



public void setMsgcadastroveiculo(String msgcadastroveiculo) {
	this.msgcadastroveiculo = msgcadastroveiculo;
}








}		