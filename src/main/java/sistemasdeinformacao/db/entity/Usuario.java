package sistemasdeinformacao.db.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USUARIO")
public class Usuario {

	@Id
	private String endereco;
	
	@Column(name="NOME")
	private String nome;
	
	
	@Column(name="DATA_NASC")
	private Date dataNascimento;
	
	@Column(name="pais")
	private String pais;
	
	@Column(name="ENDERECO_RECUPERACAO")
	private String enderecoRecuperacao;
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEnderecoRecuperacao() {
		return enderecoRecuperacao;
	}

	public void setEnderecoRecuperacao(String enderecoRecuperacao) {
		this.enderecoRecuperacao = enderecoRecuperacao;
	}
}