package es.upm.dit.isst.trip.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.trip.dao.ViajeDAO;
import es.upm.dit.isst.trip.dao.ViajeDAOImplementation;
import es.upm.dit.isst.trip.model.Viaje;

/**
 * Servlet implementation class Form2EncargadoServlet
 */
@WebServlet("/Form2EncargadoServlet")
public class Form2EncargadoServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//todo este rollo porque read es int y getParameter solo acepta String o null
		String nViaje = req.getParameter("nViaje").toString();
		ViajeDAO vdao = ViajeDAOImplementation.getInstance();
		Viaje viaje = vdao.read(Integer.parseInt(nViaje));
		viaje.setStatus(2);
		vdao.update(viaje);
		resp.sendRedirect( req.getContextPath() + "/HomeEncargadoServlet?email=" + viaje.getViajero().getSuperior().getEmail());
	}
}
