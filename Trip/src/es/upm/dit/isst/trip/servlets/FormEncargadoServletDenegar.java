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

@WebServlet("/FormEncargadoServletDenegar")
public class FormEncargadoServletDenegar extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nViaje = req.getParameter("nViaje").toString();
		ViajeDAO vdao = ViajeDAOImplementation.getInstance();
		NotificacionDAO ndao = NotificacionDAOImplementation.getInstance();
		Viaje viaje = vdao.read(Integer.parseInt(nViaje));
		String email = req.getParameter("email").toString();
		
		//Email para notificar al empleado de que su viaje ha sido denegado
	    Notificacion notificacion = new Notificacion();
	    String remitente = viaje.getViajero().getSuperior().getEmail();
	    String subject = "TRIP - Viaje denegado";
	    String msg = viaje.getViajero().getSuperior().getName() + "  " + remitente + " ha denegado tu nuevo viaje";
	    notificacion.setRemitente(remitente);
	    notificacion.setVisto(false);
	    notificacion.setNotificado(viaje.getViajero());
	    notificacion.sendEmail(subject, msg);

	    ndao.create(notificacion);
	    
		vdao.delete(viaje);
		resp.sendRedirect( req.getContextPath() + "/HomeEncargadoServlet?email=" + email);
	}
}
