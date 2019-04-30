package es.upm.dit.isst.trip.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

import es.upm.dit.isst.trip.dao.EmpleadoDAO;
import es.upm.dit.isst.trip.dao.EmpleadoDAOImplementation;
import es.upm.dit.isst.trip.dao.ViajeDAO;
import es.upm.dit.isst.trip.dao.ViajeDAOImplementation;
import es.upm.dit.isst.trip.model.Empleado;
import es.upm.dit.isst.trip.model.Viaje;

/**
 * Servlet implementation class ViajeServlet
 */

@WebServlet({ "/ViajeServlet" })
public class ViajeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ViajeDAO vdao =  ViajeDAOImplementation.getInstance();
		String nViaje = req.getParameter("nViaje");
		Viaje viaje = vdao.read(Integer.valueOf(nViaje));
		req.setAttribute("viaje", viaje);
		getServletContext().getRequestDispatcher( "/ViajeView.jsp" ).forward( req, resp );
	
	}

}
