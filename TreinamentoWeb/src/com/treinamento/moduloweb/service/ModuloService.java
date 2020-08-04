package com.treinamento.moduloweb.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.treinamento.moduloweb.dao.ConexaoMySqlDAO;
import com.treinamento.moduloweb.dao.ModuloDAO;
import com.treinamento.moduloweb.modulo.Modulo;


public class ModuloService {
	
	ModuloDAO dao = null;
	Connection conn = null;
	
	public ModuloService() {
		ConexaoMySqlDAO conexaoMySql = new ConexaoMySqlDAO();
		
		try {
			conn = conexaoMySql.obterConexao();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		dao = new ModuloDAO(conn);
	}
	
	public List<Modulo> listarModulo(){
		List<Modulo> listaModulo = dao.consultarModulos();
		
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaModulo;
	}
	
}
