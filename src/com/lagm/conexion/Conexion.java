package com.lagm.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	public static final String CONTROLADOR = "com.mysql.jdbc.Driver";
	public static final String USER = "root";
	public static final String PASSWORD = "mysql";
	public static final String URL = "jdbc:mysql://localhost:3306/farmacia_2018";
	
	static  {
		try {
			Class.forName(CONTROLADOR);
			System.out.println("Driver OK");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConexion() {
		Connection cn = null;
		
		try {
			cn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Conexión OK");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cn;
	}
}
