package es.upm.dit.isst.trip.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.trip.dao.NotificacionDAO;
import es.upm.dit.isst.trip.dao.NotificacionDAOImplementation;
import es.upm.dit.isst.trip.dao.ViajeDAO;
import es.upm.dit.isst.trip.dao.ViajeDAOImplementation;
import es.upm.dit.isst.trip.model.Notificacion;
import es.upm.dit.isst.trip.model.Viaje;

/**
 * Servlet implementation class FormEncargadoServlet
 */
@WebServlet("/FormEncargadoServlet")
public class FormEncargadoServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nViaje = req.getParameter("nViaje").toString();
		ViajeDAO vdao = ViajeDAOImplementation.getInstance();
		NotificacionDAO ndao = NotificacionDAOImplementation.getInstance();
		Viaje viaje = vdao.read(Integer.parseInt(nViaje));
		viaje.setStatus(2);
		
		//Email para notificar al empleada de que su viaje ha sido aceptado
	    Notificacion notificacion = new Notificacion();
	    String remitente = viaje.getViajero().getSuperior().getEmail();
	    String subject = "TRIP - Viaje aceptado";
	    String msg = viaje.getViajero().getSuperior().getName() + "  " + remitente + " ha aceptado tu nuevo viaje";
	    notificacion.setRemitente(remitente);
	    notificacion.setVisto(false);
	    notificacion.setNotificado(viaje.getViajero());
	    notificacion.sendEmail(subject, msg);

	    ndao.create(notificacion);
	    
		vdao.update(viaje);
		resp.sendRedirect( req.getContextPath() + "/HomeEncargadoServlet?email=" + viaje.getViajero().getSuperior().getEmail());
	}
}
