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
 * Servlet implementation class Form3ReintegroServletDenegar
 */
@WebServlet("/Form3ReintegroServletDenegar")
public class Form3ReintegroServletDenegar extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nViaje = req.getParameter("nViaje").toString();
		ViajeDAO vdao = ViajeDAOImplementation.getInstance();
		NotificacionDAO ndao = NotificacionDAOImplementation.getInstance();
		Viaje viaje = vdao.read(Integer.parseInt(nViaje));
		viaje.setStatus(7);

		//Email para notificar al empleado que su reintegro ha sido denegado
	    Notificacion notificacion = new Notificacion();
	    String remitente = viaje.getViajero().getSuperior().getEmail();
	    String subject = "TRIP - Reintegro denegado";
	    String msg = viaje.getViajero().getSuperior().getName() + "  " + viaje.getViajero().getSuperior().getEmail() + " ha denegado el reintegro del viaje numero " + viaje.getnViaje();
	    notificacion.setRemitente(remitente);
	    notificacion.setVisto(false);
	    notificacion.setNotificado(viaje.getViajero());
	    notificacion.sendEmail(subject, msg);

	    ndao.create(notificacion);
	 
		vdao.update(viaje);
		resp.sendRedirect( req.getContextPath() + "/HomeEncargadoServlet?email=" + viaje.getViajero().getSuperior().getEmail());
	}

}