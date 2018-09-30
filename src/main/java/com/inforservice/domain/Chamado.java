package com.inforservice.domain;

import java.util.Date;
import java.util.List;

public class Chamado {
  
	private Long id;
	
	private String cliente;
	
	private Date abertura;
	
	private Date fechamento;
	
	private String problema;
	
	private List<Solucao> solucao;
	
	private String tecnico;

	public Chamado() {
		
	}
	
	public Chamado(String cliente) {
		this.cliente = cliente;
	}
	
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getAbertura() {
		return abertura;
	}

	public void setAbertura(Date abertura) {
		this.abertura = abertura;
	}

	public Date getFechamento() {
		return fechamento;
	}

	public void setFechamento(Date fechamento) {
		this.fechamento = fechamento;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	public List<Solucao> getSolucao() {
		return solucao;
	}

	public void setSolucao(List<Solucao> solucao) {
		this.solucao = solucao;
	}

	public String getTecnico() {
		return tecnico;
	}

	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}
	
	
}
