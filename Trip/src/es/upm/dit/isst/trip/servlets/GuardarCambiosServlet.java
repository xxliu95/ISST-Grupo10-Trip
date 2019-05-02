package es.upm.dit.isst.trip.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.trip.dao.ViajeDAO;
import es.upm.dit.isst.trip.dao.ViajeDAOImplementation;
import es.upm.dit.isst.trip.model.Viaje;

/**
 * Servlet implementation class GuardarCambiosServlet
 */

@WebServlet("/GuardarCambiosServlet")
public class GuardarCambiosServlet extends HttpServlet{

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int nViaje = Integer.parseInt(req.getParameter("nViaje"));
		
		String email = req.getParameter("email");
		double presupuesto = Double.parseDouble(req.getParameter("presupuesto"));
		String destino = req.getParameter("destino");
		String descripcion = req.getParameter("descripcion");
		
		Date finicio = null;
		try {
			finicio = new SimpleDateFormat("yyyy-MM-dd").parse(req.getParameter( "finicio" ));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date ffin = null;
		try {
			ffin = new SimpleDateFormat("yyyy-MM-dd").parse(req.getParameter( "ffin" ));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ViajeDAO vdao = ViajeDAOImplementation.getInstance();
		Viaje viaje = vdao.read(nViaje);
		
		viaje.setDescripcion(descripcion);
		viaje.setDestino(destino);
		viaje.setPresupuesto(presupuesto);
		viaje.setFinicio(finicio);
		viaje.setFfin(ffin);
		
		vdao.update(viaje);
		
		resp.sendRedirect( req.getContextPath() + "/HomeServlet?email=" + viaje.getViajero().getEmail() );
	}
}
