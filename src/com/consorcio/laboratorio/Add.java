package com.consorcio.laboratorio;

import com.consorcio.entidad.Laboratorio;
import com.consorcio.modelo.ModeloLaboratorio;

public class Add {
	public static void main(String[] args) {
		Laboratorio laboratorio = new Laboratorio();
		laboratorio.setDesLaboratorio("Laboratorio2");
		ModeloLaboratorio modeloLaboratorio = new ModeloLaboratorio();
		modeloLaboratorio.addLaboratorio(laboratorio);
		
		laboratorio = new Laboratorio();
		laboratorio.setDesLaboratorio("Laboratorio3");
		int salida = modeloLaboratorio.registrar(laboratorio);
		if (salida < 1) {
			System.out.println("Ocurrió un error al instar el laboratorio");
		}
	}
}
