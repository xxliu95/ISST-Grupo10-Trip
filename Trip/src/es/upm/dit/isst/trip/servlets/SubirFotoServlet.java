package es.upm.dit.isst.trip.servlets;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import es.upm.dit.isst.trip.dao.EmpleadoDAO;
import es.upm.dit.isst.trip.dao.EmpleadoDAOImplementation;
import es.upm.dit.isst.trip.model.Empleado;

/**
 * Servlet implementation class SubirFotoServlet
 */

@WebServlet("/SubirFotoServlet")
@MultipartConfig 
public class SubirFotoServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		EmpleadoDAO edao = EmpleadoDAOImplementation.getInstance();
		Empleado empleado = edao.read(email); //cojo el email
		//imports java.io 
		Part filePart = req.getPart("file");
		InputStream fileContent = filePart.getInputStream();
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		byte[] buffer = new byte[10240];
		for (int length = 0; (length = fileContent.read(buffer)) > 0;) output.write(buffer, 0, length);
		empleado.setFoto(output.toByteArray());
		edao.update(empleado);
		
		if(empleado.isResponsable()) {
			resp.sendRedirect( req.getContextPath() + "/HomeEncargadoServlet?email="+email);
		}else
		resp.sendRedirect( req.getContextPath() + "/HomeServlet?email="+email);
	}

}
