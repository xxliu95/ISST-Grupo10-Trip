package es.upm.dit.isst.trip.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import es.upm.dit.isst.trip.dao.NotificacionDAO;
import es.upm.dit.isst.trip.dao.NotificacionDAOImplementation;
import es.upm.dit.isst.trip.dao.ViajeDAO;
import es.upm.dit.isst.trip.dao.ViajeDAOImplementation;
import es.upm.dit.isst.trip.model.Notificacion;
import es.upm.dit.isst.trip.model.Viaje;

/**
 * Servlet implementation class NotificacionVistoServlet
 */
@WebServlet("/NotificacionVistoServlet")
public class NotificacionVistoServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nNotificacion = req.getParameter("nNotificacion");
		NotificacionDAO ndao = NotificacionDAOImplementation.getInstance();
		Notificacion notificacion = ndao.read(Integer.valueOf(nNotificacion));
		notificacion.setVisto(true);
	    
		ndao.update(notificacion);
		
		Subject currentUser = SecurityUtils.getSubject();
		if ( !currentUser.isAuthenticated() ) {
			getServletContext().getRequestDispatcher( "/LoginView.jsp" ).forward( req, resp );
		} else {
			if ( currentUser.hasRole( "admin" ) )
				resp.sendRedirect( req.getContextPath() + "/AdminServlet" );
			else if ( currentUser.hasRole( "employer" ) )
				resp.sendRedirect( req.getContextPath() + "/HomeEncargadoServlet?email=" + currentUser.getPrincipal() );
			else
				resp.sendRedirect( req.getContextPath() + "/HomeServlet?email=" + currentUser.getPrincipal() );
		}
	 }
}
