package com.alterdata.serratec.pack3.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.validation.constraints.NotBlank;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Status {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(value = "Id de status", required = true)
	private Long idStatus;

	@ApiModelProperty(value = "Status atual do colaborador como 'em férias' (verdadeiro ou falso)")
	private boolean ferias;

	@ApiModelProperty(value = "Status atual do colaborador como 'de folga' (verdadeiro ou falso)")
	private boolean folga;

	@ApiModelProperty(value = "Status atual do colaborador como 'ativo' (verdadeiro ou falso)")
	private boolean ativo;

	@ApiModelProperty(value = "Status atual do colaborador como 'compensando horas' (verdadeiro ou falso)")
	private boolean compensandoHoras;

	// Colaborador
	@OneToOne
	@ApiModelProperty(value = "Status do colaborador")
	@JoinColumn(name = "id_colaborador")
	private Colaborador colaborador;

	public Long getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(Long idStatus) {
		this.idStatus = idStatus;
	}

	public boolean isFerias() {
		return ferias;
	}

	public void setFerias(boolean ferias) {
		this.ferias = ferias;
	}

	public boolean isFolga() {
		return folga;
	}

	public void setFolga(boolean folga) {
		this.folga = folga;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public boolean isCompensandoHoras() {
		return compensandoHoras;
	}

	public void setCompensandoHoras(boolean compensandoHoras) {
		this.compensandoHoras = compensandoHoras;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}
	
	

}