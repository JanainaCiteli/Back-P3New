package com.alterdata.serratec.pack3.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Compensacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(value = "Id da compensação de horas")
	private Long idCompensacao;

	@ApiModelProperty(value = "Total de horas da compensação")
	private double totalCompensacao;

	@ApiModelProperty(value = "Dia, mês e ano da compensação")
	private LocalDate dataCompensacao;

	@ApiModelProperty(value = "Horário de início da compensação")
	private String horaEntrada;

	@ApiModelProperty(value = "Horário de saída da compensação")
	private String horaSaida;

	// Colaborador
	@ManyToOne
	@JoinColumn(name = "id_colaborador")
	@JsonIgnoreProperties("compensacoes")
	private Colaborador colaborador;

	public Compensacao() {
		super();
	}

	public Long getIdCompensacao() {
		return idCompensacao;
	}

	public void setIdCompensacao(Long idCompensacao) {
		this.idCompensacao = idCompensacao;
	}

	public double getTotalCompensacao() {
		return totalCompensacao;
	}

	public void setTotalCompensacao(double totalCompensacao) {
		this.totalCompensacao = totalCompensacao;
	}

	public LocalDate getDataCompensacao() {
		return dataCompensacao;
	}

	public void setDataCompensacao(LocalDate dataCompensacao) {
		this.dataCompensacao = dataCompensacao;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public String getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public String getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}

}
