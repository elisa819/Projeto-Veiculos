package entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBVEICULO")
public class Veiculo {


	@Id
	@Column(name="PLACAUF", nullable = false)
	private String placauf;
	
	@Column(name="CHASSI", nullable = false)
	private String chassi;
	
	@Column(name="TIPO", nullable = false)
	private String tipo;
	
	@Column(name="COMBUSTIVEL", nullable = false)
	private String combustivel;
	
	@Column(name="MARCAMODELO", nullable = false)
	private String marcamodelo;
	
	@Column(name="ANOFAB", nullable = false)
	private String anofab;
	
	@Column(name="ANOMOD", nullable = false)
	private String anomod;
	
	@Column(name="COR", nullable = false)
	private String cor;
	
	
	
	

	/// Getters e Setters

	public String getPlacauf() {
		return placauf;
	}

	public void setPlacauf(String placauf) {
		this.placauf = placauf;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public String getMarcamodelo() {
		return marcamodelo;
	}

	public void setMarcamodelo(String marcamodelo) {
		this.marcamodelo = marcamodelo;
	}

	public String getAnofab() {
		return anofab;
	}

	public void setAnofab(String anofab) {
		this.anofab = anofab;
	}

	public String getAnomod() {
		return anomod;
	}

	public void setAnomod(String anomod) {
		this.anomod = anomod;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	

	

	
	
	
}





	