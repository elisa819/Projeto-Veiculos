package entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TBPECAS")
public class Peca_acessorio {

	@Id
	@Column(name="ID", nullable = false)
	@GeneratedValue(generator = "V_PECA")
	@SequenceGenerator(name = "V_PECA", sequenceName = "P_PECA", allocationSize = 1)
	private Long id;
	
	@Column(name="CODIGO", nullable = false)
	private String codigo;
	
	@Column(name="DESCRICAO", nullable = false)
	private String descricao;
	
	@Column(name="CATEGORIA", nullable = false)
	private String categoria;
	
	
	@Column(name="FABRICANTE", nullable = false)
	private String fabricante;
	
	@Column(name="PLACAVEICULO", nullable = false)
	private String placaveiculo;
	
	
	
	///Getter e Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getPlacaveiculo() {
		return placaveiculo;
	}

	public void setPlacaveiculo(String placaveiculo) {
		this.placaveiculo = placaveiculo;
	}

	
	
	
	
	}

	
	

	
	
