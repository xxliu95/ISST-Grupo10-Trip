package es.upm.dit.isst.trip.servlets;

import java.io.IOException;
import java.util.Collection;

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

@WebServlet({ "/HomeEncargadoServlet" })
public class HomeEncargadoServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		EmpleadoDAO edao =  EmpleadoDAOImplementation.getInstance();
		Empleado responsable = edao.read(email);
		Collection<Empleado> subordinados = responsable.getSubordinados();
		req.setAttribute("subordinados", subordinados);
		Collection<Viaje> viajes ;
		ViajeDAO vdao = ViajeDAOImplementation.getInstance();
		//falla aqui
		for (Empleado empleado : subordinados) {
			viajes = vdao.read(empleado.getEmail());
		}
		req.setAttribute("viajesResponsable",);
		getServletContext().getRequestDispatcher( "/HomeEncargado.jsp" ).forward( req, resp );
	}

}
