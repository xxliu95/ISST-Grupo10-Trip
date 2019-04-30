package es.upm.dit.isst.trip.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.trip.dao.EmpleadoDAO;
import es.upm.dit.isst.trip.dao.EmpleadoDAOImplementation;
import es.upm.dit.isst.trip.model.Empleado;

/**
 * Servlet implementation class SetResponsableServlet
 */

@WebServlet("/SetResponsableServlet")
public class SetResponsableServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter( "email" );
		EmpleadoDAO edao = EmpleadoDAOImplementation.getInstance();
		
		Empleado empleado = edao.read(email);
		
		empleado.setResponsable(true);
		
		edao.update(empleado);
		
		resp.sendRedirect( req.getContextPath() + "/AdminServlet" );
	}
}
