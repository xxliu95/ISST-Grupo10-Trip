package es.upm.dit.isst.trip.servlets;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import es.upm.dit.isst.trip.dao.FacturaDAO;
import es.upm.dit.isst.trip.dao.FacturaDAOImplementation;
import es.upm.dit.isst.trip.dao.ViajeDAO;
import es.upm.dit.isst.trip.dao.ViajeDAOImplementation;
import es.upm.dit.isst.trip.model.Factura;
import es.upm.dit.isst.trip.model.Viaje;

/**
 * Servlet implementation class SubirFacturaServlet
 */

@WebServlet("/SubirFacturaServlet")
@MultipartConfig 
public class SubirFacturaServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nViaje = req.getParameter("nViaje");
		ViajeDAO vdao = ViajeDAOImplementation.getInstance();
		FacturaDAO fdao = FacturaDAOImplementation.getInstance();
		Factura factura = new Factura();
		
		Viaje viaje = vdao.read(Integer.valueOf(nViaje));
		req.setAttribute("viaje", viaje);
		
		//imports java.io 
		Part filePart = req.getPart("file");
		InputStream fileContent = filePart.getInputStream();
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		byte[] buffer = new byte[10240];
		for (int length = 0; (length = fileContent.read(buffer)) > 0;) output.write(buffer, 0, length);
		
		factura.setViaje(viaje);
		factura.setDocumento(output.toByteArray());
		
		fdao.create(factura);
		
		getServletContext().getRequestDispatcher( "/ViajeView.jsp" ).forward( req, resp );
	}

}
