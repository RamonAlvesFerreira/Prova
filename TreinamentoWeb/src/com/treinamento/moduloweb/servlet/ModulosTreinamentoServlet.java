package com.treinamento.moduloweb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.treinamento.moduloweb.modulo.Modulo;
import com.treinamento.moduloweb.service.ModuloService;


@WebServlet("/modulos")
public class ModulosTreinamentoServlet extends HttpServlet{
	
	public ModulosTreinamentoServlet() {
		System.out.println("Iniciando a nosssa servlet...");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		ModuloService service = new ModuloService();
		List<Modulo> listaModulos = service.listarModulo();
		
		req.setAttribute("cliente", listaModulos);
		
		RequestDispatcher rd = req.getRequestDispatcher("/consultar-modulos.jsp");
		rd.forward(req, resp);
	}

	
}
