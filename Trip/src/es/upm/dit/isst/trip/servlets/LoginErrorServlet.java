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

@WebServlet({ "/LoginErrorServlet" })
public class LoginErrorServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String msg = "Usuario o contraseña incorrecta";
		req.setAttribute("msg", msg);
		getServletContext().getRequestDispatcher( "/LoginView.jsp" ).forward( req, resp );
	}
}
