package com.consorcio.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.consorcio.entidad.Laboratorio;
import com.lagm.conexion.Conexion;

public class ModeloLaboratorio {
	private EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("PE");
	
	public void addLaboratorio(Laboratorio laboratorio) {
		EntityManager manager = fabrica.createEntityManager();
		try {
			manager.getTransaction().begin();
			manager.persist(laboratorio);
			manager.getTransaction().commit();
		} catch (Exception e) {
			manager.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			manager.close();
			fabrica.close();
		}
	}
	
	public int registrar(Laboratorio laboratorio) {
		int resultado = 0;
		Connection cn = null;
		PreparedStatement pstm = null;
		String sql = "INSERT INTO tb_laboratorio(des_lab) VALUES(?)";
		Conexion conexion = new Conexion();
		
		try {
			cn = conexion.getConexion();
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, laboratorio.getDesLaboratorio());
			resultado = pstm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		return resultado;
	}
}
