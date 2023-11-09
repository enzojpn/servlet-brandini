package br.com.brandini;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
  
@WebServlet("/helloWorld")
public class HelloWorld extends HttpServlet{
  
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String name = request.getParameter("name").trim();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h2>Hello " + name + "</h2>");
		out.close();
	}

	
	
	
}
