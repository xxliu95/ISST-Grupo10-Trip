package es.upm.dit.isst.trip.servlets;

import java.io.IOException;
import java.util.ArrayList;
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
import es.upm.dit.isst.trip.dao.NotificacionDAO;
import es.upm.dit.isst.trip.dao.NotificacionDAOImplementation;
import es.upm.dit.isst.trip.dao.ViajeDAO;
import es.upm.dit.isst.trip.dao.ViajeDAOImplementation;
import es.upm.dit.isst.trip.model.Empleado;
import es.upm.dit.isst.trip.model.Notificacion;


@WebServlet({ "/HomeServlet" })
public class HomeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmpleadoDAO edao =  EmpleadoDAOImplementation.getInstance();
		NotificacionDAO ndao = NotificacionDAOImplementation.getInstance();
		String email = req.getParameter("email");
		Empleado empleado = edao.read(email);
		Collection<Notificacion> notificaciones = ndao.readAll();
		
		ArrayList<Notificacion> notSinLeer = new ArrayList<Notificacion>();
		
		for (Notificacion notif: notificaciones) {
			if (!notif.isVisto() && notif.getNotificado().getEmail().equals(email)) {
				notSinLeer.add(notif);
			}
		}
		
		req.setAttribute("notificaciones", notSinLeer);
		req.setAttribute("empleado", empleado);
		getServletContext().getRequestDispatcher( "/Home.jsp" ).forward( req, resp );
		
	}

}
