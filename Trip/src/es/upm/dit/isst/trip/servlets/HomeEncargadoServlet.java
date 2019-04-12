package es.upm.dit.isst.trip.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.trip.dao.EmpleadoDAO;
import es.upm.dit.isst.trip.dao.EmpleadoDAOImplementation;
import es.upm.dit.isst.trip.dao.ViajeDAO;
import es.upm.dit.isst.trip.dao.ViajeDAOImplementation;
import es.upm.dit.isst.trip.model.Empleado;
import es.upm.dit.isst.trip.model.Viaje;

@WebServlet({ "/HomeEncargadoServlet" })
public class HomeEncargadoServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		EmpleadoDAO edao =  EmpleadoDAOImplementation.getInstance();
		Empleado responsable = edao.read(email);
		Collection<Empleado> subordinados = responsable.getSubordinados();
		/* comienzo: eliminar subordinados repetidos */
		Set<Empleado> listWithoutDuplicates = new LinkedHashSet<Empleado>(subordinados);
	    subordinados.clear();
	    subordinados.addAll(listWithoutDuplicates);
	    /* fin */
	    //parametro para sacar los empleados
		req.setAttribute("subordinados", subordinados);
		ViajeDAO vdao = ViajeDAOImplementation.getInstance();

		Collection<Viaje> viajes = new ArrayList<Viaje>();

		for (Empleado empleado : subordinados) {
				viajes.addAll(empleado.getViajes());
		}
		//parametro para sacar las listas de los empleados
		req.setAttribute("viajesEmpleados", viajes);
		getServletContext().getRequestDispatcher( "/HomeEncargado.jsp" ).forward( req, resp );
	}
	
}

