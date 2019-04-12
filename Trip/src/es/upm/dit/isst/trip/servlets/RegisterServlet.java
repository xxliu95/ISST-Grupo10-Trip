package es.upm.dit.isst.trip.servlets;

import java.io.IOException;
import java.util.ArrayList;
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
	@SuppressWarnings("null")
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmpleadoDAO edao = EmpleadoDAOImplementation.getInstance();
		Collection<Empleado> empleados = edao.readAll();
		Collection<Empleado> responsables = new ArrayList<Empleado>();
		if (empleados != null) {
			try {
				for (Empleado empleado : empleados) {
					if (empleado.isResponsable()) {
						responsables.add(empleado);
					}
				} 
			} catch (Exception e) {}
			
		}
		req.setAttribute("responsable_list", responsables);
		getServletContext().getRequestDispatcher( "/RegisterView.jsp" ).forward( req, resp );
	}
}
