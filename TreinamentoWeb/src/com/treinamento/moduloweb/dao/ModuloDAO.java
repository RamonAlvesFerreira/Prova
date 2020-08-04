package com.treinamento.moduloweb.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.treinamento.moduloweb.modulo.Modulo;

public class ModuloDAO {
	
	Connection conn;
	

	private String SQL_LISTAR_TODAS = "select DS_NOME, DS_INSTRUTOR_TITULAR, DS_INSTRUTOR_AUXILIAR, DT_INICIO from TB_MODULO";

	
	public ModuloDAO(Connection conn) {
		this.conn = conn;
	}
	
	
	public List<Modulo> consultarModulos() {
		
		List<Modulo> listaModulos = new ArrayList();
		
		try (Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(SQL_LISTAR_TODAS);) {

		while (rs.next()) {
			Modulo modulo = new Modulo();
			modulo.setNm_modulo(rs.getString("DS_NOME"));
			modulo.setNm_instrutor1(rs.getString("DS_INSTRUTOR_TITULAR"));
			modulo.setNm_instrutor2(rs.getString("DS_INSTRUTOR_AUXILIAR"));
			modulo.setDt_inicio(rs.getString("DT_INICIO"));
	
			listaModulos.add(modulo);
		}
	
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		//Adição Manual Modulo
		//Modulo modulo1 = new Modulo();
		//modulo1.setNm_modulo("Nivelamento");
		//modulo1.setNr_instrutor1("Ivo");
		//modulo1.setNr_instrutor2("Leonardo");
		//modulo1.setDt_inicio("20/06/2020");

		//listaClientes.add(modulo1);
		
		//Modulo modulo2 = new Modulo();
		//modulo2.setNm_modulo("HTML/CSS");
		//modulo2.setNr_instrutor1("Jonas");
		//modulo2.setNr_instrutor2("Leonardo");
		//modulo2.setDt_inicio("27/06/2020");

		//listaClientes.add(modulo2);
		
		//Modulo modulo3 = new Modulo();
		//modulo3.setNm_modulo("JavaScript");
		//modulo3.setNr_instrutor1("Jonas");
		//modulo3.setNr_instrutor2("Leonardo");
		//modulo3.setDt_inicio("02/07/2020");

		//listaClientes.add(modulo3);
		
		//Modulo modulo4 = new Modulo();
		//modulo4.setNm_modulo("POO");
		//modulo4.setNr_instrutor1("Ivo");
		//modulo4.setNr_instrutor2("Leonardo");
		//modulo4.setDt_inicio("11/07/2020");
		//
		//listaClientes.add(modulo4);
		
		//Modulo modulo5 = new Modulo();
		//modulo5.setNm_modulo("Java");
		//modulo5.setNr_instrutor1("Leonardo");
		//modulo5.setNr_instrutor2("Ivo");
		//modulo5.setDt_inicio("18/07/2020");

		//listaClientes.add(modulo5);
		
		//Modulo modulo6 = new Modulo();
		//modulo6.setNm_modulo("Banco");
		//modulo6.setNr_instrutor1("Leonardo");
		//modulo6.setNr_instrutor2("Fabio");
		//modulo6.setDt_inicio("24/07/2020");

		//listaClientes.add(modulo6);
		
		//Modulo modulo7 = new Modulo();
		//modulo7.setNm_modulo("Aplicação Web");
		//modulo7.setNr_instrutor1("Fabio");
		//modulo7.setNr_instrutor2("Ivo");
		//modulo7.setDt_inicio("30/07/2020");

		//listaClientes.add(modulo7);
		
		//Modulo modulo8 = new Modulo();
		//modulo8.setNm_modulo("Spring Boot");
		//modulo8.setNr_instrutor1("Fabio");
		//modulo8.setNr_instrutor2("Ivo");
		//modulo8.setDt_inicio("05/08/2020");

		//listaClientes.add(modulo8);
		
		
		//Modulo modulo9 = new Modulo();
		//modulo9.setNm_modulo("Angular");
		//modulo9.setNr_instrutor1("Jonas");
		//modulo9.setNr_instrutor2("Fabio");
		//modulo9.setDt_inicio("13/08/2020");

		//listaClientes.add(modulo9);
		
		return listaModulos;
		
	}


}
