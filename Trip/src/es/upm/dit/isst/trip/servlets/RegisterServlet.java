package es.upm.dit.isst.trip.servlets;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.trip.dao.EmpleadoDAO;
import es.upm.dit.isst.trip.dao.EmpleadoDAOImplementation;
import es.upm.dit.isst.trip.model.Empleado;

@WebServlet({ "/RegisterServlet" })
public class RegisterServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmpleadoDAO edao = EmpleadoDAOImplementation.getInstance();
		Collection<Empleado> Responsables = edao.readAll();
		if (Responsables != null) {
			try {
				for (Empleado empleado : Responsables) {
					if (!empleado.isResponsable()) {
						Responsables.remove(empleado);
					}
				} 
			} catch (Exception e) {}
			
		}
		req.setAttribute("responsable_list", Responsables);
		getServletContext().getRequestDispatcher( "/RegisterView.jsp" ).forward( req, resp );
	}
}
