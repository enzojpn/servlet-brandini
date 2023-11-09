package br.com.brandini;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lista")
public class ListaServlet extends HttpServlet {
	 
		private static final long serialVersionUID = 1L;

		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			 
			List<String> nomes = new ArrayList<>();
			nomes.add("Vini ");
			nomes.add("Carlos Brandinis");
			nomes.add("Paladino");
			nomes.add("Uzum");
			nomes.add("Bruno");
			
			request.setAttribute("nomes", nomes);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/lista.jsp");
			dispatcher.forward(request, response);
		}

	
}
