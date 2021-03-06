package es.upm.dit.isst.trip.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.crypto.hash.Sha256Hash;

import es.upm.dit.isst.trip.dao.EmpleadoDAO;
import es.upm.dit.isst.trip.dao.EmpleadoDAOImplementation;
import es.upm.dit.isst.trip.model.Empleado;

/**
 * Servlet implementation class CreateEmpleadoServlet
 */

@WebServlet("/CreateEmpleadoServlet")
public class CreateEmpleadoServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter( "name" );
		String password = req.getParameter( "password" );
		String email = req.getParameter( "email" );
		String id =req.getParameter( "id" );
		String superior = req.getParameter( "superior" );
		
		EmpleadoDAO edao = EmpleadoDAOImplementation.getInstance();
		Empleado sup = edao.read( superior );
		
		Empleado empleado = new Empleado();
		empleado.setName( name );
		empleado.setEmail( email );
		empleado.setId( id );
		empleado.setSuperior( sup );
		empleado.setResponsable( false );

		empleado.setPassword( new Sha256Hash( password ).toString() );
		
		edao.create( empleado );
		
		resp.sendRedirect( req.getContextPath() + "/LoginServlet" );
	}
}
