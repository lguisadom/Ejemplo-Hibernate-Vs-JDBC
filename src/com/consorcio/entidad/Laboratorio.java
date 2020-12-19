package com.consorcio.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_laboratorio")
public class Laboratorio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_lab")
	private int codLaboratorio;

	@Column(name = "des_lab")
	private String desLaboratorio;

	public int getCodLaboratorio() {
		return codLaboratorio;
	}

	public void setCodLaboratorio(int codLaboratorio) {
		this.codLaboratorio = codLaboratorio;
	}

	public String getDesLaboratorio() {
		return desLaboratorio;
	}

	public void setDesLaboratorio(String desLaboratorio) {
		this.desLaboratorio = desLaboratorio;
	}

}
