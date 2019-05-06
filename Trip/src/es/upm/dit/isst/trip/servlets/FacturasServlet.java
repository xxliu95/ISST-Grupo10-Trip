package es.upm.dit.isst.trip.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.trip.dao.ViajeDAO;
import es.upm.dit.isst.trip.dao.ViajeDAOImplementation;
import es.upm.dit.isst.trip.model.Viaje;

/**
 * Servlet implementation class FacturasServlet
 */

@WebServlet("/FacturasServlet")
public class FacturasServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ViajeDAO vdao =  ViajeDAOImplementation.getInstance();
		String nViaje = req.getParameter("nViaje");
		Viaje viaje = vdao.read(Integer.valueOf(nViaje));
		req.setAttribute("facturas", viaje.getFacturas());
		req.setAttribute("viaje", viaje);
		getServletContext().getRequestDispatcher( "/FacturasView.jsp" ).forward( req, resp );
	}

}
