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
 * Servlet implementation class ReintegroServlet
 */
@WebServlet("/Form4ReintegroServlet")
public class Form4ReintegroServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nViaje = req.getParameter("nViaje").toString();
		ViajeDAO vdao = ViajeDAOImplementation.getInstance();
		NotificacionDAO ndao = NotificacionDAOImplementation.getInstance();
		Viaje viaje = vdao.read(Integer.parseInt(nViaje));
		viaje.setStatus(5);
		
		//Email para notificar al encargado
	    Notificacion notificacion = new Notificacion();
	    String destinatario = viaje.getEmpleado().getEmail();
	    String subject = "TRIP - Reintegro aceptado por OCG";
	    String msg = "El OGC ha aceptado el reintegro del viaje numero " + viaje.getnViaje();
	    notificacion.setDestinatario(destinatario);
	    notificacion.setVisto(false);
	    notificacion.sendEmail(subject, msg);
	    notificacion.setNotificado(viaje.getViajero());
	    	    
	    ndao.create(notificacion);
	    
		vdao.update(viaje);
		resp.sendRedirect( req.getContextPath() + "/AdminServlet");
	}

}