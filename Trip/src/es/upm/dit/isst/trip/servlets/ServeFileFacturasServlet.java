package es.upm.dit.isst.trip.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.trip.dao.EmpleadoDAO;
import es.upm.dit.isst.trip.dao.EmpleadoDAOImplementation;
import es.upm.dit.isst.trip.dao.FacturaDAO;
import es.upm.dit.isst.trip.dao.FacturaDAOImplementation;
import es.upm.dit.isst.trip.model.Empleado;
import es.upm.dit.isst.trip.model.Factura;

/**
 * Servlet implementation class ServeFileFacturasServlet
 */

@WebServlet("/ServeFileFacturasServlet")
public class ServeFileFacturasServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nFactura = req.getParameter("nFactura");
		FacturaDAO fdao = FacturaDAOImplementation.getInstance();
		Factura factura = fdao.read(Integer.valueOf(nFactura)); //cojo el email
		resp.setContentLength(factura.getDocumento().length);
		resp.getOutputStream().write(factura.getDocumento());
	
	}

}
