package sistemasdeinformacao.db.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="EMAIL")
public class Email {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="enderecoOrigem")
	private Usuario enderecoOrigem;
	
	@ManyToOne
	@JoinColumn(name="enderecoDestino")
	private Usuario enderecoDestino;

	@Column(name="ASSUNTO")
	private String assunto;
	
	@Column(name="DATA_ENVIO")
	private Date dataEnvio;
	
	@Column(name="CONTEUDO")
	private String conteudo;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Usuario getEnderecoRemetente() {
		return enderecoOrigem;
	}

	public void setEnderecoRemetente(Usuario enderecoRemetente) {
		this.enderecoOrigem = enderecoRemetente;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public Date getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(Date dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Usuario getEnderecoDestino() {
		return enderecoDestino;
	}

	public void setEnderecoDestino(Usuario enderecoDestino) {
		this.enderecoDestino = enderecoDestino;
	}
}
