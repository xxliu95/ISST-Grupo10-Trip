package es.upm.dit.isst.trip.servlets;
import java.util.Date;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.crypto.hash.Sha256Hash;

import es.upm.dit.isst.trip.dao.EmpleadoDAO;
import es.upm.dit.isst.trip.dao.EmpleadoDAOImplementation;
import es.upm.dit.isst.trip.dao.ViajeDAO;
import es.upm.dit.isst.trip.dao.ViajeDAOImplementation;
import es.upm.dit.isst.trip.model.Empleado;
import es.upm.dit.isst.trip.model.Viaje;

import java.text.ParseException;
import java.text.SimpleDateFormat;


@WebServlet("/CrearViajeServlet")
public class CrearViajeServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String descripcion = req.getParameter( "descripcion" );
		Date finicio = null;
		try {
			finicio = new SimpleDateFormat("dd/MM/yyyy").parse(req.getParameter( "finicio" ));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date ffin = null;
		try {
			ffin = new SimpleDateFormat("dd/MM/yyyy").parse(req.getParameter( "ffin" ));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double presupuesto = Double.parseDouble(req.getParameter( "presupuesto" ));
		String email = req.getParameter( "email" );
		
		ViajeDAO vdao = ViajeDAOImplementation.getInstance();
		
		EmpleadoDAO edao = EmpleadoDAOImplementation.getInstance();
		Empleado empleado = edao.read(email);
		
		Viaje viaje = new Viaje();
		
	    viaje.setStatus(1);

		viaje.setDescripcion( descripcion );
		viaje.setFinicio( finicio );
		viaje.setFfin( ffin );		
		viaje.setPresupuesto( presupuesto );
		viaje.setEmpleado(empleado);
		viaje.setnViaje(1);
		
		vdao.create( viaje );
		
		resp.sendRedirect( req.getContextPath() + "/HomeServlet" );
	}
}